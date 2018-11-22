package com.qfedu.qfgroup.service;

import com.qfedu.qfgroup.pojo.ClassGroup;
import com.qfedu.qfgroup.vo.R;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:35
 */
public interface ClassGroupService {
    //新增
    R save(ClassGroup classGroup);
    //查询
    List<ClassGroup> queryAll();

    //查询班级的最新的主键
    ClassGroup queryByClass(String cno);

}
