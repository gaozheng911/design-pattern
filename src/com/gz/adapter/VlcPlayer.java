package com.gz.adapter;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String name) {
        System.out.println("Playing vlc file. Name: "+ name);
    }

    @Override
    public void playMp4(String name) {
    }
}
