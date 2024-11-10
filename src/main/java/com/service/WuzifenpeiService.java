package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzifenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzifenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzifenpeiView;


/**
 * 物资分配
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface WuzifenpeiService extends IService<WuzifenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzifenpeiVO> selectListVO(Wrapper<WuzifenpeiEntity> wrapper);
   	
   	WuzifenpeiVO selectVO(@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);
   	
   	List<WuzifenpeiView> selectListView(Wrapper<WuzifenpeiEntity> wrapper);
   	
   	WuzifenpeiView selectView(@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzifenpeiEntity> wrapper);
   	

}

