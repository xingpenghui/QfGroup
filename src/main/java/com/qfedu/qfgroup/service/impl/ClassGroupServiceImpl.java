package com.qfedu.qfgroup.service.impl;

import com.qfedu.qfgroup.dao.ClassGroupDao;
import com.qfedu.qfgroup.pojo.ClassGroup;
import com.qfedu.qfgroup.service.ClassGroupService;
import com.qfedu.qfgroup.util.DateUtil;
import com.qfedu.qfgroup.util.RUtil;
import com.qfedu.qfgroup.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:47
 */
@Service
public class ClassGroupServiceImpl implements ClassGroupService {
    @Autowired
    private ClassGroupDao classGroupDao;


    @Override
    public R save(ClassGroup classGroup) {
        classGroup.setCreatedate(DateUtil.getDate());
        if(classGroupDao.save(classGroup)!=null){
            return RUtil.setOK("新增班级组信息成功");
        }else{
            return RUtil.setERROR("新增班级组信息失败");
        }
    }

    @Override
    public List<ClassGroup> queryAll() {
        return classGroupDao.findAll();
    }

    @Override
    public ClassGroup queryByClass(String cno) {
        return classGroupDao.findByClassno(cno);
    }
}
