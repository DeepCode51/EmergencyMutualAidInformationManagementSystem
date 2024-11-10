package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlizhishiView;


/**
 * 心理知识
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface XinlizhishiService extends IService<XinlizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlizhishiVO> selectListVO(Wrapper<XinlizhishiEntity> wrapper);
   	
   	XinlizhishiVO selectVO(@Param("ew") Wrapper<XinlizhishiEntity> wrapper);
   	
   	List<XinlizhishiView> selectListView(Wrapper<XinlizhishiEntity> wrapper);
   	
   	XinlizhishiView selectView(@Param("ew") Wrapper<XinlizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlizhishiEntity> wrapper);
   	

}

