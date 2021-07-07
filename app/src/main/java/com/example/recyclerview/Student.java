package com.example.recyclerview;

public class Student {
    private String name;
    private String age;
    private String rollNo;

    public Student(String name, String age, String rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
