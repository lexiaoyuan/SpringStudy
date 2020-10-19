package com.spring.pojo;

public class User {
    private String name;

    public User() {
        System.out.println("使用User无参构造！");
    }

    public User(String name) {
        this.name = name;
        System.out.println("使用User有参构造！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
