package net.hypedkey.JoinMessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


public class QuitEvent implements Listener {
    private final JoinMessage main;
    public QuitEvent(JoinMessage plugin) {
        main = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
        String name = event.getPlayer().getDisplayName();
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("QuitMessagePre") + name + main.getConfig().getString("QuitMessagePost")));
    }


}