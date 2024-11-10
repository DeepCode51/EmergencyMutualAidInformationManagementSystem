package com.dao;

import com.entity.WuzifenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzifenpeiVO;
import com.entity.view.WuzifenpeiView;


/**
 * 物资分配
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface WuzifenpeiDao extends BaseMapper<WuzifenpeiEntity> {
	
	List<WuzifenpeiVO> selectListVO(@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);
	
	WuzifenpeiVO selectVO(@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);
	
	List<WuzifenpeiView> selectListView(@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);

	List<WuzifenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);
	
	WuzifenpeiView selectView(@Param("ew") Wrapper<WuzifenpeiEntity> wrapper);
	

}
