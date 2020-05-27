package com.gz.decorator;

/**
 * @author:gaozheng
 * @createTime:2020/5/25
 * @desc:
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);

        circle.draw();

        redCircle.draw();

    }
}
