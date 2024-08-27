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


import com.cl.dao.LvkeDao;
import com.cl.entity.LvkeEntity;
import com.cl.service.LvkeService;
import com.cl.entity.view.LvkeView;

@Service("lvkeService")
public class LvkeServiceImpl extends ServiceImpl<LvkeDao, LvkeEntity> implements LvkeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvkeEntity> page = this.selectPage(
                new Query<LvkeEntity>(params).getPage(),
                new EntityWrapper<LvkeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvkeEntity> wrapper) {
		  Page<LvkeView> page =new Query<LvkeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LvkeView> selectListView(Wrapper<LvkeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvkeView selectView(Wrapper<LvkeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
