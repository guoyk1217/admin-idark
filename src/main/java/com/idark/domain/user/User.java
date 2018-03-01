package com.idark.domain.user;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author guoyakui
 *
 * 用户实体
 *
 * @date created in 12:09 2018/2/26
 */
public class User implements Serializable {

    private String id;
    private String code;
    @JSONField(serialize = false)
    private String pwd;
    private String name;
    private String telephone;
    private int status;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;


    public User() {
    }

    public User(String code, String pwd, String name, String telephone) {
        super();
        this.code = code;
        this.pwd = pwd;
        this.name = name;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", status=" + status +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", ext4='" + ext4 + '\'' +
                '}';
    }
}
