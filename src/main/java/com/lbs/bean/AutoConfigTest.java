package com.lbs.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring提供的测试包进行测试，主要帮助实现bean的装载环境
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {AutoConfig.class})//配置类指向CDConfig2
public class AutoConfigTest {
    @Autowired
    private CdPlayer cdPlayer;


    @Test
    public void play()
    {
        //调用playCD方法测试是否自动装配及依赖注入成功
        this.cdPlayer.play();
    }


}
