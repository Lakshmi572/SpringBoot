package com.example.sequenceGenerator;

import javax.persistence.*;

@Entity
@Table(name="login_details")
public class Login {

    @Id
    @Column(name="User_id")
    @SequenceGenerator(name="user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "user_id_seq" , strategy = GenerationType.IDENTITY)
    private Integer UserId;

    @Column(name="name")
    private String name;

    @Column(name="User_name")
    private String Uname;

    @Column(name="Password")
    private String pwd;

    @Override
    public String toString() {
        return "Login{" +
                "UserId=" + UserId +
                ", name='" + name + '\'' +
                ", Uname='" + Uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
