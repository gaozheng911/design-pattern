package com.gz.command;


/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Borker broker = new Borker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();

    }
}
