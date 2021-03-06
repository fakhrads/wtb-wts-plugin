package id.fakhrads.spigotmc.plugin.wtswtb.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.configuration.file.FileConfiguration;

public class WtsCommand implements CommandExecutor {
    
    FileConfiguration config;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();
            //ItemStack itemstack = new ItemStack(Material.DIAMOND, 64);
            //inventory.addItem(itemstack);
            if(args == null) {
                sender.sendMessage("Argument Cannot Null!");
                return false;
            } else {
                Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + config.getString("wts-prefix") + ChatColor.AQUA + config.getString("wts-prefix") + args[0].toString());
            }
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        return false;
    }
}
