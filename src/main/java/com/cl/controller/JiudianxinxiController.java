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

import com.cl.entity.JiudianxinxiEntity;
import com.cl.entity.view.JiudianxinxiView;

import com.cl.service.JiudianxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 酒店信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@RestController
@RequestMapping("/jiudianxinxi")
public class JiudianxinxiController {
    @Autowired
    private JiudianxinxiService jiudianxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiudianxinxiEntity jiudianxinxi,
                @RequestParam(required = false) Double yiwanjiagestart,
                @RequestParam(required = false) Double yiwanjiageend,
		HttpServletRequest request){
        EntityWrapper<JiudianxinxiEntity> ew = new EntityWrapper<JiudianxinxiEntity>();
                if(yiwanjiagestart!=null) ew.ge("yiwanjiage", yiwanjiagestart);
                if(yiwanjiageend!=null) ew.le("yiwanjiage", yiwanjiageend);

		PageUtils page = jiudianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudianxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiudianxinxiEntity jiudianxinxi, 
                @RequestParam(required = false) Double yiwanjiagestart,
                @RequestParam(required = false) Double yiwanjiageend,
		HttpServletRequest request){
        EntityWrapper<JiudianxinxiEntity> ew = new EntityWrapper<JiudianxinxiEntity>();
                if(yiwanjiagestart!=null) ew.ge("yiwanjiage", yiwanjiagestart);
                if(yiwanjiageend!=null) ew.le("yiwanjiage", yiwanjiageend);

		PageUtils page = jiudianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudianxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiudianxinxiEntity jiudianxinxi){
       	EntityWrapper<JiudianxinxiEntity> ew = new EntityWrapper<JiudianxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiudianxinxi, "jiudianxinxi")); 
        return R.ok().put("data", jiudianxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiudianxinxiEntity jiudianxinxi){
        EntityWrapper< JiudianxinxiEntity> ew = new EntityWrapper< JiudianxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiudianxinxi, "jiudianxinxi")); 
		JiudianxinxiView jiudianxinxiView =  jiudianxinxiService.selectView(ew);
		return R.ok("查询酒店信息成功").put("data", jiudianxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiudianxinxiEntity jiudianxinxi = jiudianxinxiService.selectById(id);
		jiudianxinxi.setClicktime(new Date());
		jiudianxinxiService.updateById(jiudianxinxi);
		jiudianxinxi = jiudianxinxiService.selectView(new EntityWrapper<JiudianxinxiEntity>().eq("id", id));
        return R.ok().put("data", jiudianxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiudianxinxiEntity jiudianxinxi = jiudianxinxiService.selectById(id);
		jiudianxinxi.setClicktime(new Date());
		jiudianxinxiService.updateById(jiudianxinxi);
		jiudianxinxi = jiudianxinxiService.selectView(new EntityWrapper<JiudianxinxiEntity>().eq("id", id));
        return R.ok().put("data", jiudianxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiudianxinxiEntity jiudianxinxi, HttpServletRequest request){
    	jiudianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudianxinxi);
        jiudianxinxiService.insert(jiudianxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiudianxinxiEntity jiudianxinxi, HttpServletRequest request){
    	jiudianxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudianxinxi);
        jiudianxinxiService.insert(jiudianxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiudianxinxiEntity jiudianxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiudianxinxi);
        jiudianxinxiService.updateById(jiudianxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiudianxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JiudianxinxiEntity jiudianxinxi, HttpServletRequest request,String pre){
        EntityWrapper<JiudianxinxiEntity> ew = new EntityWrapper<JiudianxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = jiudianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudianxinxi), params), params));
        return R.ok().put("data", page);
    }








}
