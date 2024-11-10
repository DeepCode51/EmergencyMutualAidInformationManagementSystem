package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaomuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaomuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaomuxinxiView;


/**
 * 招募信息
 *
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface ZhaomuxinxiService extends IService<ZhaomuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaomuxinxiVO> selectListVO(Wrapper<ZhaomuxinxiEntity> wrapper);
   	
   	ZhaomuxinxiVO selectVO(@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);
   	
   	List<ZhaomuxinxiView> selectListView(Wrapper<ZhaomuxinxiEntity> wrapper);
   	
   	ZhaomuxinxiView selectView(@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaomuxinxiEntity> wrapper);
   	

}

