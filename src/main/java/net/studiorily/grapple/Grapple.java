package net.studiorily.grapple;

import net.studiorily.grapple.command.GrappleCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Grapple extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new GrappleItem(), this);

        getCommand("grapple").setExecutor(new GrappleCommand());
    }

    @Override
    public void onDisable() {
    }
}
