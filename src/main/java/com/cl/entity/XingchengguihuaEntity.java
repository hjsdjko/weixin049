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
 * 行程规划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@TableName("xingchengguihua")
public class XingchengguihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XingchengguihuaEntity() {
		
	}
	
	public XingchengguihuaEntity(T t) {
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
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 地点
	 */
					
	private String didian;
	
	/**
	 * 活动
	 */
					
	private String huodong;
	
	/**
	 * 交通
	 */
					
	private String jiaotong;
	
	/**
	 * 住宿
	 */
					
	private String zhusu;
	
	/**
	 * 预算费用
	 */
					
	private Double yusuanfeiyong;
	
	/**
	 * 主要事项
	 */
					
	private String zhuyaoshixiang;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：地点
	 */
	public void setDidian(String didian) {
		this.didian = didian;
	}
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
	/**
	 * 设置：活动
	 */
	public void setHuodong(String huodong) {
		this.huodong = huodong;
	}
	/**
	 * 获取：活动
	 */
	public String getHuodong() {
		return huodong;
	}
	/**
	 * 设置：交通
	 */
	public void setJiaotong(String jiaotong) {
		this.jiaotong = jiaotong;
	}
	/**
	 * 获取：交通
	 */
	public String getJiaotong() {
		return jiaotong;
	}
	/**
	 * 设置：住宿
	 */
	public void setZhusu(String zhusu) {
		this.zhusu = zhusu;
	}
	/**
	 * 获取：住宿
	 */
	public String getZhusu() {
		return zhusu;
	}
	/**
	 * 设置：预算费用
	 */
	public void setYusuanfeiyong(Double yusuanfeiyong) {
		this.yusuanfeiyong = yusuanfeiyong;
	}
	/**
	 * 获取：预算费用
	 */
	public Double getYusuanfeiyong() {
		return yusuanfeiyong;
	}
	/**
	 * 设置：主要事项
	 */
	public void setZhuyaoshixiang(String zhuyaoshixiang) {
		this.zhuyaoshixiang = zhuyaoshixiang;
	}
	/**
	 * 获取：主要事项
	 */
	public String getZhuyaoshixiang() {
		return zhuyaoshixiang;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
