package com.gz.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class Borker {

    List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        for (Order order:orders) {
            order.execute();
        }
        orders.clear();
    }


}
