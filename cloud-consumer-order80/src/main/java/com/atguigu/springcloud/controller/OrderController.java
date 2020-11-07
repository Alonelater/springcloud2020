package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 这是作为一个消费者 所以只有调用服务
 */
@RestController
public class OrderController {


    //首先我们需要一个东西帮我们跨服务调用 原来是httpclient  现在我们用springboot提供的restTemplate
    //先去
    @Resource
    private RestTemplate restTemplate;

    private static  String URL= "http://localhost:8001";

    //这个是消费者 所以我们带上了consumer前缀
    @GetMapping("/consumer/payment/insert")
    public CommonResult<Payment> insert(Payment payment){
        CommonResult commonResult = restTemplate.postForObject(URL + "/payment/insert", payment, CommonResult.class);
        return commonResult;
    }

    //这个是消费者 所以我们带上了consumer前缀
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> insert(@PathVariable("id") Long  id){
        CommonResult commonResult = restTemplate.getForObject(URL + "/payment/get/"+id,  CommonResult.class);
        return commonResult;
    }



}
