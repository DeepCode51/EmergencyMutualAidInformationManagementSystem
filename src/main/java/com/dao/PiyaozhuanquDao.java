package com.dao;

import com.entity.PiyaozhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PiyaozhuanquVO;
import com.entity.view.PiyaozhuanquView;


/**
 * 辟谣专区
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface PiyaozhuanquDao extends BaseMapper<PiyaozhuanquEntity> {
	
	List<PiyaozhuanquVO> selectListVO(@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);
	
	PiyaozhuanquVO selectVO(@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);
	
	List<PiyaozhuanquView> selectListView(@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);

	List<PiyaozhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);
	
	PiyaozhuanquView selectView(@Param("ew") Wrapper<PiyaozhuanquEntity> wrapper);
	

}
