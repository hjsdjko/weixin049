package com.cl.dao;

import com.cl.entity.XingchengguihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XingchengguihuaView;


/**
 * 行程规划
 * 
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
public interface XingchengguihuaDao extends BaseMapper<XingchengguihuaEntity> {
	
	List<XingchengguihuaView> selectListView(@Param("ew") Wrapper<XingchengguihuaEntity> wrapper);

	List<XingchengguihuaView> selectListView(Pagination page,@Param("ew") Wrapper<XingchengguihuaEntity> wrapper);
	
	XingchengguihuaView selectView(@Param("ew") Wrapper<XingchengguihuaEntity> wrapper);
	

}
