package com.gz.state;

/**
 * @author:gaozheng
 * @createTime:2020/5/28
 * @desc:
 */
public class StatePtternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);

        EndState stopState = new EndState();
        stopState.doAction(context);


    }
}
