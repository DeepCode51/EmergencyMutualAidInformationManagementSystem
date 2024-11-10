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


import com.dao.GongzuofenpeiDao;
import com.entity.GongzuofenpeiEntity;
import com.service.GongzuofenpeiService;
import com.entity.vo.GongzuofenpeiVO;
import com.entity.view.GongzuofenpeiView;

@Service("gongzuofenpeiService")
public class GongzuofenpeiServiceImpl extends ServiceImpl<GongzuofenpeiDao, GongzuofenpeiEntity> implements GongzuofenpeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuofenpeiEntity> page = this.selectPage(
                new Query<GongzuofenpeiEntity>(params).getPage(),
                new EntityWrapper<GongzuofenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuofenpeiEntity> wrapper) {
		  Page<GongzuofenpeiView> page =new Query<GongzuofenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuofenpeiVO> selectListVO(Wrapper<GongzuofenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuofenpeiVO selectVO(Wrapper<GongzuofenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuofenpeiView> selectListView(Wrapper<GongzuofenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuofenpeiView selectView(Wrapper<GongzuofenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
