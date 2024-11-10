package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzheshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzheshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzheshenqingView;


/**
 * 志愿者申请
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface ZhiyuanzheshenqingService extends IService<ZhiyuanzheshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzheshenqingVO> selectListVO(Wrapper<ZhiyuanzheshenqingEntity> wrapper);
   	
   	ZhiyuanzheshenqingVO selectVO(@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);
   	
   	List<ZhiyuanzheshenqingView> selectListView(Wrapper<ZhiyuanzheshenqingEntity> wrapper);
   	
   	ZhiyuanzheshenqingView selectView(@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzheshenqingEntity> wrapper);
   	

}

