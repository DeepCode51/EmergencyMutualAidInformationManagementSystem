package com.dao;

import com.entity.ZhaomuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaomuxinxiVO;
import com.entity.view.ZhaomuxinxiView;


/**
 * 招募信息
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface ZhaomuxinxiDao extends BaseMapper<ZhaomuxinxiEntity> {
	
	List<ZhaomuxinxiVO> selectListVO(@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);
	
	ZhaomuxinxiVO selectVO(@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);
	
	List<ZhaomuxinxiView> selectListView(@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);

	List<ZhaomuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);
	
	ZhaomuxinxiView selectView(@Param("ew") Wrapper<ZhaomuxinxiEntity> wrapper);
	

}
