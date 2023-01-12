package net.studiorily.grapple;

import net.studiorily.grapple.api.GrappleChecker;
import org.bukkit.SoundCategory;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.util.Vector;

public class GrappleItem implements Listener {
    @EventHandler
    public void playerFishEvent(PlayerFishEvent event) {
        Player player = event.getPlayer();
        FishHook hook = event.getHook();

        if(!GrappleChecker.isGrapple(player.getItemInHand())) {
            return;
        }

        if(hook.getState() != FishHook.HookState.UNHOOKED) {
            return;
        }

        PlayerFishEvent.State state = event.getState();
        if(state == PlayerFishEvent.State.IN_GROUND) {
            Vector hookVector = hook.getLocation().toVector();
            Vector playerVector = player.getLocation().toVector();

            Vector vector = hookVector.subtract(playerVector);

            player.setVelocity(vector);
            player.getWorld().playSound(player.getLocation(), "minecraft:entity.zombie.infect", SoundCategory.PLAYERS, 1.0F, 2.0F);
        }
    }
}
