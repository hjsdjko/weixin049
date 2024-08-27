package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LvkeEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvkeView;


/**
 * 旅客
 *
 * @author 
 * @email 
 * @date 2024-03-01 22:39:32
 */
public interface LvkeService extends IService<LvkeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvkeView> selectListView(Wrapper<LvkeEntity> wrapper);
   	
   	LvkeView selectView(@Param("ew") Wrapper<LvkeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvkeEntity> wrapper);
   	

}

