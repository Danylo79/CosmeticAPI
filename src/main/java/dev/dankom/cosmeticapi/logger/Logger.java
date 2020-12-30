package dev.dankom.cosmeticapi.logger;

import dev.dankom.cosmeticapi.CosmeticAPI;

public class Logger {
    public void log(Object msg) {
        log(CosmeticAPI.getInstance().NAME, msg);
    }

    public void log(String thread, Object msg) {
        System.out.println("[" + thread + "] " + msg);
    }
}
