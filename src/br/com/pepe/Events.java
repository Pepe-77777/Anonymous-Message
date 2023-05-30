package br.com.pepe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Events implements Listener {

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e) {
        String message = Main.getMain().config.getString("message").replaceAll("%message%", e.getMessage()).replaceAll("%player%", e.getPlayer().getDisplayName());

        e.setFormat(message);
    }

}

