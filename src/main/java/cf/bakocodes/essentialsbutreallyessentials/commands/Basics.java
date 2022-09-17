package cf.bakocodes.essentialsbutreallyessentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Basics implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) { return true; }
        Player player = (Player) sender;

        // /feed

        if (cmd.getName().equalsIgnoreCase("feed")) {
            player.setFoodLevel(20);
        }
        return true;
    }

}
