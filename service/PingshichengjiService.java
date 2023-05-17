package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingshichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingshichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingshichengjiView;


/**
 * 平时成绩
 *
 * @author 
 * @email 
 * @date 2023-03-06 16:42:46
 */
public interface PingshichengjiService extends IService<PingshichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingshichengjiVO> selectListVO(Wrapper<PingshichengjiEntity> wrapper);
   	
   	PingshichengjiVO selectVO(@Param("ew") Wrapper<PingshichengjiEntity> wrapper);
   	
   	List<PingshichengjiView> selectListView(Wrapper<PingshichengjiEntity> wrapper);
   	
   	PingshichengjiView selectView(@Param("ew") Wrapper<PingshichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingshichengjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<PingshichengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<PingshichengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<PingshichengjiEntity> wrapper);



}

