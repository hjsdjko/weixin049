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


import com.cl.dao.LvyouxianluDao;
import com.cl.entity.LvyouxianluEntity;
import com.cl.service.LvyouxianluService;
import com.cl.entity.view.LvyouxianluView;

@Service("lvyouxianluService")
public class LvyouxianluServiceImpl extends ServiceImpl<LvyouxianluDao, LvyouxianluEntity> implements LvyouxianluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyouxianluEntity> page = this.selectPage(
                new Query<LvyouxianluEntity>(params).getPage(),
                new EntityWrapper<LvyouxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyouxianluEntity> wrapper) {
		  Page<LvyouxianluView> page =new Query<LvyouxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LvyouxianluView> selectListView(Wrapper<LvyouxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyouxianluView selectView(Wrapper<LvyouxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
