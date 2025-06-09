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


import com.dao.KechengziliaokuDao;
import com.entity.KechengziliaokuEntity;
import com.service.KechengziliaokuService;
import com.entity.vo.KechengziliaokuVO;
import com.entity.view.KechengziliaokuView;

@Service("kechengziliaokuService")
public class KechengziliaokuServiceImpl extends ServiceImpl<KechengziliaokuDao, KechengziliaokuEntity> implements KechengziliaokuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengziliaokuEntity> page = this.selectPage(
                new Query<KechengziliaokuEntity>(params).getPage(),
                new EntityWrapper<KechengziliaokuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengziliaokuEntity> wrapper) {
		  Page<KechengziliaokuView> page =new Query<KechengziliaokuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengziliaokuVO> selectListVO(Wrapper<KechengziliaokuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengziliaokuVO selectVO(Wrapper<KechengziliaokuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengziliaokuView> selectListView(Wrapper<KechengziliaokuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengziliaokuView selectView(Wrapper<KechengziliaokuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
