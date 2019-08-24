package com.didala.jiang.order.jdk;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author : jiangwei
 * @date :  2019-08-24
 * @description
 */
@SPI
public class OneRobot implements Robot{

    @Override
    public void sayHello() {
        System.out.println("Hello ,  I am  OneBobot");
    }
}
