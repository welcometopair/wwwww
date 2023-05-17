package com.entity.model;

import com.entity.XueshengjidianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生绩点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-06 16:42:46
 */
public class XueshengjidianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 年级
	 */
	
	private String nianji;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 学生手机
	 */
	
	private String xueshengshouji;
		
	/**
	 * 考核时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoheshijian;
		
	/**
	 * 证书加分
	 */
	
	private Integer zhengshujiafen;
		
	/**
	 * 考核成绩
	 */
	
	private Float kaohechengji;
		
	/**
	 * 占比
	 */
	
	private Float zhanbi;
		
	/**
	 * 所得绩点
	 */
	
	private Float suodejidian;
		
	/**
	 * 学年
	 */
	
	private String xuenian;
		
	/**
	 * 课堂表现
	 */
	
	private String ketangbiaoxian;
		
	/**
	 * 学习进度
	 */
	
	private String xuexijindu;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：年级
	 */
	 
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	/**
	 * 获取：年级
	 */
	public String getNianji() {
		return nianji;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：学生手机
	 */
	 
	public void setXueshengshouji(String xueshengshouji) {
		this.xueshengshouji = xueshengshouji;
	}
	
	/**
	 * 获取：学生手机
	 */
	public String getXueshengshouji() {
		return xueshengshouji;
	}
				
	
	/**
	 * 设置：考核时间
	 */
	 
	public void setKaoheshijian(Date kaoheshijian) {
		this.kaoheshijian = kaoheshijian;
	}
	
	/**
	 * 获取：考核时间
	 */
	public Date getKaoheshijian() {
		return kaoheshijian;
	}
				
	
	/**
	 * 设置：证书加分
	 */
	 
	public void setZhengshujiafen(Integer zhengshujiafen) {
		this.zhengshujiafen = zhengshujiafen;
	}
	
	/**
	 * 获取：证书加分
	 */
	public Integer getZhengshujiafen() {
		return zhengshujiafen;
	}
				
	
	/**
	 * 设置：考核成绩
	 */
	 
	public void setKaohechengji(Float kaohechengji) {
		this.kaohechengji = kaohechengji;
	}
	
	/**
	 * 获取：考核成绩
	 */
	public Float getKaohechengji() {
		return kaohechengji;
	}
				
	
	/**
	 * 设置：占比
	 */
	 
	public void setZhanbi(Float zhanbi) {
		this.zhanbi = zhanbi;
	}
	
	/**
	 * 获取：占比
	 */
	public Float getZhanbi() {
		return zhanbi;
	}
				
	
	/**
	 * 设置：所得绩点
	 */
	 
	public void setSuodejidian(Float suodejidian) {
		this.suodejidian = suodejidian;
	}
	
	/**
	 * 获取：所得绩点
	 */
	public Float getSuodejidian() {
		return suodejidian;
	}
				
	
	/**
	 * 设置：学年
	 */
	 
	public void setXuenian(String xuenian) {
		this.xuenian = xuenian;
	}
	
	/**
	 * 获取：学年
	 */
	public String getXuenian() {
		return xuenian;
	}
				
	
	/**
	 * 设置：课堂表现
	 */
	 
	public void setKetangbiaoxian(String ketangbiaoxian) {
		this.ketangbiaoxian = ketangbiaoxian;
	}
	
	/**
	 * 获取：课堂表现
	 */
	public String getKetangbiaoxian() {
		return ketangbiaoxian;
	}
				
	
	/**
	 * 设置：学习进度
	 */
	 
	public void setXuexijindu(String xuexijindu) {
		this.xuexijindu = xuexijindu;
	}
	
	/**
	 * 获取：学习进度
	 */
	public String getXuexijindu() {
		return xuexijindu;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
