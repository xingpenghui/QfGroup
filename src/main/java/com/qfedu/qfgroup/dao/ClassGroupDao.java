package com.qfedu.qfgroup.dao;

import com.qfedu.qfgroup.pojo.ClassGroup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:34
 */
public interface ClassGroupDao extends JpaRepository<ClassGroup,Integer> {
    ClassGroup findByClassno(String cno);
}
