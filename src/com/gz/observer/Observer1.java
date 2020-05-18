package com.gz.observer;

/**
 * @author:gaozheng
 * @createTime:2020/5/18
 * @desc:
 */
public class Observer1 implements ObServer {

    private Subject subject;

    public Observer1(Subject subject){
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("我是server1,msg:"+msg);
    }
}
