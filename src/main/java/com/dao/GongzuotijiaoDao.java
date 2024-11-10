package com.dao;

import com.entity.GongzuotijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuotijiaoVO;
import com.entity.view.GongzuotijiaoView;


/**
 * 工作提交
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface GongzuotijiaoDao extends BaseMapper<GongzuotijiaoEntity> {
	
	List<GongzuotijiaoVO> selectListVO(@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);
	
	GongzuotijiaoVO selectVO(@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);
	
	List<GongzuotijiaoView> selectListView(@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);

	List<GongzuotijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);
	
	GongzuotijiaoView selectView(@Param("ew") Wrapper<GongzuotijiaoEntity> wrapper);
	

}
