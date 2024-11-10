package com.entity.model;

import com.entity.GongzuotijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 工作提交
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public class GongzuotijiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工作状态
	 */
	
	private String gongzuozhuangtai;
		
	/**
	 * 内容描述
	 */
	
	private String neirongmiaoshu;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 志愿账号
	 */
	
	private String zhiyuanzhanghao;
		
	/**
	 * 志愿姓名
	 */
	
	private String zhiyuanxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：工作状态
	 */
	 
	public void setGongzuozhuangtai(String gongzuozhuangtai) {
		this.gongzuozhuangtai = gongzuozhuangtai;
	}
	
	/**
	 * 获取：工作状态
	 */
	public String getGongzuozhuangtai() {
		return gongzuozhuangtai;
	}
				
	
	/**
	 * 设置：内容描述
	 */
	 
	public void setNeirongmiaoshu(String neirongmiaoshu) {
		this.neirongmiaoshu = neirongmiaoshu;
	}
	
	/**
	 * 获取：内容描述
	 */
	public String getNeirongmiaoshu() {
		return neirongmiaoshu;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
				
	
	/**
	 * 设置：志愿账号
	 */
	 
	public void setZhiyuanzhanghao(String zhiyuanzhanghao) {
		this.zhiyuanzhanghao = zhiyuanzhanghao;
	}
	
	/**
	 * 获取：志愿账号
	 */
	public String getZhiyuanzhanghao() {
		return zhiyuanzhanghao;
	}
				
	
	/**
	 * 设置：志愿姓名
	 */
	 
	public void setZhiyuanxingming(String zhiyuanxingming) {
		this.zhiyuanxingming = zhiyuanxingming;
	}
	
	/**
	 * 获取：志愿姓名
	 */
	public String getZhiyuanxingming() {
		return zhiyuanxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
