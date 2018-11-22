package com.qfedu.qfgroup.pojo;

import javax.persistence.*;

/**
 *@Author feri
 *@Date Created in 2018/11/22 09:29
 */
@Entity
@Table(name = "t_groupdetail")
public class GroupDetail {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int cgid;
    @Column(length = 20)
    private String stuname;
    private int gid;
    private String createdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCgid() {
        return cgid;
    }

    public void setCgid(int cgid) {
        this.cgid = cgid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
