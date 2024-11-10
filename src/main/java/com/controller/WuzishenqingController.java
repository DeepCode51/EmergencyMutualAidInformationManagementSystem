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

import com.entity.WuzishenqingEntity;
import com.entity.view.WuzishenqingView;

import com.service.WuzishenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 物资申请
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@RestController
@RequestMapping("/wuzishenqing")
public class WuzishenqingController {
    @Autowired
    private WuzishenqingService wuzishenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WuzishenqingEntity wuzishenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wuzishenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WuzishenqingEntity> ew = new EntityWrapper<WuzishenqingEntity>();
		PageUtils page = wuzishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzishenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WuzishenqingEntity wuzishenqing, 
		HttpServletRequest request){
        EntityWrapper<WuzishenqingEntity> ew = new EntityWrapper<WuzishenqingEntity>();
		PageUtils page = wuzishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WuzishenqingEntity wuzishenqing){
       	EntityWrapper<WuzishenqingEntity> ew = new EntityWrapper<WuzishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wuzishenqing, "wuzishenqing")); 
        return R.ok().put("data", wuzishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WuzishenqingEntity wuzishenqing){
        EntityWrapper< WuzishenqingEntity> ew = new EntityWrapper< WuzishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wuzishenqing, "wuzishenqing")); 
		WuzishenqingView wuzishenqingView =  wuzishenqingService.selectView(ew);
		return R.ok("查询物资申请成功").put("data", wuzishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WuzishenqingEntity wuzishenqing = wuzishenqingService.selectById(id);
        return R.ok().put("data", wuzishenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WuzishenqingEntity wuzishenqing = wuzishenqingService.selectById(id);
        return R.ok().put("data", wuzishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WuzishenqingEntity wuzishenqing, HttpServletRequest request){
    	wuzishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzishenqing);

        wuzishenqingService.insert(wuzishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WuzishenqingEntity wuzishenqing, HttpServletRequest request){
    	wuzishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzishenqing);

        wuzishenqingService.insert(wuzishenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WuzishenqingEntity wuzishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wuzishenqing);
        wuzishenqingService.updateById(wuzishenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wuzishenqingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WuzishenqingEntity> wrapper = new EntityWrapper<WuzishenqingEntity>();
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

		int count = wuzishenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
