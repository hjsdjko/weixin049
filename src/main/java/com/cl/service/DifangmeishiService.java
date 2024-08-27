package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DifangmeishiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DifangmeishiView;


/**
 * 地方美食
 *
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
public interface DifangmeishiService extends IService<DifangmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DifangmeishiView> selectListView(Wrapper<DifangmeishiEntity> wrapper);
   	
   	DifangmeishiView selectView(@Param("ew") Wrapper<DifangmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DifangmeishiEntity> wrapper);
   	

}

