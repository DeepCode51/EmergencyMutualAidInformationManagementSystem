package com.entity.view;

import com.entity.XinlizhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 心理知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@TableName("xinlizhishi")
public class XinlizhishiView  extends XinlizhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinlizhishiView(){
	}
 
 	public XinlizhishiView(XinlizhishiEntity xinlizhishiEntity){
 	try {
			BeanUtils.copyProperties(this, xinlizhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
