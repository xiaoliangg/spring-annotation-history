package com.yl.example;

/**
 * @description: 测试用bean
 * @author: xiaoliang
 * @date: 2021/11/5 0:41
 **/
public class DemoService {
    private HelloService helloService;

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
