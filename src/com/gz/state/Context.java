package com.gz.state;

/**
 * @author:gaozheng
 * @createTime:2020/5/28
 * @desc:
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
