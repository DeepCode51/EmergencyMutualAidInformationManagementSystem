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


import com.dao.ZhaomuxinxiDao;
import com.entity.ZhaomuxinxiEntity;
import com.service.ZhaomuxinxiService;
import com.entity.vo.ZhaomuxinxiVO;
import com.entity.view.ZhaomuxinxiView;

@Service("zhaomuxinxiService")
public class ZhaomuxinxiServiceImpl extends ServiceImpl<ZhaomuxinxiDao, ZhaomuxinxiEntity> implements ZhaomuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaomuxinxiEntity> page = this.selectPage(
                new Query<ZhaomuxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhaomuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaomuxinxiEntity> wrapper) {
		  Page<ZhaomuxinxiView> page =new Query<ZhaomuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaomuxinxiVO> selectListVO(Wrapper<ZhaomuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaomuxinxiVO selectVO(Wrapper<ZhaomuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaomuxinxiView> selectListView(Wrapper<ZhaomuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaomuxinxiView selectView(Wrapper<ZhaomuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
