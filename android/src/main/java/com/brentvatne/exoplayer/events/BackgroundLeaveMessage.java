package com.brentvatne.exoplayer.events;

import androidx.media3.common.Player;

public class BackgroundLeaveMessage {

    private Player player;

    public BackgroundLeaveMessage() {
    }

    public BackgroundLeaveMessage(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
