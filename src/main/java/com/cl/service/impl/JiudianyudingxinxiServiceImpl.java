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


import com.cl.dao.JiudianyudingxinxiDao;
import com.cl.entity.JiudianyudingxinxiEntity;
import com.cl.service.JiudianyudingxinxiService;
import com.cl.entity.view.JiudianyudingxinxiView;

@Service("jiudianyudingxinxiService")
public class JiudianyudingxinxiServiceImpl extends ServiceImpl<JiudianyudingxinxiDao, JiudianyudingxinxiEntity> implements JiudianyudingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianyudingxinxiEntity> page = this.selectPage(
                new Query<JiudianyudingxinxiEntity>(params).getPage(),
                new EntityWrapper<JiudianyudingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianyudingxinxiEntity> wrapper) {
		  Page<JiudianyudingxinxiView> page =new Query<JiudianyudingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiudianyudingxinxiView> selectListView(Wrapper<JiudianyudingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianyudingxinxiView selectView(Wrapper<JiudianyudingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
