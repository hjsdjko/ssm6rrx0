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

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoshijiaofeiEntity;
import com.entity.view.JiaoshijiaofeiView;

import com.service.JiaoshijiaofeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 教师缴费
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-21 14:16:49
 */
@RestController
@RequestMapping("/jiaoshijiaofei")
public class JiaoshijiaofeiController {
    @Autowired
    private JiaoshijiaofeiService jiaoshijiaofeiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshijiaofeiEntity jiaoshijiaofei, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoshijiaofei.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshijiaofeiEntity> ew = new EntityWrapper<JiaoshijiaofeiEntity>();
		PageUtils page = jiaoshijiaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshijiaofei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshijiaofeiEntity jiaoshijiaofei, HttpServletRequest request){
        EntityWrapper<JiaoshijiaofeiEntity> ew = new EntityWrapper<JiaoshijiaofeiEntity>();
		PageUtils page = jiaoshijiaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshijiaofei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshijiaofeiEntity jiaoshijiaofei){
       	EntityWrapper<JiaoshijiaofeiEntity> ew = new EntityWrapper<JiaoshijiaofeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshijiaofei, "jiaoshijiaofei")); 
        return R.ok().put("data", jiaoshijiaofeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshijiaofeiEntity jiaoshijiaofei){
        EntityWrapper< JiaoshijiaofeiEntity> ew = new EntityWrapper< JiaoshijiaofeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshijiaofei, "jiaoshijiaofei")); 
		JiaoshijiaofeiView jiaoshijiaofeiView =  jiaoshijiaofeiService.selectView(ew);
		return R.ok("查询教师缴费成功").put("data", jiaoshijiaofeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshijiaofeiEntity jiaoshijiaofei = jiaoshijiaofeiService.selectById(id);
        return R.ok().put("data", jiaoshijiaofei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshijiaofeiEntity jiaoshijiaofei = jiaoshijiaofeiService.selectById(id);
        return R.ok().put("data", jiaoshijiaofei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshijiaofeiEntity jiaoshijiaofei, HttpServletRequest request){
    	jiaoshijiaofei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshijiaofei);

        jiaoshijiaofeiService.insert(jiaoshijiaofei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshijiaofeiEntity jiaoshijiaofei, HttpServletRequest request){
    	jiaoshijiaofei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshijiaofei);

        jiaoshijiaofeiService.insert(jiaoshijiaofei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoshijiaofeiEntity jiaoshijiaofei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshijiaofei);
        jiaoshijiaofeiService.updateById(jiaoshijiaofei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshijiaofeiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiaoshijiaofeiEntity> wrapper = new EntityWrapper<JiaoshijiaofeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaoshijiaofeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
