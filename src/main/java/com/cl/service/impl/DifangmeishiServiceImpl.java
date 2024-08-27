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


import com.cl.dao.DifangmeishiDao;
import com.cl.entity.DifangmeishiEntity;
import com.cl.service.DifangmeishiService;
import com.cl.entity.view.DifangmeishiView;

@Service("difangmeishiService")
public class DifangmeishiServiceImpl extends ServiceImpl<DifangmeishiDao, DifangmeishiEntity> implements DifangmeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DifangmeishiEntity> page = this.selectPage(
                new Query<DifangmeishiEntity>(params).getPage(),
                new EntityWrapper<DifangmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DifangmeishiEntity> wrapper) {
		  Page<DifangmeishiView> page =new Query<DifangmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DifangmeishiView> selectListView(Wrapper<DifangmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DifangmeishiView selectView(Wrapper<DifangmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
