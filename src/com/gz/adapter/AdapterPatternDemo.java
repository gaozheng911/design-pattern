package com.gz.adapter;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","逝去日子.mp3");
        audioPlayer.play("mp4","心中的巨人.mp4");
        audioPlayer.play("vlc","黎明前的黑暗.vlc");
        audioPlayer.play("avi","不能说.avi");
    }
}
