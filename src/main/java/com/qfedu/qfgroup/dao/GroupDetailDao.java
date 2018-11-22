package com.qfedu.qfgroup.dao;

import com.qfedu.qfgroup.pojo.GroupDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:35
 */
public interface GroupDetailDao extends JpaRepository<GroupDetail,Integer> {
    List<GroupDetail> findByCgid(int cgid);
    List<GroupDetail> findByCgidAndAndGid(int cgid,int gid);
}
