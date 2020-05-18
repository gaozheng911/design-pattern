package com.gz.observer;

/**
 * @author:gaozheng
 * @createTime:2020/5/18
 * @desc:
 */
public class Observer2 implements ObServer {

    private Subject subject;

    public Observer2(Subject subject){
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("我是server2,msg:"+msg);
    }
}
