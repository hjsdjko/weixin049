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

import com.cl.entity.LvkeEntity;
import com.cl.entity.view.LvkeView;

import com.cl.service.LvkeService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 旅客
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-01 22:39:32
 */
@RestController
@RequestMapping("/lvke")
public class LvkeController {
    @Autowired
    private LvkeService lvkeService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		LvkeEntity u = lvkeService.selectOne(new EntityWrapper<LvkeEntity>().eq("lvkezhanghao", username));
        if(u==null || !u.getLvkemima().equals(password)) {
            return R.error("账号或密码不正确");
        }
		String token = tokenService.generateToken(u.getId(), username,"lvke",  "旅客" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody LvkeEntity lvke){
    	//ValidatorUtils.validateEntity(lvke);
    	LvkeEntity u = lvkeService.selectOne(new EntityWrapper<LvkeEntity>().eq("lvkezhanghao", lvke.getLvkezhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		lvke.setId(uId);
        lvkeService.insert(lvke);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        LvkeEntity u = lvkeService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	LvkeEntity u = lvkeService.selectOne(new EntityWrapper<LvkeEntity>().eq("lvkezhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setLvkemima("123456");
        lvkeService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LvkeEntity lvke,
		HttpServletRequest request){
        EntityWrapper<LvkeEntity> ew = new EntityWrapper<LvkeEntity>();

		PageUtils page = lvkeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvke), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LvkeEntity lvke, 
		HttpServletRequest request){
        EntityWrapper<LvkeEntity> ew = new EntityWrapper<LvkeEntity>();

		PageUtils page = lvkeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvke), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LvkeEntity lvke){
       	EntityWrapper<LvkeEntity> ew = new EntityWrapper<LvkeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lvke, "lvke")); 
        return R.ok().put("data", lvkeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LvkeEntity lvke){
        EntityWrapper< LvkeEntity> ew = new EntityWrapper< LvkeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lvke, "lvke")); 
		LvkeView lvkeView =  lvkeService.selectView(ew);
		return R.ok("查询旅客成功").put("data", lvkeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LvkeEntity lvke = lvkeService.selectById(id);
		lvke = lvkeService.selectView(new EntityWrapper<LvkeEntity>().eq("id", id));
        return R.ok().put("data", lvke);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LvkeEntity lvke = lvkeService.selectById(id);
		lvke = lvkeService.selectView(new EntityWrapper<LvkeEntity>().eq("id", id));
        return R.ok().put("data", lvke);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LvkeEntity lvke, HttpServletRequest request){
    	lvke.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvke);
    	LvkeEntity u = lvkeService.selectOne(new EntityWrapper<LvkeEntity>().eq("lvkezhanghao", lvke.getLvkezhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		lvke.setId(new Date().getTime());
        lvkeService.insert(lvke);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LvkeEntity lvke, HttpServletRequest request){
    	lvke.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvke);
    	LvkeEntity u = lvkeService.selectOne(new EntityWrapper<LvkeEntity>().eq("lvkezhanghao", lvke.getLvkezhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		lvke.setId(new Date().getTime());
        lvkeService.insert(lvke);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LvkeEntity lvke, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lvke);
        lvkeService.updateById(lvke);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lvkeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
