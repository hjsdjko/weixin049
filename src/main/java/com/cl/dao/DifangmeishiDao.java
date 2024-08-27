package com.cl.dao;

import com.cl.entity.DifangmeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DifangmeishiView;


/**
 * 地方美食
 * 
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
public interface DifangmeishiDao extends BaseMapper<DifangmeishiEntity> {
	
	List<DifangmeishiView> selectListView(@Param("ew") Wrapper<DifangmeishiEntity> wrapper);

	List<DifangmeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DifangmeishiEntity> wrapper);
	
	DifangmeishiView selectView(@Param("ew") Wrapper<DifangmeishiEntity> wrapper);
	

}
