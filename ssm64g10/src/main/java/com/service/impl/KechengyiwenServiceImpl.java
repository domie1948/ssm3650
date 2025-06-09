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


import com.dao.KechengyiwenDao;
import com.entity.KechengyiwenEntity;
import com.service.KechengyiwenService;
import com.entity.vo.KechengyiwenVO;
import com.entity.view.KechengyiwenView;

@Service("kechengyiwenService")
public class KechengyiwenServiceImpl extends ServiceImpl<KechengyiwenDao, KechengyiwenEntity> implements KechengyiwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengyiwenEntity> page = this.selectPage(
                new Query<KechengyiwenEntity>(params).getPage(),
                new EntityWrapper<KechengyiwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengyiwenEntity> wrapper) {
		  Page<KechengyiwenView> page =new Query<KechengyiwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengyiwenVO> selectListVO(Wrapper<KechengyiwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengyiwenVO selectVO(Wrapper<KechengyiwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengyiwenView> selectListView(Wrapper<KechengyiwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengyiwenView selectView(Wrapper<KechengyiwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
