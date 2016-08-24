package com.shikun.dao;

/**
 * Created by SHIKUN on 2016/8/23.
 */
public class AccountModel {
    private String username;
    private String password;
    private int age;


    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

    public int getAge() {
        return this.age;
    }
}
