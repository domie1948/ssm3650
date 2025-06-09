package com.entity.view;

import com.entity.KechengyiwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程疑问
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
@TableName("kechengyiwen")
public class KechengyiwenView  extends KechengyiwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengyiwenView(){
	}
 
 	public KechengyiwenView(KechengyiwenEntity kechengyiwenEntity){
 	try {
			BeanUtils.copyProperties(this, kechengyiwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
