package eu.midwest.mxthess_commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSocial implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.isOnline()) {
            player.sendMessage("Zde jsou naše Sociální sítě: Web: In Development | Discord: https://dsc.gg/midwestmc");
            return true;
        }
        return false;
    }

}