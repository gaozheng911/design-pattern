package com.gz.builder;

/**
 * @author:gaozheng
 * @createTime:2020/6/8
 * @desc:
 */
public abstract class Burger  implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }

}
