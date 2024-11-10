package com.dao;

import com.entity.YiliaojiuzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaojiuzhuVO;
import com.entity.view.YiliaojiuzhuView;


/**
 * 医疗救助
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
public interface YiliaojiuzhuDao extends BaseMapper<YiliaojiuzhuEntity> {
	
	List<YiliaojiuzhuVO> selectListVO(@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);
	
	YiliaojiuzhuVO selectVO(@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);
	
	List<YiliaojiuzhuView> selectListView(@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);

	List<YiliaojiuzhuView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);
	
	YiliaojiuzhuView selectView(@Param("ew") Wrapper<YiliaojiuzhuEntity> wrapper);
	

}
