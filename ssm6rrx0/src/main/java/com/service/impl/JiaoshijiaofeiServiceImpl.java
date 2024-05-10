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


import com.dao.JiaoshijiaofeiDao;
import com.entity.JiaoshijiaofeiEntity;
import com.service.JiaoshijiaofeiService;
import com.entity.vo.JiaoshijiaofeiVO;
import com.entity.view.JiaoshijiaofeiView;

@Service("jiaoshijiaofeiService")
public class JiaoshijiaofeiServiceImpl extends ServiceImpl<JiaoshijiaofeiDao, JiaoshijiaofeiEntity> implements JiaoshijiaofeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshijiaofeiEntity> page = this.selectPage(
                new Query<JiaoshijiaofeiEntity>(params).getPage(),
                new EntityWrapper<JiaoshijiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshijiaofeiEntity> wrapper) {
		  Page<JiaoshijiaofeiView> page =new Query<JiaoshijiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshijiaofeiVO> selectListVO(Wrapper<JiaoshijiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshijiaofeiVO selectVO(Wrapper<JiaoshijiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshijiaofeiView> selectListView(Wrapper<JiaoshijiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshijiaofeiView selectView(Wrapper<JiaoshijiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
