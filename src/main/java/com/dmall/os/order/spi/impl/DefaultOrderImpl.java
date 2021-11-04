package com.dmall.os.order.spi.impl;

import com.dmall.os.order.spi.OrderSpi;
import com.google.auto.service.AutoService;

/**
 * 下单接口默认实现
 */
@AutoService(OrderSpi.class)
public class DefaultOrderImpl implements OrderSpi {

    @Override
    public void order() {
        System.out.println("这是下单接口的默认实现！");
        System.out.println("优先级：" + getIndex());
    }

    /**
     * 默认实现优先级为0
     * @return
     */
    @Override
    public int getIndex() {
        return 0;
    }
}
