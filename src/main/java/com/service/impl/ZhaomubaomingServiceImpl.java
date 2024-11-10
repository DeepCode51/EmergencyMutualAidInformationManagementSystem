package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhaomubaomingDao;
import com.entity.ZhaomubaomingEntity;
import com.service.ZhaomubaomingService;
import com.entity.vo.ZhaomubaomingVO;
import com.entity.view.ZhaomubaomingView;

@Service("zhaomubaomingService")
public class ZhaomubaomingServiceImpl extends ServiceImpl<ZhaomubaomingDao, ZhaomubaomingEntity> implements ZhaomubaomingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaomubaomingEntity> page = this.selectPage(
                new Query<ZhaomubaomingEntity>(params).getPage(),
                new EntityWrapper<ZhaomubaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaomubaomingEntity> wrapper) {
		  Page<ZhaomubaomingView> page =new Query<ZhaomubaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaomubaomingVO> selectListVO(Wrapper<ZhaomubaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaomubaomingVO selectVO(Wrapper<ZhaomubaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaomubaomingView> selectListView(Wrapper<ZhaomubaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaomubaomingView selectView(Wrapper<ZhaomubaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
