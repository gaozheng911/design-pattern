package com.gz.state;

/**
 * @author:gaozheng
 * @createTime:2020/5/28
 * @desc:
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
}
