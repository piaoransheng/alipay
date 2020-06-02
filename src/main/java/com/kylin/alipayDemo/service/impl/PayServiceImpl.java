package com.kylin.alipayDemo.service.impl;


/* 支付服务 */

import com.alipay.api.AlipayApiException;
import com.kylin.alipayDemo.bean.AlipayBean;
import com.kylin.alipayDemo.config.AlipayUtil;
import com.kylin.alipayDemo.service.PayService;
import org.springframework.stereotype.Service;

@Service(value = "alipayOrderService")

public class PayServiceImpl implements PayService {

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return AlipayUtil.connect(alipayBean);
    }

}
