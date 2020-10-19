package com.spring.demo02;

public class UserServiceProxyImpl implements UserService{
    private UserServiceImpl userService;

    void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //在代理对象中添加日志方法
    private void log(String msg){
        System.out.println("[Debug] 调用了"+msg+"方法");
    }
}
