package com.dao;

import com.entity.KechengziliaokuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengziliaokuVO;
import com.entity.view.KechengziliaokuView;


/**
 * 课程资料库
 * 
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public interface KechengziliaokuDao extends BaseMapper<KechengziliaokuEntity> {
	
	List<KechengziliaokuVO> selectListVO(@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);
	
	KechengziliaokuVO selectVO(@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);
	
	List<KechengziliaokuView> selectListView(@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);

	List<KechengziliaokuView> selectListView(Pagination page,@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);
	
	KechengziliaokuView selectView(@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);
	
}
