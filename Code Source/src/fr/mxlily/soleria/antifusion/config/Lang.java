package fr.mxlily.soleria.antifusion.config;
import fr.mxlily.soleria.antifusion.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;


public class Lang extends ConfigFile {
    public Lang(Main main) {
        super(main, "lang.yml");
    }

    // Configurations
    public static String ItemFusionInCombat;

    protected void loadConfigurations(List<Configuration> configurations, YamlConfiguration config) {
        ItemFusionInCombat = (String) new Configuration("§8§l[§6Combat§8§l]§cVous n'êtes pas autorisé à fusionner votre stuff en combat !","player.message.fusionitem", configurations, config).getValue();
    }
}