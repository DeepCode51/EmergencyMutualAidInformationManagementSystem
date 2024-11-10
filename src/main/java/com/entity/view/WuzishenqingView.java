package com.entity.view;

import com.entity.WuzishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@TableName("wuzishenqing")
public class WuzishenqingView  extends WuzishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzishenqingView(){
	}
 
 	public WuzishenqingView(WuzishenqingEntity wuzishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, wuzishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
