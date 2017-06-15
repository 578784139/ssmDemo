package cn.bdqn.tangcco.entity;

import java.util.Date;

/**
 * Created by HP on 2017/6/13.
 */
public class Tbuser {
    private Integer userid;
    private String username,password,userroles,nickname;
    private Date registrationtime,dateofbilth,systemtime;

    public Date getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    public Date getDateofbilth() {
        return dateofbilth;
    }

    public void setDateofbilth(Date dateofbilth) {
        this.dateofbilth = dateofbilth;
    }

    public Date getSystemtime() {
        return systemtime;
    }

    public void setSystemtime(Date systemtime) {
        this.systemtime = systemtime;
    }

    public Integer   getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Tbuser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userroles='" + userroles + '\'' +
                ", nickname='" + nickname + '\'' +
                ", registrationtime=" + registrationtime +
                ", dateofbilth=" + dateofbilth +
                ", systemtime=" + systemtime +
                '}';
    }
}
