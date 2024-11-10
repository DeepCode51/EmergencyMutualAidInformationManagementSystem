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


import com.dao.WuzifenpeiDao;
import com.entity.WuzifenpeiEntity;
import com.service.WuzifenpeiService;
import com.entity.vo.WuzifenpeiVO;
import com.entity.view.WuzifenpeiView;

@Service("wuzifenpeiService")
public class WuzifenpeiServiceImpl extends ServiceImpl<WuzifenpeiDao, WuzifenpeiEntity> implements WuzifenpeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzifenpeiEntity> page = this.selectPage(
                new Query<WuzifenpeiEntity>(params).getPage(),
                new EntityWrapper<WuzifenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzifenpeiEntity> wrapper) {
		  Page<WuzifenpeiView> page =new Query<WuzifenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzifenpeiVO> selectListVO(Wrapper<WuzifenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzifenpeiVO selectVO(Wrapper<WuzifenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzifenpeiView> selectListView(Wrapper<WuzifenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzifenpeiView selectView(Wrapper<WuzifenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
