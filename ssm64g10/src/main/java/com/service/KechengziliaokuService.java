package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengziliaokuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengziliaokuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengziliaokuView;


/**
 * 课程资料库
 *
 * @author 
 * @email 
 * @date 2021-04-29 17:56:24
 */
public interface KechengziliaokuService extends IService<KechengziliaokuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengziliaokuVO> selectListVO(Wrapper<KechengziliaokuEntity> wrapper);
   	
   	KechengziliaokuVO selectVO(@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);
   	
   	List<KechengziliaokuView> selectListView(Wrapper<KechengziliaokuEntity> wrapper);
   	
   	KechengziliaokuView selectView(@Param("ew") Wrapper<KechengziliaokuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengziliaokuEntity> wrapper);
   	
}

