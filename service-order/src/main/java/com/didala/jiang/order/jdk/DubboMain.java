package com.didala.jiang.order.jdk;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author : jiangwei
 * @date :  2019-08-24
 * @description
 */
public class DubboMain {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);

        Robot oneRobot = extensionLoader.getExtension("oneRobot");
        oneRobot.sayHello();
    }
}
