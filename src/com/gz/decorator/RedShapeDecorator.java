package com.gz.decorator;

/**
 * @author:gaozheng
 * @createTime:2020/5/25
 * @desc:
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        shapeDecorate.draw();
        setRedBorder(shapeDecorate);
    }

    public void setRedBorder(Shape decoratorShape){
        System.out.println("Border Color: Red");
    }

}
