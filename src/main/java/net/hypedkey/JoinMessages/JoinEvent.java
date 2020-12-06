package net.hypedkey.JoinMessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinEvent implements Listener {

    private final JoinMessage main;
    public JoinEvent(JoinMessage plugin) {
        main = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
        String  name = event.getPlayer().getDisplayName();
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&',main.getConfig().getString("JoinMessagePre") + name + main.getConfig().getString("JoinMessagePost")));
    }
}
