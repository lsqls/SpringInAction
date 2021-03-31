package com.lbs.advancedbean.profile;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static junit.framework.TestCase.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)//使用Spring提供的测试包进行测试，主要帮助实现bean的装载环境
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {AutoConfig.class})//配置类指向CDConfig2
@ActiveProfiles("prod")
public class ProfileTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void getName()
    {
        assertEquals(dataSource.getName(),"prod datasource");
    }


}
