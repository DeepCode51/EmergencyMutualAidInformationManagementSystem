package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzhuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzhuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzhuleixingView;


/**
 * 求助类型
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface QiuzhuleixingService extends IService<QiuzhuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzhuleixingVO> selectListVO(Wrapper<QiuzhuleixingEntity> wrapper);
   	
   	QiuzhuleixingVO selectVO(@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);
   	
   	List<QiuzhuleixingView> selectListView(Wrapper<QiuzhuleixingEntity> wrapper);
   	
   	QiuzhuleixingView selectView(@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzhuleixingEntity> wrapper);
   	

}

