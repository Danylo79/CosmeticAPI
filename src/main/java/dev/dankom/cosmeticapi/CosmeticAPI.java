package dev.dankom.cosmeticapi;

import dev.dankom.cosmeticapi.logger.Logger;

public class CosmeticAPI {

    private static CosmeticAPI instance;
    private Logger logger;

    public String NAME = "CosmeticAPI", VERSION = "B1.0", AUTHOR = "Dankom", TEXTURE_DIR = "./src/main/resources/assets";

    public CosmeticAPI() {
        this.logger = new Logger();
    }

    public static CosmeticAPI getInstance() {
        if (instance == null) {
            instance = new CosmeticAPI();
        }
        return instance;
    }

    public Logger getLogger() {
        return logger;
    }
}
