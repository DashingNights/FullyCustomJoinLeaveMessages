package net.hypedkey.JoinMessages;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class JoinMessage extends JavaPlugin implements Listener {

    JoinEvent joinevent = (new JoinEvent(this));
    QuitEvent quitevent = (new QuitEvent(this));

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info("TEST 2");
        getServer().getPluginManager().registerEvents(joinevent, this);
        getServer().getPluginManager().registerEvents(quitevent, this);
    }

}
