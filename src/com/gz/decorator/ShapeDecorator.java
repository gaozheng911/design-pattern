package com.gz.decorator;

/**
 * @author:gaozheng
 * @createTime:2020/5/25
 * @desc:
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorate;

    public ShapeDecorator(Shape shape)
    {
        this.shapeDecorate = shape;
    }

    @Override
    public void draw(){
        shapeDecorate.draw();
    }
}
