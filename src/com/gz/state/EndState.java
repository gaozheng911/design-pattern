package com.gz.state;

/**
 * @author:gaozheng
 * @createTime:2020/5/28
 * @desc:
 */
public class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
}
