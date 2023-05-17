package com.entity.view;

import com.entity.PingshichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 平时成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-06 16:42:46
 */
@TableName("pingshichengji")
public class PingshichengjiView  extends PingshichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingshichengjiView(){
	}
 
 	public PingshichengjiView(PingshichengjiEntity pingshichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, pingshichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
