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


import com.dao.YiliaojiuzhuDao;
import com.entity.YiliaojiuzhuEntity;
import com.service.YiliaojiuzhuService;
import com.entity.vo.YiliaojiuzhuVO;
import com.entity.view.YiliaojiuzhuView;

@Service("yiliaojiuzhuService")
public class YiliaojiuzhuServiceImpl extends ServiceImpl<YiliaojiuzhuDao, YiliaojiuzhuEntity> implements YiliaojiuzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaojiuzhuEntity> page = this.selectPage(
                new Query<YiliaojiuzhuEntity>(params).getPage(),
                new EntityWrapper<YiliaojiuzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaojiuzhuEntity> wrapper) {
		  Page<YiliaojiuzhuView> page =new Query<YiliaojiuzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaojiuzhuVO> selectListVO(Wrapper<YiliaojiuzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaojiuzhuVO selectVO(Wrapper<YiliaojiuzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaojiuzhuView> selectListView(Wrapper<YiliaojiuzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaojiuzhuView selectView(Wrapper<YiliaojiuzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
