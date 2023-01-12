package net.studiorily.grapple.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GrappleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("grapple")) {
            if(args[0].equals("get")) {
                if(sender instanceof Player player) {
                    sender.sendMessage("§aGrappleあーげる");
                    ItemStack item = new ItemStack(Material.FISHING_ROD);
                    item.getItemMeta().setDisplayName("§6Grappling Hook");
                    item.getItemMeta().setUnbreakable(true);
                    player.getInventory().addItem(item);
                    return true;
                } else {
                    sender.sendMessage("§aプレイヤーしか使えませーン");
                }
            } else {
                sender.sendMessage("§a引数入れろハゲ");
            }
        }
        return false;
    }
}
