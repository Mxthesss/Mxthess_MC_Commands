package eu.midwest.mxthess_commands;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mxthess_Commands extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("social").setExecutor(new CommandSocial());
        // Plugin startup logic
        getLogger().info("Plugin Mxhtess_Commands byl zapnut!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Mxhtess_Commands byl vypnut!");
    }
}
