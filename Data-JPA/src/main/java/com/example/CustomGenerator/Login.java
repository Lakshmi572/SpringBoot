package com.example.CustomGenerator;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="registration")
@Data
public class Login {

    @Id
    @Column(name="User_id")
    @GenericGenerator(name="AUTO_INCREMENT" ,strategy = "com.example.CustomGenerator.customGenerator")
    @GeneratedValue(generator = "AUTO_INCREMENT" ,strategy = GenerationType.IDENTITY)
    private String UserId;

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

}
