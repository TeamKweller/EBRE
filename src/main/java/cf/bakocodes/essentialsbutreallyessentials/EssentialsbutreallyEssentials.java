package cf.bakocodes.essentialsbutreallyessentials;

import cf.bakocodes.essentialsbutreallyessentials.commands.Basics;
import cf.bakocodes.essentialsbutreallyessentials.events.onJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import cf.bakocodes.essentialsbutreallyessentials.events.*;
public final class EssentialsbutreallyEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Basics commands = new Basics();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN +"[EBRE] Started!");
        getCommand("feed").setExecutor(new Basics());
        getServer().getPluginManager().registerEvents(new onJoin(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED +"[EBRE] Shutting Down...");
    }
}
