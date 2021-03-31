package com.lbs.advancedbean.qualifier;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//接口实现类2
@Component
@BaseService2
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class BaseServiceImpl2 implements BaseService {

    @Override
    public void update() {
        System.out.println("BaseServiceImpl2 update " );
    }
}
