package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 地方美食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@TableName("difangmeishi")
public class DifangmeishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DifangmeishiEntity() {
		
	}
	
	public DifangmeishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 地方名称
	 */
					
	private String difangmingcheng;
	
	/**
	 * 美食名称
	 */
					
	private String meishimingcheng;
	
	/**
	 * 食材
	 */
					
	private String shicai;
	
	/**
	 * 口味特点
	 */
					
	private String kouweitedian;
	
	/**
	 * 文化背景
	 */
					
	private String wenhuabeijing;
	
	/**
	 * 地域特色
	 */
					
	private String diyutese;
	
	/**
	 * 美食图片
	 */
					
	private String meishitupian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：地方名称
	 */
	public void setDifangmingcheng(String difangmingcheng) {
		this.difangmingcheng = difangmingcheng;
	}
	/**
	 * 获取：地方名称
	 */
	public String getDifangmingcheng() {
		return difangmingcheng;
	}
	/**
	 * 设置：美食名称
	 */
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
	/**
	 * 设置：食材
	 */
	public void setShicai(String shicai) {
		this.shicai = shicai;
	}
	/**
	 * 获取：食材
	 */
	public String getShicai() {
		return shicai;
	}
	/**
	 * 设置：口味特点
	 */
	public void setKouweitedian(String kouweitedian) {
		this.kouweitedian = kouweitedian;
	}
	/**
	 * 获取：口味特点
	 */
	public String getKouweitedian() {
		return kouweitedian;
	}
	/**
	 * 设置：文化背景
	 */
	public void setWenhuabeijing(String wenhuabeijing) {
		this.wenhuabeijing = wenhuabeijing;
	}
	/**
	 * 获取：文化背景
	 */
	public String getWenhuabeijing() {
		return wenhuabeijing;
	}
	/**
	 * 设置：地域特色
	 */
	public void setDiyutese(String diyutese) {
		this.diyutese = diyutese;
	}
	/**
	 * 获取：地域特色
	 */
	public String getDiyutese() {
		return diyutese;
	}
	/**
	 * 设置：美食图片
	 */
	public void setMeishitupian(String meishitupian) {
		this.meishitupian = meishitupian;
	}
	/**
	 * 获取：美食图片
	 */
	public String getMeishitupian() {
		return meishitupian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
