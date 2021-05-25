package com.ky2009666.apps.petterns;

import com.ky2009666.apps.petterns.singleton.SingletonV0;
import com.ky2009666.apps.petterns.singleton.SingletonV1;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class PetternsApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 测试饿汉模式.
     */
    @Test
    void printInstanceInfoV0() {
        SingletonV0 stance = SingletonV0.getStance();
        Assert.notNull(stance, "stance不能为空");
        stance.showInfo();
    }
    /**
     * 测试饿汉模式.
     */
    @Test
    void printInstanceInfoV1() {
        SingletonV1 stance = SingletonV1.getInstance();
        Assert.notNull(stance, "stance不能为空");
        stance.showInfo();
    }
}
