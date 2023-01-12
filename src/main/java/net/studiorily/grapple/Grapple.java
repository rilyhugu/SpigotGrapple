package net.studiorily.grapple;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Grapple extends JavaPlugin {
    public static Plugin plugin;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new GrappleItem(), this);
    }

    @Override
    public void onDisable() {
    }

    public static Plugin getPlugin() {
        return this.plugin;
    }
}
