package com.gz.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock stock){
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
