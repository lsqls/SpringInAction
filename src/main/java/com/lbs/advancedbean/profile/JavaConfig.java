package com.lbs.advancedbean.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "dev")
public class JavaConfig {
    @Bean
    DataSource dataSource(){
        DataSource dataSource=new DataSource();
        dataSource.setName("dev datasource");
        return dataSource;
    }
}
