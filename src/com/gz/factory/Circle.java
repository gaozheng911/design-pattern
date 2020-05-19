package com.gz.factory;

/**
 * @author:gaozheng
 * @createTime:2020/5/19
 * @desc:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
