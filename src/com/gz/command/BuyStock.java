package com.gz.command;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock stock){
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
