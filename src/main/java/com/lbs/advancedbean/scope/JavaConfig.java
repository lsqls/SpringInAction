package com.lbs.advancedbean.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")

public class JavaConfig {
    @Autowired
    Environment environment;
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    BaseBean baseBean(){

        BaseBean baseBean=new BaseBean();
        baseBean.setName(environment.getProperty("BaseBean.name"));
        return  baseBean;
    }


}
