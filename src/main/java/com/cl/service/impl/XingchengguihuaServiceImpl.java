package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.XingchengguihuaDao;
import com.cl.entity.XingchengguihuaEntity;
import com.cl.service.XingchengguihuaService;
import com.cl.entity.view.XingchengguihuaView;

@Service("xingchengguihuaService")
public class XingchengguihuaServiceImpl extends ServiceImpl<XingchengguihuaDao, XingchengguihuaEntity> implements XingchengguihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingchengguihuaEntity> page = this.selectPage(
                new Query<XingchengguihuaEntity>(params).getPage(),
                new EntityWrapper<XingchengguihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingchengguihuaEntity> wrapper) {
		  Page<XingchengguihuaView> page =new Query<XingchengguihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XingchengguihuaView> selectListView(Wrapper<XingchengguihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingchengguihuaView selectView(Wrapper<XingchengguihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
