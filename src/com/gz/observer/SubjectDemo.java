package com.gz.observer;

import java.util.ArrayList;


/**
 * @author:gaozheng
 * @createTime:2020/5/18
 * @desc:
 */
public class SubjectDemo implements Subject {

    public ArrayList<ObServer> obServers = new ArrayList<ObServer>();

    public String msg;

    @Override
    public void register(ObServer obServer) {
         obServers.add(obServer);
    }

    @Override
    public void remove(ObServer obServer) {
        obServers.remove(obServer);
    }

    @Override
    public void notifyObservers() {
        for (ObServer obServer:obServers){
            obServer.update(msg);
        }
    }

    public void setMsg(String msg)
    {
        this.msg = msg;

        notifyObservers();
    }


    public static void main(String[] args) {
        //模拟一个3D的服务号
        SubjectDemo subjectDemo = new SubjectDemo();
        //客户1
        ObServer observer1 = new Observer1(subjectDemo);
        ObServer observer2 = new Observer2(subjectDemo);

        subjectDemo.setMsg("20140420的3D号码是：127");
        subjectDemo.setMsg("20140421的3D号码是：333");
    }

}
