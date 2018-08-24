package com.ins.sys.log.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "log_info", schema = "wumei_system", catalog = "")
public class LogInfoEntity {
    private String logId;
    private String userId;
    private String logUser;
    private Integer logTime;
    private String logDes;
    private String logContene;

    @Id
    @Column(name = "log_id")
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "log_user")
    public String getLogUser() {
        return logUser;
    }

    public void setLogUser(String logUser) {
        this.logUser = logUser;
    }

    @Basic
    @Column(name = "log_time")
    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    @Basic
    @Column(name = "log_des")
    public String getLogDes() {
        return logDes;
    }

    public void setLogDes(String logDes) {
        this.logDes = logDes;
    }

    @Basic
    @Column(name = "log_contene")
    public String getLogContene() {
        return logContene;
    }

    public void setLogContene(String logContene) {
        this.logContene = logContene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogInfoEntity that = (LogInfoEntity) o;
        return Objects.equals(logId, that.logId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(logUser, that.logUser) &&
                Objects.equals(logTime, that.logTime) &&
                Objects.equals(logDes, that.logDes) &&
                Objects.equals(logContene, that.logContene);
    }

    @Override
    public int hashCode() {

        return Objects.hash(logId, userId, logUser, logTime, logDes, logContene);
    }
}
