package com.gz.strategy;

/**
 * @author:gaozheng
 * @createTime:2020/5/20
 * @desc:
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
