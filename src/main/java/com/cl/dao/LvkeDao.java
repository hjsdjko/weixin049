package com.cl.dao;

import com.cl.entity.LvkeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvkeView;


/**
 * 旅客
 * 
 * @author 
 * @email 
 * @date 2024-03-01 22:39:32
 */
public interface LvkeDao extends BaseMapper<LvkeEntity> {
	
	List<LvkeView> selectListView(@Param("ew") Wrapper<LvkeEntity> wrapper);

	List<LvkeView> selectListView(Pagination page,@Param("ew") Wrapper<LvkeEntity> wrapper);
	
	LvkeView selectView(@Param("ew") Wrapper<LvkeEntity> wrapper);
	

}
