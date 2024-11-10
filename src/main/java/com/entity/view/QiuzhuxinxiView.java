package com.entity.view;

import com.entity.QiuzhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 求助信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
@TableName("qiuzhuxinxi")
public class QiuzhuxinxiView  extends QiuzhuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuzhuxinxiView(){
	}
 
 	public QiuzhuxinxiView(QiuzhuxinxiEntity qiuzhuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qiuzhuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
