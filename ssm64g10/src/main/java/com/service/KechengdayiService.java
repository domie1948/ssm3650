package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengdayiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengdayiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengdayiView;


/**
 * 课程答疑
 *
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public interface KechengdayiService extends IService<KechengdayiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengdayiVO> selectListVO(Wrapper<KechengdayiEntity> wrapper);
   	
   	KechengdayiVO selectVO(@Param("ew") Wrapper<KechengdayiEntity> wrapper);
   	
   	List<KechengdayiView> selectListView(Wrapper<KechengdayiEntity> wrapper);
   	
   	KechengdayiView selectView(@Param("ew") Wrapper<KechengdayiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengdayiEntity> wrapper);
   	
}

