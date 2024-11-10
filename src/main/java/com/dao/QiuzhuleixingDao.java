package com.dao;

import com.entity.QiuzhuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuzhuleixingVO;
import com.entity.view.QiuzhuleixingView;


/**
 * 求助类型
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface QiuzhuleixingDao extends BaseMapper<QiuzhuleixingEntity> {
	
	List<QiuzhuleixingVO> selectListVO(@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);
	
	QiuzhuleixingVO selectVO(@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);
	
	List<QiuzhuleixingView> selectListView(@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);

	List<QiuzhuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);
	
	QiuzhuleixingView selectView(@Param("ew") Wrapper<QiuzhuleixingEntity> wrapper);
	

}
