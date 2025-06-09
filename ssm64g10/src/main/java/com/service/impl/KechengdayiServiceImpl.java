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


import com.dao.KechengdayiDao;
import com.entity.KechengdayiEntity;
import com.service.KechengdayiService;
import com.entity.vo.KechengdayiVO;
import com.entity.view.KechengdayiView;

@Service("kechengdayiService")
public class KechengdayiServiceImpl extends ServiceImpl<KechengdayiDao, KechengdayiEntity> implements KechengdayiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengdayiEntity> page = this.selectPage(
                new Query<KechengdayiEntity>(params).getPage(),
                new EntityWrapper<KechengdayiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengdayiEntity> wrapper) {
		  Page<KechengdayiView> page =new Query<KechengdayiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengdayiVO> selectListVO(Wrapper<KechengdayiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengdayiVO selectVO(Wrapper<KechengdayiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengdayiView> selectListView(Wrapper<KechengdayiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengdayiView selectView(Wrapper<KechengdayiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
