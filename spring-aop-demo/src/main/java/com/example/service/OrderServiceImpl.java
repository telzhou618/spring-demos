package com.example.service;

import org.springframework.stereotype.Service;

/**
 * @author zhougaojun
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public void getOrderId() {
        System.out.println("orderId:1");
    }
}
