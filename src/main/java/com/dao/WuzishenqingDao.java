package com.dao;

import com.entity.WuzishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzishenqingVO;
import com.entity.view.WuzishenqingView;


/**
 * 物资申请
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface WuzishenqingDao extends BaseMapper<WuzishenqingEntity> {
	
	List<WuzishenqingVO> selectListVO(@Param("ew") Wrapper<WuzishenqingEntity> wrapper);
	
	WuzishenqingVO selectVO(@Param("ew") Wrapper<WuzishenqingEntity> wrapper);
	
	List<WuzishenqingView> selectListView(@Param("ew") Wrapper<WuzishenqingEntity> wrapper);

	List<WuzishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<WuzishenqingEntity> wrapper);
	
	WuzishenqingView selectView(@Param("ew") Wrapper<WuzishenqingEntity> wrapper);
	

}
