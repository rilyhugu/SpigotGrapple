package net.studiorily.grapple.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GrappleChecker {
    public static boolean isGrapple(ItemStack item) {
        if(item.getType() != Material.FISHING_ROD) {
            return false;
        }

        if(!item.getItemMeta().getDisplayName().equals("§6Grappling Hook")) {
            return false;
        }

        return true;
    }
}
