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


import com.dao.QiuzhuleixingDao;
import com.entity.QiuzhuleixingEntity;
import com.service.QiuzhuleixingService;
import com.entity.vo.QiuzhuleixingVO;
import com.entity.view.QiuzhuleixingView;

@Service("qiuzhuleixingService")
public class QiuzhuleixingServiceImpl extends ServiceImpl<QiuzhuleixingDao, QiuzhuleixingEntity> implements QiuzhuleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuzhuleixingEntity> page = this.selectPage(
                new Query<QiuzhuleixingEntity>(params).getPage(),
                new EntityWrapper<QiuzhuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuzhuleixingEntity> wrapper) {
		  Page<QiuzhuleixingView> page =new Query<QiuzhuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuzhuleixingVO> selectListVO(Wrapper<QiuzhuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuzhuleixingVO selectVO(Wrapper<QiuzhuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuzhuleixingView> selectListView(Wrapper<QiuzhuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuzhuleixingView selectView(Wrapper<QiuzhuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
