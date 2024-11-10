package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaomubaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaomubaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaomubaomingView;


/**
 * 招募报名
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface ZhaomubaomingService extends IService<ZhaomubaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaomubaomingVO> selectListVO(Wrapper<ZhaomubaomingEntity> wrapper);
   	
   	ZhaomubaomingVO selectVO(@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);
   	
   	List<ZhaomubaomingView> selectListView(Wrapper<ZhaomubaomingEntity> wrapper);
   	
   	ZhaomubaomingView selectView(@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaomubaomingEntity> wrapper);
   	

}

