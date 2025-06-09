package com.dao;

import com.entity.KechengdayiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengdayiVO;
import com.entity.view.KechengdayiView;


/**
 * 课程答疑
 * 
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public interface KechengdayiDao extends BaseMapper<KechengdayiEntity> {
	
	List<KechengdayiVO> selectListVO(@Param("ew") Wrapper<KechengdayiEntity> wrapper);
	
	KechengdayiVO selectVO(@Param("ew") Wrapper<KechengdayiEntity> wrapper);
	
	List<KechengdayiView> selectListView(@Param("ew") Wrapper<KechengdayiEntity> wrapper);

	List<KechengdayiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengdayiEntity> wrapper);
	
	KechengdayiView selectView(@Param("ew") Wrapper<KechengdayiEntity> wrapper);
	
}
