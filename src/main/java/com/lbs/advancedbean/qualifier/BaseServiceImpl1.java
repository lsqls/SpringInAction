package com.lbs.advancedbean.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//接口实现类1
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@BaseService1
class BaseServiceImpl1 implements BaseService {
    @Autowired

    @Override
    public void update() {
        System.out.println("BaseServiceImpl1 update ");
    }
}
