package com.dao;

import com.entity.ZhiyuanzheshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzheshenqingVO;
import com.entity.view.ZhiyuanzheshenqingView;


/**
 * 志愿者申请
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface ZhiyuanzheshenqingDao extends BaseMapper<ZhiyuanzheshenqingEntity> {
	
	List<ZhiyuanzheshenqingVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);
	
	ZhiyuanzheshenqingVO selectVO(@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);
	
	List<ZhiyuanzheshenqingView> selectListView(@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);

	List<ZhiyuanzheshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);
	
	ZhiyuanzheshenqingView selectView(@Param("ew") Wrapper<ZhiyuanzheshenqingEntity> wrapper);
	

}
