package com.qfedu.qfgroup.service;

import com.qfedu.qfgroup.pojo.GroupDetail;
import com.qfedu.qfgroup.vo.R;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:35
 */
public interface GroupDetailService {
    //查询  班级
    List<GroupDetail> queryByCgid(int cgid);
    //新增
    R save(GroupDetail groupDetail);
    //查询组内的人员
    List<GroupDetail> queryByGid(int cgid,int gid);
}
