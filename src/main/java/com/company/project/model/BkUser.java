package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bk_user")
public class BkUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private Short age;

    @Column(name = "xx_yy")
    private String xxYy;

    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return age
     */
    public Short getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * @return xx_yy
     */
    public String getXxYy() {
        return xxYy;
    }

    /**
     * @param xxYy
     */
    public void setXxYy(String xxYy) {
        this.xxYy = xxYy;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}