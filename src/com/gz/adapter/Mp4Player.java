package com.gz.adapter;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVLC( String name) {
    }

    @Override
    public void playMp4(String name) {
        System.out.println("Playing mp4 file. Name: "+ name);
    }
}
