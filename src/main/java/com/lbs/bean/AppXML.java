package com.lbs.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXML {
    public static void main(String[] args) {
        /**
         * 从根目录的application.xml文件中构建应用上下文
         */
        String configLocation="file:C:\\Users\\Master\\IdeaProjects\\spring\\src\\main\\java\\com\\lbs\\bean\\application.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);

        /**
         *从应用上下文中获取所有bean的类名
         */
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String className : beanDefinitionNames){
            System.out.println(className);
        }

        /**
         * 从应用上下文中提取目标实体
         */
        CdPlayer cdPlayer = applicationContext.getBean(CdPlayer.class);

        /**
         * 执行方法进行测试
         */
        cdPlayer.play();
    }
}
