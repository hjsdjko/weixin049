package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiudianyudingxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiudianyudingxinxiView;


/**
 * 酒店预订信息
 *
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
public interface JiudianyudingxinxiService extends IService<JiudianyudingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianyudingxinxiView> selectListView(Wrapper<JiudianyudingxinxiEntity> wrapper);
   	
   	JiudianyudingxinxiView selectView(@Param("ew") Wrapper<JiudianyudingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianyudingxinxiEntity> wrapper);
   	

}

