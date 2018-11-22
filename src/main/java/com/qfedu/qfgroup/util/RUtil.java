package com.qfedu.qfgroup.util;

import com.qfedu.qfgroup.vo.R;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:38
 */
public class RUtil {
    public static R setOK(String msg){
        return new R(1000,msg,null);
    }
    public static R setERROR(String msg){
        return new R(2000,msg,null);
    }

}
