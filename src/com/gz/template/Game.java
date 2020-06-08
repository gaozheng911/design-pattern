package com.gz.template;

/**
 * @author:gaozheng
 * @createTime:2020/5/28
 * @desc:
 */
public abstract class Game {

    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //模板方法
    public void play(){
        initialize();
        startPlay();
        endPlay();
    }

}
