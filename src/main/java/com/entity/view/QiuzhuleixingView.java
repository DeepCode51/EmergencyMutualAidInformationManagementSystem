package com.entity.view;

import com.entity.QiuzhuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 求助类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
@TableName("qiuzhuleixing")
public class QiuzhuleixingView  extends QiuzhuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuzhuleixingView(){
	}
 
 	public QiuzhuleixingView(QiuzhuleixingEntity qiuzhuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, qiuzhuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
