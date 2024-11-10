package com.entity.view;

import com.entity.GongzuofenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@TableName("gongzuofenpei")
public class GongzuofenpeiView  extends GongzuofenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuofenpeiView(){
	}
 
 	public GongzuofenpeiView(GongzuofenpeiEntity gongzuofenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuofenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
