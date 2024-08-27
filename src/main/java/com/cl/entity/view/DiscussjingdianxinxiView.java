package com.cl.entity.view;

import com.cl.entity.DiscussjingdianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 景点信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@TableName("discussjingdianxinxi")
public class DiscussjingdianxinxiView  extends DiscussjingdianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingdianxinxiView(){
	}
 
 	public DiscussjingdianxinxiView(DiscussjingdianxinxiEntity discussjingdianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingdianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
