package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.XingchengguihuaEntity;
import com.cl.entity.view.XingchengguihuaView;

import com.cl.service.XingchengguihuaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 行程规划
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@RestController
@RequestMapping("/xingchengguihua")
public class XingchengguihuaController {
    @Autowired
    private XingchengguihuaService xingchengguihuaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XingchengguihuaEntity xingchengguihua,
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		xingchengguihua.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
        EntityWrapper<XingchengguihuaEntity> ew = new EntityWrapper<XingchengguihuaEntity>();

		PageUtils page = xingchengguihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xingchengguihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XingchengguihuaEntity xingchengguihua, 
		HttpServletRequest request){
        EntityWrapper<XingchengguihuaEntity> ew = new EntityWrapper<XingchengguihuaEntity>();

		PageUtils page = xingchengguihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xingchengguihua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XingchengguihuaEntity xingchengguihua){
       	EntityWrapper<XingchengguihuaEntity> ew = new EntityWrapper<XingchengguihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xingchengguihua, "xingchengguihua")); 
        return R.ok().put("data", xingchengguihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XingchengguihuaEntity xingchengguihua){
        EntityWrapper< XingchengguihuaEntity> ew = new EntityWrapper< XingchengguihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xingchengguihua, "xingchengguihua")); 
		XingchengguihuaView xingchengguihuaView =  xingchengguihuaService.selectView(ew);
		return R.ok("查询行程规划成功").put("data", xingchengguihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XingchengguihuaEntity xingchengguihua = xingchengguihuaService.selectById(id);
		xingchengguihua = xingchengguihuaService.selectView(new EntityWrapper<XingchengguihuaEntity>().eq("id", id));
        return R.ok().put("data", xingchengguihua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XingchengguihuaEntity xingchengguihua = xingchengguihuaService.selectById(id);
		xingchengguihua = xingchengguihuaService.selectView(new EntityWrapper<XingchengguihuaEntity>().eq("id", id));
        return R.ok().put("data", xingchengguihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XingchengguihuaEntity xingchengguihua, HttpServletRequest request){
    	xingchengguihua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xingchengguihua);
    	xingchengguihua.setUserid((Long)request.getSession().getAttribute("userId"));
        xingchengguihuaService.insert(xingchengguihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XingchengguihuaEntity xingchengguihua, HttpServletRequest request){
    	xingchengguihua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xingchengguihua);
        xingchengguihuaService.insert(xingchengguihua);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XingchengguihuaEntity xingchengguihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xingchengguihua);
        xingchengguihuaService.updateById(xingchengguihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xingchengguihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
