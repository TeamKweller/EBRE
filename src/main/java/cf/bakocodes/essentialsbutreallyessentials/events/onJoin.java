package cf.bakocodes.essentialsbutreallyessentials.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;

import static org.bukkit.Bukkit.broadcastMessage;

public class onJoin implements Listener {
    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        broadcastMessage(ChatColor.AQUA + "Welcome to Bako's MC, " + player.getName() + "! Enjoy your stay!");
    }
}
