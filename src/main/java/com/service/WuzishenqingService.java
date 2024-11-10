package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzishenqingView;


/**
 * 物资申请
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface WuzishenqingService extends IService<WuzishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzishenqingVO> selectListVO(Wrapper<WuzishenqingEntity> wrapper);
   	
   	WuzishenqingVO selectVO(@Param("ew") Wrapper<WuzishenqingEntity> wrapper);
   	
   	List<WuzishenqingView> selectListView(Wrapper<WuzishenqingEntity> wrapper);
   	
   	WuzishenqingView selectView(@Param("ew") Wrapper<WuzishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzishenqingEntity> wrapper);
   	

}

