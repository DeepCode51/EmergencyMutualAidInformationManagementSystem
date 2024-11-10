package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzizhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzizhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzizhongleiView;


/**
 * 物资种类
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface WuzizhongleiService extends IService<WuzizhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzizhongleiVO> selectListVO(Wrapper<WuzizhongleiEntity> wrapper);
   	
   	WuzizhongleiVO selectVO(@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);
   	
   	List<WuzizhongleiView> selectListView(Wrapper<WuzizhongleiEntity> wrapper);
   	
   	WuzizhongleiView selectView(@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzizhongleiEntity> wrapper);
   	

}

