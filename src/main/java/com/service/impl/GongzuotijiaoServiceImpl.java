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


import com.dao.GongzuotijiaoDao;
import com.entity.GongzuotijiaoEntity;
import com.service.GongzuotijiaoService;
import com.entity.vo.GongzuotijiaoVO;
import com.entity.view.GongzuotijiaoView;

@Service("gongzuotijiaoService")
public class GongzuotijiaoServiceImpl extends ServiceImpl<GongzuotijiaoDao, GongzuotijiaoEntity> implements GongzuotijiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuotijiaoEntity> page = this.selectPage(
                new Query<GongzuotijiaoEntity>(params).getPage(),
                new EntityWrapper<GongzuotijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuotijiaoEntity> wrapper) {
		  Page<GongzuotijiaoView> page =new Query<GongzuotijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuotijiaoVO> selectListVO(Wrapper<GongzuotijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuotijiaoVO selectVO(Wrapper<GongzuotijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuotijiaoView> selectListView(Wrapper<GongzuotijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuotijiaoView selectView(Wrapper<GongzuotijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
