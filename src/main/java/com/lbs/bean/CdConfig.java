package com.lbs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdConfig {
    @Bean
    CdBean cdBean(){
        CdBean cdBean=new CdBean();
        cdBean.setAuthor("Mr.D");
        cdBean.setTitle("Hello World");
        return cdBean;
    }

    @Bean
    CdPlayer cdPlayer(){
        CdPlayerImpl cdPlayer=new CdPlayerImpl();
        cdPlayer.setCdBean(cdBean());
        return  cdPlayer;
    }
}
