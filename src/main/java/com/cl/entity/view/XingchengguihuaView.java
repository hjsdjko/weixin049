package com.cl.entity.view;

import com.cl.entity.XingchengguihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 行程规划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@TableName("xingchengguihua")
public class XingchengguihuaView  extends XingchengguihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XingchengguihuaView(){
	}
 
 	public XingchengguihuaView(XingchengguihuaEntity xingchengguihuaEntity){
 	try {
			BeanUtils.copyProperties(this, xingchengguihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
