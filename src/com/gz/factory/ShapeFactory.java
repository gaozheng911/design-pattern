package com.gz.factory;

/**
 * @author:gaozheng
 * @createTime:2020/5/19
 * @desc:
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String type){
        if (type == null)
        {
         return null;
        }
        else if(type.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }
        else if(type.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if(type.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        return null;
    }

}
