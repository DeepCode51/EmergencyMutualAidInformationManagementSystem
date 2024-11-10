package com.entity.view;

import com.entity.ZhaomuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招募信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@TableName("zhaomuxinxi")
public class ZhaomuxinxiView  extends ZhaomuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaomuxinxiView(){
	}
 
 	public ZhaomuxinxiView(ZhaomuxinxiEntity zhaomuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhaomuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
