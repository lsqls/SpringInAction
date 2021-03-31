package com.lbs.aop;


import org.springframework.stereotype.Component;

interface BaseInterface {
    /**
     * 新增歌曲
     *
     * @param author 作者
     * @param songTitle 歌曲名
     *
     * @return java.lang.Integer 返回当前歌曲总数
     *
     * @author xxx 2019/3/4
     * @version 1.0
     **/
    Integer addSong(String author,String songTitle);
    /**
     * 删除歌曲
     *
     * @param author 作者
     * @param songTitle 歌曲名
     *
     * @return java.lang.Integer 返回当前歌曲总数
     *
     * @author xxx 2019/3/4
     * @version 1.0
     **/
    Integer delSong(String author,String songTitle);
}
@Component
public class BaseBean implements  BaseInterface{

    private String author;
    private String songTitle;
    private Integer count=0;

    @Override
    public Integer addSong(String author,String songTitle){
        this.author = author;
        this.songTitle = songTitle;
        System.out.println("新增了一首歌："+author+"-"+songTitle);
        count++;
        return count;
    }

    @Override
    public Integer delSong(String author,String songTitle){
        this.author = author;
        this.songTitle = songTitle;
        System.out.println("删除了一首歌："+author+"-"+songTitle);
        count--;
        return count;
    }
}