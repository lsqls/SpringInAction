package com.lbs.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring提供的测试包进行测试，主要帮助实现bean的装载环境
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {CdConfig.class})//配置类指向CDConfig2
public class JavaConfigTest
{
    //使用注解自动注入
    @Autowired
    private CdPlayer cdPlayer;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void play()
    {
        this.cdPlayer.play();
    }
}

