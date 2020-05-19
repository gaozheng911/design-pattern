package com.gz.factory;

/**
 * @author:gaozheng
 * @createTime:2020/5/19
 * @desc:
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor("yellow");

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}
