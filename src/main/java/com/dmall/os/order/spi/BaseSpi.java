package com.dmall.os.order.spi;

/**
 * SPI基类接口
 */
public interface BaseSpi {

    /**
     * 优先级，数值越大优先级越高
     * @return
     */
    int getIndex();
}
