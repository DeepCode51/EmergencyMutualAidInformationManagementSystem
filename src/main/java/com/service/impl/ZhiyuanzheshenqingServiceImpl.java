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


import com.dao.ZhiyuanzheshenqingDao;
import com.entity.ZhiyuanzheshenqingEntity;
import com.service.ZhiyuanzheshenqingService;
import com.entity.vo.ZhiyuanzheshenqingVO;
import com.entity.view.ZhiyuanzheshenqingView;

@Service("zhiyuanzheshenqingService")
public class ZhiyuanzheshenqingServiceImpl extends ServiceImpl<ZhiyuanzheshenqingDao, ZhiyuanzheshenqingEntity> implements ZhiyuanzheshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzheshenqingEntity> page = this.selectPage(
                new Query<ZhiyuanzheshenqingEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzheshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzheshenqingEntity> wrapper) {
		  Page<ZhiyuanzheshenqingView> page =new Query<ZhiyuanzheshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzheshenqingVO> selectListVO(Wrapper<ZhiyuanzheshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzheshenqingVO selectVO(Wrapper<ZhiyuanzheshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzheshenqingView> selectListView(Wrapper<ZhiyuanzheshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzheshenqingView selectView(Wrapper<ZhiyuanzheshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
