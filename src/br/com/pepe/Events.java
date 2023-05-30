package br.com.pepe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Events implements Listener {

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e) {
        String prefix = Main.getMain().config.getString("prefix");

        e.setFormat(prefix + e.getMessage());


    }

}

