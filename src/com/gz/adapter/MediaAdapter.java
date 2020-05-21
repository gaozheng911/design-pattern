package com.gz.adapter;

/**
 * @author:gaozheng
 * @createTime:2020/5/21
 * @desc:
 */
public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String name) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVLC(name);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(name);
        }
    }
}
