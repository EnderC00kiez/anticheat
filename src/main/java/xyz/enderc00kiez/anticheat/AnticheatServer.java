package xyz.enderc00kiez.anticheat;

import net.fabricmc.api.DedicatedServerModInitializer;


public class AnticheatServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        System.out.println("Enabled CSAC (server-side). All clients are forced to use it when joining your server.");
    }
}
