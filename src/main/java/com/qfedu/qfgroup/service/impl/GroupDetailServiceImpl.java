package com.qfedu.qfgroup.service.impl;

import com.qfedu.qfgroup.dao.GroupDetailDao;
import com.qfedu.qfgroup.pojo.GroupDetail;
import com.qfedu.qfgroup.service.GroupDetailService;
import com.qfedu.qfgroup.util.DateUtil;
import com.qfedu.qfgroup.util.RUtil;
import com.qfedu.qfgroup.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:43
 */
@Service
public class GroupDetailServiceImpl implements GroupDetailService {

    @Autowired
    private GroupDetailDao groupDetailDao;

    @Override
    public List<GroupDetail> queryByCgid(int cgid) {
        return groupDetailDao.findByCgid(cgid);
    }

    @Override
    public R save(GroupDetail groupDetail) {
        groupDetail.setCreatedate(DateUtil.getDate());
        if(groupDetailDao.save(groupDetail)!=null){
            return RUtil.setOK("分组成功");
        }else{
            return RUtil.setERROR("分组失败");
        }
    }

    @Override
    public List<GroupDetail> queryByGid(int cgid, int gid) {
        return groupDetailDao.findByCgidAndAndGid(cgid,gid);
    }
}
