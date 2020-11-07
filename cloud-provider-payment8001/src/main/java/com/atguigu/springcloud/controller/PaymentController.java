package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @PostMapping("/insert")
    public CommonResult<Payment> insert(@RequestBody Payment payment) {

        int insert = paymentService.insert(payment);
        int a = 10/2;
        if (insert > 0) {
            return new CommonResult(200, "插入数据库成功", insert);
        } else {
            return new CommonResult(444, "插入数据库失败", null);

        }

    }


    @GetMapping("/get/{id}")
    public CommonResult<Payment> insert(@PathVariable("id") Long id) {

        Payment insert = paymentService.getPaymentById(id);
        if (insert != null) {
            return new CommonResult(200, "查询数据成功", insert);
        } else {
            return new CommonResult(444, "查询id为" + id + "数据库无数据", null);

        }

    }



}
