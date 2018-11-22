package com.qfedu.qfgroup.controller;

import com.qfedu.qfgroup.pojo.ClassGroup;
import com.qfedu.qfgroup.service.ClassGroupService;
import com.qfedu.qfgroup.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:50
 */
@RestController   //等价于：@Controller+@ResponseBody  就是所有的返回值都是json
public class ClassGroupController {
    @Autowired
    private ClassGroupService classGroupService;
    //@RequestMapping(value = "",method = {RequestMethod.POST})
    //新增 post
    @PostMapping("/cgsave")
    public R save(ClassGroup classGroup){
        return classGroupService.save(classGroup);
    }
    //查询全部 get
    @GetMapping("/cgall")
    public List<ClassGroup> all(){
        return classGroupService.queryAll();
    }
    //查询班级对应的主键
    @GetMapping("/cgid")
    public ClassGroup save(String cno){
        return classGroupService.queryByClass(cno);
    }


}
