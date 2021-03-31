package com.lbs.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AutoConfig.class})
public class App {
    @Autowired
    private BaseInterface baseInterface;
    @Test
    public void testBean(){
        baseInterface.addSong("myBean","mySong");
        baseInterface.addSong("myBean2","mySong2");

        baseInterface.delSong("myBean","mySong");
        baseInterface.addSong("myBean3","mySong3");
    }
}

