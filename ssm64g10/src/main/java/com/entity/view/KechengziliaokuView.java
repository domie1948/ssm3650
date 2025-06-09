package com.entity.view;

import com.entity.KechengziliaokuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程资料库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
@TableName("kechengziliaoku")
public class KechengziliaokuView  extends KechengziliaokuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengziliaokuView(){
	}
 
 	public KechengziliaokuView(KechengziliaokuEntity kechengziliaokuEntity){
 	try {
			BeanUtils.copyProperties(this, kechengziliaokuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
