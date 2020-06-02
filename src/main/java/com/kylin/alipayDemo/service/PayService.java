package com.kylin.alipayDemo.service;


/*支付服务*/

import com.alipay.api.AlipayApiException;
import com.kylin.alipayDemo.bean.AlipayBean;

public interface PayService {

    /*支付宝*/

    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
