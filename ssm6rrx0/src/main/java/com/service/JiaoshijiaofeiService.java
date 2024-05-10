package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshijiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshijiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshijiaofeiView;


/**
 * 教师缴费
 *
 * @author 
 * @email 
 * @date 2021-01-21 14:16:49
 */
public interface JiaoshijiaofeiService extends IService<JiaoshijiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshijiaofeiVO> selectListVO(Wrapper<JiaoshijiaofeiEntity> wrapper);
   	
   	JiaoshijiaofeiVO selectVO(@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);
   	
   	List<JiaoshijiaofeiView> selectListView(Wrapper<JiaoshijiaofeiEntity> wrapper);
   	
   	JiaoshijiaofeiView selectView(@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshijiaofeiEntity> wrapper);
   	
}

