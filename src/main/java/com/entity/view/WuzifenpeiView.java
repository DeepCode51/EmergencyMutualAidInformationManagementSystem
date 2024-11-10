package com.entity.view;

import com.entity.WuzifenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@TableName("wuzifenpei")
public class WuzifenpeiView  extends WuzifenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzifenpeiView(){
	}
 
 	public WuzifenpeiView(WuzifenpeiEntity wuzifenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, wuzifenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
