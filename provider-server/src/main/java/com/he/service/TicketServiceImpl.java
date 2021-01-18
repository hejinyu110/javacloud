package com.he.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper  服务注册与发现

@Service   //可以被扫描到，启动之后就会自动注册到注册中心
@Component  //使用 dubbo 之后尽量不要用  server 注解
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "获取ticket";
    }
}
