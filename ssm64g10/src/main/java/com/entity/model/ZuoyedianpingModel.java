package com.entity.model;

import com.entity.ZuoyedianpingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作业点评
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public class ZuoyedianpingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 课程编号
	 */
	
	private String kechengbianhao;
		
	/**
	 * 作业名称
	 */
	
	private String zuoyemingcheng;
		
	/**
	 * 批改文件
	 */
	
	private String pigaiwenjian;
		
	/**
	 * 成绩
	 */
	
	private Integer chengji;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
				
	
	/**
	 * 设置：课程编号
	 */
	 
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
	}
				
	
	/**
	 * 设置：作业名称
	 */
	 
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
				
	
	/**
	 * 设置：批改文件
	 */
	 
	public void setPigaiwenjian(String pigaiwenjian) {
		this.pigaiwenjian = pigaiwenjian;
	}
	
	/**
	 * 获取：批改文件
	 */
	public String getPigaiwenjian() {
		return pigaiwenjian;
	}
				
	
	/**
	 * 设置：成绩
	 */
	 
	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}
	
	/**
	 * 获取：成绩
	 */
	public Integer getChengji() {
		return chengji;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
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
