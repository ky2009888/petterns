package com.ky2009666.apps.petterns.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ky2009666
 * @description 单例模式之饿汉模式
 * @date 2021/5/25
 **/
@Slf4j(topic = "单例模式之饿汉模式")
public class SingletonV0 {
    /**
     * 定义私有实例.
     */
    private SingletonV0() {
    }

    /**
     * 获取对象实例.
     *
     * @return SingletonV0.
     */
    public static SingletonV0 getStance() {
        return stance;
    }

    public  void showInfo() {
        log.info("------------------单例饿汉模式详情------------");
    }

    /**
     * 实例化对象.
     */
    private static SingletonV0 stance = new SingletonV0();

}
