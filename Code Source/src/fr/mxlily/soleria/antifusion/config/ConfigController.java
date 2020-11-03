package fr.mxlily.soleria.antifusion.config;
import fr.mxlily.soleria.antifusion.Main;

public class ConfigController {
    public Main main;

    public Config config;
    public Lang lang;

    public ConfigController(Main main) {
        this.main = main;
    }

    public void init() {
        config = new Config(main);
        lang = new Lang(main);

        config.init();
        lang.init();
    }

    public void reload() {
        config.reload();
        lang.reload();
    }
}
