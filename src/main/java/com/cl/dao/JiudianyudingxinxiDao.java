package com.cl.dao;

import com.cl.entity.JiudianyudingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiudianyudingxinxiView;


/**
 * 酒店预订信息
 * 
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
public interface JiudianyudingxinxiDao extends BaseMapper<JiudianyudingxinxiEntity> {
	
	List<JiudianyudingxinxiView> selectListView(@Param("ew") Wrapper<JiudianyudingxinxiEntity> wrapper);

	List<JiudianyudingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianyudingxinxiEntity> wrapper);
	
	JiudianyudingxinxiView selectView(@Param("ew") Wrapper<JiudianyudingxinxiEntity> wrapper);
	

}
