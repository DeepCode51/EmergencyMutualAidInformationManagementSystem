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


import com.dao.JinjitongzhiDao;
import com.entity.JinjitongzhiEntity;
import com.service.JinjitongzhiService;
import com.entity.vo.JinjitongzhiVO;
import com.entity.view.JinjitongzhiView;

@Service("jinjitongzhiService")
public class JinjitongzhiServiceImpl extends ServiceImpl<JinjitongzhiDao, JinjitongzhiEntity> implements JinjitongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinjitongzhiEntity> page = this.selectPage(
                new Query<JinjitongzhiEntity>(params).getPage(),
                new EntityWrapper<JinjitongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinjitongzhiEntity> wrapper) {
		  Page<JinjitongzhiView> page =new Query<JinjitongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinjitongzhiVO> selectListVO(Wrapper<JinjitongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinjitongzhiVO selectVO(Wrapper<JinjitongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinjitongzhiView> selectListView(Wrapper<JinjitongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinjitongzhiView selectView(Wrapper<JinjitongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
