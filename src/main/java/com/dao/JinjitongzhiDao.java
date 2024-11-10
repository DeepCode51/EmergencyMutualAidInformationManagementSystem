package com.dao;

import com.entity.JinjitongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinjitongzhiVO;
import com.entity.view.JinjitongzhiView;


/**
 * 紧急通知
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface JinjitongzhiDao extends BaseMapper<JinjitongzhiEntity> {
	
	List<JinjitongzhiVO> selectListVO(@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);
	
	JinjitongzhiVO selectVO(@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);
	
	List<JinjitongzhiView> selectListView(@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);

	List<JinjitongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);
	
	JinjitongzhiView selectView(@Param("ew") Wrapper<JinjitongzhiEntity> wrapper);
	

}
