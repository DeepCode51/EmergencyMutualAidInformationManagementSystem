package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuotijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuotijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuotijiaoView;


/**
 * 工作提交
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface GongzuotijiaoService extends IService<GongzuotijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuotijiaoVO> selectListVO(Wrapper<GongzuotijiaoEntity> wrapper);
   	
   	GongzuotijiaoVO selectVO(@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);
   	
   	List<GongzuotijiaoView> selectListView(Wrapper<GongzuotijiaoEntity> wrapper);
   	
   	GongzuotijiaoView selectView(@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuotijiaoEntity> wrapper);
   	

}

