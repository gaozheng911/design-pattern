package com.gz.builder;

/**
 * @author:gaozheng
 * @createTime:2020/6/8
 * @desc:
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
