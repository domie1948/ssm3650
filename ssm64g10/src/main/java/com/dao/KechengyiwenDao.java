package com.dao;

import com.entity.KechengyiwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengyiwenVO;
import com.entity.view.KechengyiwenView;


/**
 * 课程疑问
 * 
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public interface KechengyiwenDao extends BaseMapper<KechengyiwenEntity> {
	
	List<KechengyiwenVO> selectListVO(@Param("ew") Wrapper<KechengyiwenEntity> wrapper);
	
	KechengyiwenVO selectVO(@Param("ew") Wrapper<KechengyiwenEntity> wrapper);
	
	List<KechengyiwenView> selectListView(@Param("ew") Wrapper<KechengyiwenEntity> wrapper);

	List<KechengyiwenView> selectListView(Pagination page,@Param("ew") Wrapper<KechengyiwenEntity> wrapper);
	
	KechengyiwenView selectView(@Param("ew") Wrapper<KechengyiwenEntity> wrapper);
	
}
