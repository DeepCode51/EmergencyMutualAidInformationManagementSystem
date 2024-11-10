package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinjitongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinjitongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinjitongzhiView;


/**
 * 紧急通知
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface JinjitongzhiService extends IService<JinjitongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinjitongzhiVO> selectListVO(Wrapper<JinjitongzhiEntity> wrapper);
   	
   	JinjitongzhiVO selectVO(@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);
   	
   	List<JinjitongzhiView> selectListView(Wrapper<JinjitongzhiEntity> wrapper);
   	
   	JinjitongzhiView selectView(@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinjitongzhiEntity> wrapper);
   	

}

