package com.didala.jiang.order.jdk;


import java.util.ServiceLoader;

/**
 * @author : jiangwei
 * @date :  2019-08-24
 * @description
 */
public class TestMain {
    public static void main(String[] args) {
        ServiceLoader<Robot> load = ServiceLoader.load(Robot.class);
        load.forEach(Robot::sayHello);
    }
}
