package fr.mxlily.soleria.antifusion.config;

import fr.mxlily.soleria.antifusion.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import java.util.List;


public class Config extends ConfigFile {
    public Config(Main main) {
        super(main, "config.yml");
    }

    // Configurations


    // Initialisation
    protected void loadConfigurations(List<Configuration> configurations, YamlConfiguration config) {
;
    }
}
