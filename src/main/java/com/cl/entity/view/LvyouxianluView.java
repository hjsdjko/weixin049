package com.cl.entity.view;

import com.cl.entity.LvyouxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 旅游线路
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:32
 */
@TableName("lvyouxianlu")
public class LvyouxianluView  extends LvyouxianluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyouxianluView(){
	}
 
 	public LvyouxianluView(LvyouxianluEntity lvyouxianluEntity){
 	try {
			BeanUtils.copyProperties(this, lvyouxianluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
