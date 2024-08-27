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
 * 酒店信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-01 22:39:33
 */
@TableName("jiudianxinxi")
public class JiudianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudianxinxiEntity() {
		
	}
	
	public JiudianxinxiEntity(T t) {
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
	 * 房间号
	 */
					
	private String fangjianhao;
	
	/**
	 * 房间图片
	 */
					
	private String fangjiantupian;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 酒店名称
	 */
					
	private String jiudianmingcheng;
	
	/**
	 * 酒店地址
	 */
					
	private String jiudiandizhi;
	
	/**
	 * 一晚价格
	 */
					
	private Double yiwanjiage;
	
	/**
	 * 服务电话
	 */
					
	private String fuwudianhua;
	
	/**
	 * 房内设施
	 */
					
	private String fangneisheshi;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	
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
	 * 设置：房间号
	 */
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
	/**
	 * 设置：房间图片
	 */
	public void setFangjiantupian(String fangjiantupian) {
		this.fangjiantupian = fangjiantupian;
	}
	/**
	 * 获取：房间图片
	 */
	public String getFangjiantupian() {
		return fangjiantupian;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：酒店名称
	 */
	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}
	/**
	 * 获取：酒店名称
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}
	/**
	 * 设置：酒店地址
	 */
	public void setJiudiandizhi(String jiudiandizhi) {
		this.jiudiandizhi = jiudiandizhi;
	}
	/**
	 * 获取：酒店地址
	 */
	public String getJiudiandizhi() {
		return jiudiandizhi;
	}
	/**
	 * 设置：一晚价格
	 */
	public void setYiwanjiage(Double yiwanjiage) {
		this.yiwanjiage = yiwanjiage;
	}
	/**
	 * 获取：一晚价格
	 */
	public Double getYiwanjiage() {
		return yiwanjiage;
	}
	/**
	 * 设置：服务电话
	 */
	public void setFuwudianhua(String fuwudianhua) {
		this.fuwudianhua = fuwudianhua;
	}
	/**
	 * 获取：服务电话
	 */
	public String getFuwudianhua() {
		return fuwudianhua;
	}
	/**
	 * 设置：房内设施
	 */
	public void setFangneisheshi(String fangneisheshi) {
		this.fangneisheshi = fangneisheshi;
	}
	/**
	 * 获取：房内设施
	 */
	public String getFangneisheshi() {
		return fangneisheshi;
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
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}

}
