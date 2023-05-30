package br.com.pepe;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public FileConfiguration config = getConfig();
    static Main main;
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);
        main = this;

        config.addDefault("message", "Anonymous (%player%): %message%");
        config.options().copyDefaults(true);
        saveConfig();
    }

    public static Main getMain() {
        return main;
    }

}
