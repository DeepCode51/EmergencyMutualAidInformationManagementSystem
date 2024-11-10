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


import com.dao.XinlizhishiDao;
import com.entity.XinlizhishiEntity;
import com.service.XinlizhishiService;
import com.entity.vo.XinlizhishiVO;
import com.entity.view.XinlizhishiView;

@Service("xinlizhishiService")
public class XinlizhishiServiceImpl extends ServiceImpl<XinlizhishiDao, XinlizhishiEntity> implements XinlizhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlizhishiEntity> page = this.selectPage(
                new Query<XinlizhishiEntity>(params).getPage(),
                new EntityWrapper<XinlizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlizhishiEntity> wrapper) {
		  Page<XinlizhishiView> page =new Query<XinlizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlizhishiVO> selectListVO(Wrapper<XinlizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlizhishiVO selectVO(Wrapper<XinlizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlizhishiView> selectListView(Wrapper<XinlizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlizhishiView selectView(Wrapper<XinlizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
