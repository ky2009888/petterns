package com.ky2009666.apps.petterns.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ky2009666
 * @description 单例模式之饱汉模式
 * @date 2021/5/25
 **/
@Slf4j(topic = "单例模式之饱汉模式")
public class SingletonV1 {
    /**
     * 定义私有构造函数.
     */
    private SingletonV1() {
    }

    /**
     * 定义对象变量.
     */
    private static SingletonV1 instance;

    /**
     * 静态代码块初始化代码.
     */
    static {
        instance = new SingletonV1();
    }

    /**
     * 获取对象实例.
     *
     * @return instance.
     */
    public static SingletonV1 getInstance() {
        return instance;
    }

    /**
     * 展示详情内容.
     */
    public void showInfo() {
        log.info("------------展示内容详情------------------");
    }
}
