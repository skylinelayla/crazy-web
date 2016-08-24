package com.shikun.dao;

/**
 * Created by SHIKUN on 2016/8/23.
 */
public class User {
    private int id;
    private String Name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
