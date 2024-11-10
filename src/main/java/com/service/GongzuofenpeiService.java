package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuofenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuofenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuofenpeiView;


/**
 * 工作分配
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface GongzuofenpeiService extends IService<GongzuofenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuofenpeiVO> selectListVO(Wrapper<GongzuofenpeiEntity> wrapper);
   	
   	GongzuofenpeiVO selectVO(@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);
   	
   	List<GongzuofenpeiView> selectListView(Wrapper<GongzuofenpeiEntity> wrapper);
   	
   	GongzuofenpeiView selectView(@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuofenpeiEntity> wrapper);
   	

}

