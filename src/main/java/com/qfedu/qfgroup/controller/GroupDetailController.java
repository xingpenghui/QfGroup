package com.qfedu.qfgroup.controller;
import com.qfedu.qfgroup.pojo.GroupDetail;
import com.qfedu.qfgroup.service.GroupDetailService;
import com.qfedu.qfgroup.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:57
 */
@RestController
public class GroupDetailController {
    @Autowired
    private GroupDetailService groupDetailService;

    //新增
    @PostMapping("gdsave")
    public R save(GroupDetail groupDetail){
        return groupDetailService.save(groupDetail);
    }
    //查询
    @GetMapping("gdclass")
    public List<GroupDetail> queryBy(int cgid){
        return groupDetailService.queryByCgid(cgid);
    }
    //查询同组人员
    @GetMapping("gdgroup")
    public List<GroupDetail> queryByGid(int cgid,int gid){
        return groupDetailService.queryByGid(cgid, gid);
    }
}
