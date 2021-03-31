package com.lbs.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CdBean {
    /**
     * 定义CD名
     */
    private String title="Hello World";
    /**
     * 定义CD作者
     */
    private String author="Mr.D";
}
