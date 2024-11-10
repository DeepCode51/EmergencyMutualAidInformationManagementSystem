package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhaomubaomingEntity;
import com.entity.view.ZhaomubaomingView;

import com.service.ZhaomubaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 招募报名
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@RestController
@RequestMapping("/zhaomubaoming")
public class ZhaomubaomingController {
    @Autowired
    private ZhaomubaomingService zhaomubaomingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaomubaomingEntity zhaomubaoming, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhaomubaoming.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhaomubaomingEntity> ew = new EntityWrapper<ZhaomubaomingEntity>();
		PageUtils page = zhaomubaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaomubaoming), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaomubaomingEntity zhaomubaoming, 
		HttpServletRequest request){
        EntityWrapper<ZhaomubaomingEntity> ew = new EntityWrapper<ZhaomubaomingEntity>();
		PageUtils page = zhaomubaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaomubaoming), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaomubaomingEntity zhaomubaoming){
       	EntityWrapper<ZhaomubaomingEntity> ew = new EntityWrapper<ZhaomubaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaomubaoming, "zhaomubaoming")); 
        return R.ok().put("data", zhaomubaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaomubaomingEntity zhaomubaoming){
        EntityWrapper< ZhaomubaomingEntity> ew = new EntityWrapper< ZhaomubaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaomubaoming, "zhaomubaoming")); 
		ZhaomubaomingView zhaomubaomingView =  zhaomubaomingService.selectView(ew);
		return R.ok("查询招募报名成功").put("data", zhaomubaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaomubaomingEntity zhaomubaoming = zhaomubaomingService.selectById(id);
        return R.ok().put("data", zhaomubaoming);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaomubaomingEntity zhaomubaoming = zhaomubaomingService.selectById(id);
        return R.ok().put("data", zhaomubaoming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaomubaomingEntity zhaomubaoming, HttpServletRequest request){
    	zhaomubaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaomubaoming);

        zhaomubaomingService.insert(zhaomubaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaomubaomingEntity zhaomubaoming, HttpServletRequest request){
    	zhaomubaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaomubaoming);

        zhaomubaomingService.insert(zhaomubaoming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhaomubaomingEntity zhaomubaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhaomubaoming);
        zhaomubaomingService.updateById(zhaomubaoming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaomubaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhaomubaomingEntity> wrapper = new EntityWrapper<ZhaomubaomingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhaomubaomingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
