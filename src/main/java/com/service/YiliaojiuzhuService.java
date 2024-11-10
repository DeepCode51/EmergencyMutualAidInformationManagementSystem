package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaojiuzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaojiuzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaojiuzhuView;


/**
 * 医疗救助
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface YiliaojiuzhuService extends IService<YiliaojiuzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaojiuzhuVO> selectListVO(Wrapper<YiliaojiuzhuEntity> wrapper);
   	
   	YiliaojiuzhuVO selectVO(@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);
   	
   	List<YiliaojiuzhuView> selectListView(Wrapper<YiliaojiuzhuEntity> wrapper);
   	
   	YiliaojiuzhuView selectView(@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaojiuzhuEntity> wrapper);
   	

}

