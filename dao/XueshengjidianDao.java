package com.dao;

import com.entity.XueshengjidianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjidianVO;
import com.entity.view.XueshengjidianView;


/**
 * 学生绩点
 * 
 * @author 
 * @email 
 * @date 2023-03-06 16:42:46
 */
public interface XueshengjidianDao extends BaseMapper<XueshengjidianEntity> {
	
	List<XueshengjidianVO> selectListVO(@Param("ew") Wrapper<XueshengjidianEntity> wrapper);
	
	XueshengjidianVO selectVO(@Param("ew") Wrapper<XueshengjidianEntity> wrapper);
	
	List<XueshengjidianView> selectListView(@Param("ew") Wrapper<XueshengjidianEntity> wrapper);

	List<XueshengjidianView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjidianEntity> wrapper);
	
	XueshengjidianView selectView(@Param("ew") Wrapper<XueshengjidianEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengjidianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengjidianEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengjidianEntity> wrapper);



}
