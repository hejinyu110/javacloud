package com.he.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service //放到容器中
public class UserService {
    //需要拿到 provider 中的服务，需要去注册中心拿
    @Reference  //引用 可以使用 pom 坐标 可以定义路径相同的接口名
    TicketService ticketService;


    public void getTicket(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }
}
