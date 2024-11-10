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


import com.dao.WuzishenqingDao;
import com.entity.WuzishenqingEntity;
import com.service.WuzishenqingService;
import com.entity.vo.WuzishenqingVO;
import com.entity.view.WuzishenqingView;

@Service("wuzishenqingService")
public class WuzishenqingServiceImpl extends ServiceImpl<WuzishenqingDao, WuzishenqingEntity> implements WuzishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzishenqingEntity> page = this.selectPage(
                new Query<WuzishenqingEntity>(params).getPage(),
                new EntityWrapper<WuzishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzishenqingEntity> wrapper) {
		  Page<WuzishenqingView> page =new Query<WuzishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzishenqingVO> selectListVO(Wrapper<WuzishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzishenqingVO selectVO(Wrapper<WuzishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzishenqingView> selectListView(Wrapper<WuzishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzishenqingView selectView(Wrapper<WuzishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
