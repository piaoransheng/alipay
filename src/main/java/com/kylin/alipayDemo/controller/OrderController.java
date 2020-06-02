package com.kylin.alipayDemo.controller;


/* 订单接口 */

import com.alipay.api.AlipayApiException;
import com.kylin.alipayDemo.bean.AlipayBean;
import com.kylin.alipayDemo.service.PayService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController()

@RequestMapping("order")

public class OrderController {

    @Resource
    private PayService payService;//调用支付服务


    /*阿里支付*/

    @PostMapping(value = "alipay")

    public String alipay(String out_trade_no,String subject,String total_amount,String body) throws AlipayApiException {


        return  payService.aliPay(new AlipayBean()
                .setBody(body)  //描述
                .setOut_trade_no(out_trade_no)  //订单号
                .setTotal_amount(new StringBuffer().append(total_amount))  //金额
                .setSubject(subject));   //订单名称

    }
}
