package com.brentvatne.exoplayer.events;

import androidx.media3.exoplayer.ExoPlayer;

public class BackgroundEnterMessage {

    private ExoPlayer player;

    public BackgroundEnterMessage() {
    }

    public BackgroundEnterMessage(ExoPlayer player) {
        this.player = player;
    }

    public ExoPlayer getPlayer() {
        return player;
    }

    public void setPlayer(ExoPlayer player) {
        this.player = player;
    }
}
