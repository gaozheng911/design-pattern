package com.gz.observer;

/**
 * @author:gaozheng
 * @createTime:2020/5/18
 * @desc: 所有的被观察者必须实现的接口
 */
public interface Subject {
    public void register(ObServer obServer);

    public void remove(ObServer obServer);

    public void notifyObservers();
}
