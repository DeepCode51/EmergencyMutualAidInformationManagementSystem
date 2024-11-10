package com.dao;

import com.entity.ZhaomubaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaomubaomingVO;
import com.entity.view.ZhaomubaomingView;


/**
 * 招募报名
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface ZhaomubaomingDao extends BaseMapper<ZhaomubaomingEntity> {
	
	List<ZhaomubaomingVO> selectListVO(@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);
	
	ZhaomubaomingVO selectVO(@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);
	
	List<ZhaomubaomingView> selectListView(@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);

	List<ZhaomubaomingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);
	
	ZhaomubaomingView selectView(@Param("ew") Wrapper<ZhaomubaomingEntity> wrapper);
	

}
