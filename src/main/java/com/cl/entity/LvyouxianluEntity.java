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
 * 旅游线路
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:32
 */
@TableName("lvyouxianlu")
public class LvyouxianluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvyouxianluEntity() {
		
	}
	
	public LvyouxianluEntity(T t) {
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
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 线路名称
	 */
					
	private String xianlumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 景点地址
	 */
					
	private String jingdiandizhi;
	
	/**
	 * 起点
	 */
					
	private String qidian;
	
	/**
	 * 途径路段
	 */
					
	private String tujingluduan;
	
	/**
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 出行方式
	 */
					
	private String chuxingfangshi;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
	/**
	 * 设置：线路名称
	 */
	public void setXianlumingcheng(String xianlumingcheng) {
		this.xianlumingcheng = xianlumingcheng;
	}
	/**
	 * 获取：线路名称
	 */
	public String getXianlumingcheng() {
		return xianlumingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：景点地址
	 */
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
	/**
	 * 设置：起点
	 */
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
	/**
	 * 设置：途径路段
	 */
	public void setTujingluduan(String tujingluduan) {
		this.tujingluduan = tujingluduan;
	}
	/**
	 * 获取：途径路段
	 */
	public String getTujingluduan() {
		return tujingluduan;
	}
	/**
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：出行方式
	 */
	public void setChuxingfangshi(String chuxingfangshi) {
		this.chuxingfangshi = chuxingfangshi;
	}
	/**
	 * 获取：出行方式
	 */
	public String getChuxingfangshi() {
		return chuxingfangshi;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
