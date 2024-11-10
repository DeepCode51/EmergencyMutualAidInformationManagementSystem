package com.dao;

import com.entity.XinlizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlizhishiVO;
import com.entity.view.XinlizhishiView;


/**
 * 心理知识
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface XinlizhishiDao extends BaseMapper<XinlizhishiEntity> {
	
	List<XinlizhishiVO> selectListVO(@Param("ew") Wrapper<XinlizhishiEntity> wrapper);
	
	XinlizhishiVO selectVO(@Param("ew") Wrapper<XinlizhishiEntity> wrapper);
	
	List<XinlizhishiView> selectListView(@Param("ew") Wrapper<XinlizhishiEntity> wrapper);

	List<XinlizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<XinlizhishiEntity> wrapper);
	
	XinlizhishiView selectView(@Param("ew") Wrapper<XinlizhishiEntity> wrapper);
	

}
