package com.gz.builder;

/**
 * @author:gaozheng
 * @createTime:2020/6/8
 * @desc:
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
