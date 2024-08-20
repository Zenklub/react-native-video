package com.brentvatne.exoplayer.events;

import androidx.media3.exoplayer.ExoPlayer;

public class BackgroundLeaveMessage {

    private ExoPlayer player;

    public BackgroundLeaveMessage() {
    }

    public BackgroundLeaveMessage(ExoPlayer player) {
        this.player = player;
    }

    public ExoPlayer getPlayer() {
        return player;
    }

    public void setPlayer(ExoPlayer player) {
        this.player = player;
    }
}
