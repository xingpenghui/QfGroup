package com.qfedu.qfgroup.pojo;

import javax.persistence.*;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:29
 */
@Entity
@Table(name = "t_classgroup")
public class ClassGroup {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String classno;
    private int count;
    private int stunum;
    private int groupstus;
    private int groupnum;
    private int flag;

    private String createdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }

    public int getGroupstus() {
        return groupstus;
    }

    public void setGroupstus(int groupstus) {
        this.groupstus = groupstus;
    }

    public int getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(int groupnum) {
        this.groupnum = groupnum;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
