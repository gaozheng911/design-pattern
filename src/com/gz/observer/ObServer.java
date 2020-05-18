package com.gz.observer;

/**
 * @author:gaozheng
 * @createTime:2020/5/18
 * @desc:所有观察者需要实现该接口
 */
public interface ObServer {
    public void update(String msg);
}
