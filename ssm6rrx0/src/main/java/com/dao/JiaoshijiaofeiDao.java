package com.dao;

import com.entity.JiaoshijiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshijiaofeiVO;
import com.entity.view.JiaoshijiaofeiView;


/**
 * 教师缴费
 * 
 * @author 
 * @email 
 * @date 2021-01-21 14:16:49
 */
public interface JiaoshijiaofeiDao extends BaseMapper<JiaoshijiaofeiEntity> {
	
	List<JiaoshijiaofeiVO> selectListVO(@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);
	
	JiaoshijiaofeiVO selectVO(@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);
	
	List<JiaoshijiaofeiView> selectListView(@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);

	List<JiaoshijiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);
	
	JiaoshijiaofeiView selectView(@Param("ew") Wrapper<JiaoshijiaofeiEntity> wrapper);
	
}
