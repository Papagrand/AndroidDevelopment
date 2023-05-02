package com.example.homework12;

import android.media.MediaPlayer;
import android.os.Handler;
import android.widget.SeekBar;

public class SeekBarRunnable implements Runnable{
    private final android.os.Handler mHandler;
    private final MediaPlayer mPlayer;
    private final SeekBar mSeekBar;

    public SeekBarRunnable(Handler handler, MediaPlayer player, SeekBar seekBar) {
        mHandler = handler;
        mPlayer = player;
        mSeekBar = seekBar;
    }

    @Override
    public void run() {
        int currentPosition = mPlayer.getCurrentPosition();
        mSeekBar.setProgress(currentPosition);
        mHandler.postDelayed(this, 1000); // обновление каждую секунду
    }
}
