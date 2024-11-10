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


import com.dao.PiyaozhuanquDao;
import com.entity.PiyaozhuanquEntity;
import com.service.PiyaozhuanquService;
import com.entity.vo.PiyaozhuanquVO;
import com.entity.view.PiyaozhuanquView;

@Service("piyaozhuanquService")
public class PiyaozhuanquServiceImpl extends ServiceImpl<PiyaozhuanquDao, PiyaozhuanquEntity> implements PiyaozhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PiyaozhuanquEntity> page = this.selectPage(
                new Query<PiyaozhuanquEntity>(params).getPage(),
                new EntityWrapper<PiyaozhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PiyaozhuanquEntity> wrapper) {
		  Page<PiyaozhuanquView> page =new Query<PiyaozhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PiyaozhuanquVO> selectListVO(Wrapper<PiyaozhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PiyaozhuanquVO selectVO(Wrapper<PiyaozhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PiyaozhuanquView> selectListView(Wrapper<PiyaozhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PiyaozhuanquView selectView(Wrapper<PiyaozhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
