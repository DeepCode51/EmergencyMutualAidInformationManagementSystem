package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PiyaozhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PiyaozhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PiyaozhuanquView;


/**
 * 辟谣专区
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface PiyaozhuanquService extends IService<PiyaozhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PiyaozhuanquVO> selectListVO(Wrapper<PiyaozhuanquEntity> wrapper);
   	
   	PiyaozhuanquVO selectVO(@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);
   	
   	List<PiyaozhuanquView> selectListView(Wrapper<PiyaozhuanquEntity> wrapper);
   	
   	PiyaozhuanquView selectView(@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PiyaozhuanquEntity> wrapper);
   	

}

