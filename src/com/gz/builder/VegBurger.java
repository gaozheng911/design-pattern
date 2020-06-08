package com.gz.builder;

/**
 * @author:gaozheng
 * @createTime:2020/6/8
 * @desc:
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
