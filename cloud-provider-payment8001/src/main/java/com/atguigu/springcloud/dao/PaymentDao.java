package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

//mybatis扫描
@Mapper
@Component
public interface PaymentDao {

    //就象征性的插入两个方法
    public  int insert(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);

}
