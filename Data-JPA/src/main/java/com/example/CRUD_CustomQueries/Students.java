package com.example.CRUD_CustomQueries;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Students {
    @Id
    @GeneratedValue
    @Column(name="student_id")
    private Integer Id;

    @Column(name="student_name")
    private String name;

    @Column(name="school")
    private String school;

    @Column(name="marks")
    private Integer marks;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", marks=" + marks +
                '}';
    }
}
