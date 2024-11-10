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


import com.dao.WuzizhongleiDao;
import com.entity.WuzizhongleiEntity;
import com.service.WuzizhongleiService;
import com.entity.vo.WuzizhongleiVO;
import com.entity.view.WuzizhongleiView;

@Service("wuzizhongleiService")
public class WuzizhongleiServiceImpl extends ServiceImpl<WuzizhongleiDao, WuzizhongleiEntity> implements WuzizhongleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzizhongleiEntity> page = this.selectPage(
                new Query<WuzizhongleiEntity>(params).getPage(),
                new EntityWrapper<WuzizhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzizhongleiEntity> wrapper) {
		  Page<WuzizhongleiView> page =new Query<WuzizhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzizhongleiVO> selectListVO(Wrapper<WuzizhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzizhongleiVO selectVO(Wrapper<WuzizhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzizhongleiView> selectListView(Wrapper<WuzizhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzizhongleiView selectView(Wrapper<WuzizhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
