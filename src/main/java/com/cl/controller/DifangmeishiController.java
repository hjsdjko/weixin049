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

import com.cl.entity.DifangmeishiEntity;
import com.cl.entity.view.DifangmeishiView;

import com.cl.service.DifangmeishiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 地方美食
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@RestController
@RequestMapping("/difangmeishi")
public class DifangmeishiController {
    @Autowired
    private DifangmeishiService difangmeishiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DifangmeishiEntity difangmeishi,
		HttpServletRequest request){
        EntityWrapper<DifangmeishiEntity> ew = new EntityWrapper<DifangmeishiEntity>();

		PageUtils page = difangmeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, difangmeishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DifangmeishiEntity difangmeishi, 
		HttpServletRequest request){
        EntityWrapper<DifangmeishiEntity> ew = new EntityWrapper<DifangmeishiEntity>();

		PageUtils page = difangmeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, difangmeishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DifangmeishiEntity difangmeishi){
       	EntityWrapper<DifangmeishiEntity> ew = new EntityWrapper<DifangmeishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( difangmeishi, "difangmeishi")); 
        return R.ok().put("data", difangmeishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DifangmeishiEntity difangmeishi){
        EntityWrapper< DifangmeishiEntity> ew = new EntityWrapper< DifangmeishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( difangmeishi, "difangmeishi")); 
		DifangmeishiView difangmeishiView =  difangmeishiService.selectView(ew);
		return R.ok("查询地方美食成功").put("data", difangmeishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DifangmeishiEntity difangmeishi = difangmeishiService.selectById(id);
		difangmeishi.setClicktime(new Date());
		difangmeishiService.updateById(difangmeishi);
		difangmeishi = difangmeishiService.selectView(new EntityWrapper<DifangmeishiEntity>().eq("id", id));
        return R.ok().put("data", difangmeishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DifangmeishiEntity difangmeishi = difangmeishiService.selectById(id);
		difangmeishi.setClicktime(new Date());
		difangmeishiService.updateById(difangmeishi);
		difangmeishi = difangmeishiService.selectView(new EntityWrapper<DifangmeishiEntity>().eq("id", id));
        return R.ok().put("data", difangmeishi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DifangmeishiEntity difangmeishi, HttpServletRequest request){
    	difangmeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(difangmeishi);
        difangmeishiService.insert(difangmeishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DifangmeishiEntity difangmeishi, HttpServletRequest request){
    	difangmeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(difangmeishi);
        difangmeishiService.insert(difangmeishi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DifangmeishiEntity difangmeishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(difangmeishi);
        difangmeishiService.updateById(difangmeishi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        difangmeishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DifangmeishiEntity difangmeishi, HttpServletRequest request,String pre){
        EntityWrapper<DifangmeishiEntity> ew = new EntityWrapper<DifangmeishiEntity>();
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
		PageUtils page = difangmeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, difangmeishi), params), params));
        return R.ok().put("data", page);
    }








}
