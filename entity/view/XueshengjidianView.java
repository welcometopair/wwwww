package com.entity.view;

import com.entity.XueshengjidianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生绩点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-06 16:42:46
 */
@TableName("xueshengjidian")
public class XueshengjidianView  extends XueshengjidianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengjidianView(){
	}
 
 	public XueshengjidianView(XueshengjidianEntity xueshengjidianEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengjidianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
