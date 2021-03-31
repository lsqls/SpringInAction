package com.lbs.advancedbean.profile;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@Data
public class DataSource {
    /**
     * 定义名称
     */
    private String name="prod datasource";
    public DataSource(){
        super();
    }
    public DataSource(String name){
        this.name = name;
    }
}
