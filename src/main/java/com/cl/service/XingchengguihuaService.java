package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XingchengguihuaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XingchengguihuaView;


/**
 * 行程规划
 *
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
public interface XingchengguihuaService extends IService<XingchengguihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingchengguihuaView> selectListView(Wrapper<XingchengguihuaEntity> wrapper);
   	
   	XingchengguihuaView selectView(@Param("ew") Wrapper<XingchengguihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingchengguihuaEntity> wrapper);
   	

}

