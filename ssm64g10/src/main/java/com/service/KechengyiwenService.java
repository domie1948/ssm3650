package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengyiwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengyiwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengyiwenView;


/**
 * 课程疑问
 *
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public interface KechengyiwenService extends IService<KechengyiwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengyiwenVO> selectListVO(Wrapper<KechengyiwenEntity> wrapper);
   	
   	KechengyiwenVO selectVO(@Param("ew") Wrapper<KechengyiwenEntity> wrapper);
   	
   	List<KechengyiwenView> selectListView(Wrapper<KechengyiwenEntity> wrapper);
   	
   	KechengyiwenView selectView(@Param("ew") Wrapper<KechengyiwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengyiwenEntity> wrapper);
   	
}

