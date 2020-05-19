package com.gz.factory;

/**
 * @author:gaozheng
 * @createTime:2020/5/19
 * @desc:
 */
public abstract class AbstractFactory {
    public abstract  Color getColor(String color);
    public abstract  Shape getShape(String shape);
}
