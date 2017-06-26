package com.deok.domain;

public class AuthVO {

    private String id;
    private String password;
    private String userName;
    private String profile;
    private int    dbNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getDbNum() {
        return dbNum;
    }

    public void setDbNum(int dbNum) {
        this.dbNum = dbNum;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AuthVO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", profile='").append(profile).append('\'');
        sb.append(", dbNum=").append(dbNum);
        sb.append('}');
        return sb.toString();
    }
}
