package com.qj.mybatis.entity;

import java.util.Date;

public class SayUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.openId
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.userImg
     *
     * @mbggenerated
     */
    private String userimg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.userName
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.pwd
     *
     * @mbggenerated
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.userLevel
     *
     * @mbggenerated
     */
    private Integer userlevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.userType
     *
     * @mbggenerated
     */
    private String usertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column say_user.createTime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.id
     *
     * @return the value of say_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.id
     *
     * @param id the value for say_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.openId
     *
     * @return the value of say_user.openId
     *
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.openId
     *
     * @param openid the value for say_user.openId
     *
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.userImg
     *
     * @return the value of say_user.userImg
     *
     * @mbggenerated
     */
    public String getUserimg() {
        return userimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.userImg
     *
     * @param userimg the value for say_user.userImg
     *
     * @mbggenerated
     */
    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.userName
     *
     * @return the value of say_user.userName
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.userName
     *
     * @param username the value for say_user.userName
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.pwd
     *
     * @return the value of say_user.pwd
     *
     * @mbggenerated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.pwd
     *
     * @param pwd the value for say_user.pwd
     *
     * @mbggenerated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.userLevel
     *
     * @return the value of say_user.userLevel
     *
     * @mbggenerated
     */
    public Integer getUserlevel() {
        return userlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.userLevel
     *
     * @param userlevel the value for say_user.userLevel
     *
     * @mbggenerated
     */
    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.userType
     *
     * @return the value of say_user.userType
     *
     * @mbggenerated
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.userType
     *
     * @param usertype the value for say_user.userType
     *
     * @mbggenerated
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column say_user.createTime
     *
     * @return the value of say_user.createTime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column say_user.createTime
     *
     * @param createtime the value for say_user.createTime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}