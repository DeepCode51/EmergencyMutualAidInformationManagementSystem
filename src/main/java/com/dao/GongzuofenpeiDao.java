package com.dao;

import com.entity.GongzuofenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuofenpeiVO;
import com.entity.view.GongzuofenpeiView;


/**
 * 工作分配
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface GongzuofenpeiDao extends BaseMapper<GongzuofenpeiEntity> {
	
	List<GongzuofenpeiVO> selectListVO(@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);
	
	GongzuofenpeiVO selectVO(@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);
	
	List<GongzuofenpeiView> selectListView(@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);

	List<GongzuofenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);
	
	GongzuofenpeiView selectView(@Param("ew") Wrapper<GongzuofenpeiEntity> wrapper);
	

}
