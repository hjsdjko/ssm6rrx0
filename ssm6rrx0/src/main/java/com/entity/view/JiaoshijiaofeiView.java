package com.entity.view;

import com.entity.JiaoshijiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师缴费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-21 14:16:49
 */
@TableName("jiaoshijiaofei")
public class JiaoshijiaofeiView  extends JiaoshijiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshijiaofeiView(){
	}
 
 	public JiaoshijiaofeiView(JiaoshijiaofeiEntity jiaoshijiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshijiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
