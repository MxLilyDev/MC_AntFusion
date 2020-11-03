package fr.mxlily.soleria.antifusion;

import fr.mxlily.soleria.antifusion.config.ConfigController;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    public void onEnable() {
        System.out.println("========== ANTI FUSION ==========");
        System.out.println("\tSTART");
        System.out.println("========== ANTI FUSION ==========");
        (new ConfigController(this)).init();
        log("Load Config files");
        getServer().getPluginManager().registerEvents( new AntiFEvent(), this);
    }



    @Override
    public void onDisable() {
        System.out.println("========== ANTI FUSION ==========");
        System.out.println("\tSTOP");
        System.out.println("========== ANTI FUSION ==========");
    }

    /**
     * Log functions
     */

    public void log(String message) {
        this.getLogger().info("[Soleria] " + message);
    }

    public void error(String message) {
        this.getLogger().info("Error: " + message);
    }
}
