package com.gz.factory;

/**
 * @author:gaozheng
 * @createTime:2020/5/19
 * @desc:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
