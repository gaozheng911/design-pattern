package com.gz.command;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;


    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
