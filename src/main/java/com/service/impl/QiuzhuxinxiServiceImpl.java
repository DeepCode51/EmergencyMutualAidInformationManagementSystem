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


import com.dao.QiuzhuxinxiDao;
import com.entity.QiuzhuxinxiEntity;
import com.service.QiuzhuxinxiService;
import com.entity.vo.QiuzhuxinxiVO;
import com.entity.view.QiuzhuxinxiView;

@Service("qiuzhuxinxiService")
public class QiuzhuxinxiServiceImpl extends ServiceImpl<QiuzhuxinxiDao, QiuzhuxinxiEntity> implements QiuzhuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuzhuxinxiEntity> page = this.selectPage(
                new Query<QiuzhuxinxiEntity>(params).getPage(),
                new EntityWrapper<QiuzhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuzhuxinxiEntity> wrapper) {
		  Page<QiuzhuxinxiView> page =new Query<QiuzhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuzhuxinxiVO> selectListVO(Wrapper<QiuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuzhuxinxiVO selectVO(Wrapper<QiuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuzhuxinxiView> selectListView(Wrapper<QiuzhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuzhuxinxiView selectView(Wrapper<QiuzhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QiuzhuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QiuzhuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QiuzhuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
