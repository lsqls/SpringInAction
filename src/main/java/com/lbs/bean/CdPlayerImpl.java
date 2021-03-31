package com.lbs.bean;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CdPlayerImpl implements CdPlayer {
    CdBean cdBean;
    @Override
    public void play() {
        System.out.println("play "+cdBean.getAuthor()+" "+cdBean.getTitle());
    }
}
