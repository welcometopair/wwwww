package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjidianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjidianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjidianView;


/**
 * 学生绩点
 *
 * @author 
 * @email 
 * @date 2023-03-06 16:42:46
 */
public interface XueshengjidianService extends IService<XueshengjidianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjidianVO> selectListVO(Wrapper<XueshengjidianEntity> wrapper);
   	
   	XueshengjidianVO selectVO(@Param("ew") Wrapper<XueshengjidianEntity> wrapper);
   	
   	List<XueshengjidianView> selectListView(Wrapper<XueshengjidianEntity> wrapper);
   	
   	XueshengjidianView selectView(@Param("ew") Wrapper<XueshengjidianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjidianEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XueshengjidianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XueshengjidianEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XueshengjidianEntity> wrapper);



}

