package com.dao;

import com.entity.WuzizhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzizhongleiVO;
import com.entity.view.WuzizhongleiView;


/**
 * 物资种类
 * 
 * @author 
 * @email 
 * @date 2022-04-18 19:21:55
 */
public interface WuzizhongleiDao extends BaseMapper<WuzizhongleiEntity> {
	
	List<WuzizhongleiVO> selectListVO(@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);
	
	WuzizhongleiVO selectVO(@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);
	
	List<WuzizhongleiView> selectListView(@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);

	List<WuzizhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);
	
	WuzizhongleiView selectView(@Param("ew") Wrapper<WuzizhongleiEntity> wrapper);
	

}
