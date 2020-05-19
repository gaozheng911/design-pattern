package com.gz.factory;

/**
 * @author:gaozheng
 * @createTime:2020/5/19
 * @desc:
 */
public class Yellow implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Yellow::fill() method.");
    }
}
