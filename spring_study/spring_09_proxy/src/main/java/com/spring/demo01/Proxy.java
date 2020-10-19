package com.spring.demo01;

public class Proxy implements Rent{

    private Host host;

    Proxy(Host hostname) {
        this.host = hostname;
    }

    public void rent() {
        seeHouse();
        host.rent();
        signContract();
        charge();
    }

    private void seeHouse(){
        System.out.println("中介带你看房子");
    }
    private void signContract(){
        System.out.println("中介带你签合同");
    }
    private void charge(){
        System.out.println("中介收取中介费");
    }
}
