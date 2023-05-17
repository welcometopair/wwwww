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


import com.dao.XueshengjidianDao;
import com.entity.XueshengjidianEntity;
import com.service.XueshengjidianService;
import com.entity.vo.XueshengjidianVO;
import com.entity.view.XueshengjidianView;

@Service("xueshengjidianService")
public class XueshengjidianServiceImpl extends ServiceImpl<XueshengjidianDao, XueshengjidianEntity> implements XueshengjidianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjidianEntity> page = this.selectPage(
                new Query<XueshengjidianEntity>(params).getPage(),
                new EntityWrapper<XueshengjidianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjidianEntity> wrapper) {
		  Page<XueshengjidianView> page =new Query<XueshengjidianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjidianVO> selectListVO(Wrapper<XueshengjidianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjidianVO selectVO(Wrapper<XueshengjidianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjidianView> selectListView(Wrapper<XueshengjidianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjidianView selectView(Wrapper<XueshengjidianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XueshengjidianEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XueshengjidianEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XueshengjidianEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
