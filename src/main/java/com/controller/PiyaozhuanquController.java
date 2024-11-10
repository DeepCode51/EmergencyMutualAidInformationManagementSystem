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

import com.entity.PiyaozhuanquEntity;
import com.entity.view.PiyaozhuanquView;

import com.service.PiyaozhuanquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 辟谣专区
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-18 19:21:56
 */
@RestController
@RequestMapping("/piyaozhuanqu")
public class PiyaozhuanquController {
    @Autowired
    private PiyaozhuanquService piyaozhuanquService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PiyaozhuanquEntity piyaozhuanqu, 
		HttpServletRequest request){

        EntityWrapper<PiyaozhuanquEntity> ew = new EntityWrapper<PiyaozhuanquEntity>();
		PageUtils page = piyaozhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, piyaozhuanqu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PiyaozhuanquEntity piyaozhuanqu, 
		HttpServletRequest request){
        EntityWrapper<PiyaozhuanquEntity> ew = new EntityWrapper<PiyaozhuanquEntity>();
		PageUtils page = piyaozhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, piyaozhuanqu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PiyaozhuanquEntity piyaozhuanqu){
       	EntityWrapper<PiyaozhuanquEntity> ew = new EntityWrapper<PiyaozhuanquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( piyaozhuanqu, "piyaozhuanqu")); 
        return R.ok().put("data", piyaozhuanquService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PiyaozhuanquEntity piyaozhuanqu){
        EntityWrapper< PiyaozhuanquEntity> ew = new EntityWrapper< PiyaozhuanquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( piyaozhuanqu, "piyaozhuanqu")); 
		PiyaozhuanquView piyaozhuanquView =  piyaozhuanquService.selectView(ew);
		return R.ok("查询辟谣专区成功").put("data", piyaozhuanquView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PiyaozhuanquEntity piyaozhuanqu = piyaozhuanquService.selectById(id);
		piyaozhuanqu.setClicknum(piyaozhuanqu.getClicknum()+1);
		piyaozhuanqu.setClicktime(new Date());
		piyaozhuanquService.updateById(piyaozhuanqu);
        return R.ok().put("data", piyaozhuanqu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PiyaozhuanquEntity piyaozhuanqu = piyaozhuanquService.selectById(id);
		piyaozhuanqu.setClicknum(piyaozhuanqu.getClicknum()+1);
		piyaozhuanqu.setClicktime(new Date());
		piyaozhuanquService.updateById(piyaozhuanqu);
        return R.ok().put("data", piyaozhuanqu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PiyaozhuanquEntity piyaozhuanqu, HttpServletRequest request){
    	piyaozhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(piyaozhuanqu);

        piyaozhuanquService.insert(piyaozhuanqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody PiyaozhuanquEntity piyaozhuanqu, HttpServletRequest request){
    	piyaozhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(piyaozhuanqu);

        piyaozhuanquService.insert(piyaozhuanqu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PiyaozhuanquEntity piyaozhuanqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(piyaozhuanqu);
        piyaozhuanquService.updateById(piyaozhuanqu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        piyaozhuanquService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PiyaozhuanquEntity> wrapper = new EntityWrapper<PiyaozhuanquEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = piyaozhuanquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,PiyaozhuanquEntity piyaozhuanqu, HttpServletRequest request,String pre){
        EntityWrapper<PiyaozhuanquEntity> ew = new EntityWrapper<PiyaozhuanquEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = piyaozhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, piyaozhuanqu), params), params));
        return R.ok().put("data", page);
    }







}
