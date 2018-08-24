package com.ins.sys.user.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_user_info", schema = "wumei_system", catalog = "")
public class SysUserInfoEntity {
    private String userId;
    private String organId;
    private String userAccount;
    private String userPwd;
    private String userName;
    private Long phone;
    private String mail;
    private String wechat;
    private String idCard;
    private Integer gender;
    private Long createTime;

    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "organ_id")
    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    @Basic
    @Column(name = "user_account")
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Basic
    @Column(name = "user_pwd")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "phone")
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "wechat")
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "id_card")
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserInfoEntity that = (SysUserInfoEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(organId, that.organId) &&
                Objects.equals(userAccount, that.userAccount) &&
                Objects.equals(userPwd, that.userPwd) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(idCard, that.idCard) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, organId, userAccount, userPwd, userName, phone, mail, wechat, idCard, gender, createTime);
    }
}
