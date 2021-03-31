package com.lbs.advancedbean.qualifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.*;

//测试类：
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {AutoConfig.class})
public class App {

    //注入baseService
    @Autowired
    @BaseService1
    private BaseService baseService1;

    @Autowired
    @BaseService2
    private BaseService baseService2;

    @Test
    public void testPrimary(){
        assertNotEquals(baseService1, baseService2);
        baseService1.update();
        baseService2.update();
    }
}
