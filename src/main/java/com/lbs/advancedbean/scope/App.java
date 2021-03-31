package com.lbs.advancedbean.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {JavaConfig.class})

public class App {

    //注入baseService
    @Autowired
    BaseBean baseBean1;

    @Autowired
    BaseBean baseBean2;



    @Test
    public void scope(){
        baseBean2.setName("Hello Bean2");
        System.out.println("basebean1 name:"+baseBean1.getName());
        System.out.println("basebean2 name:"+baseBean2.getName());
    }

}