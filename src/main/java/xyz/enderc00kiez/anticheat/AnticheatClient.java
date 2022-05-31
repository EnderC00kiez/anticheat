package xyz.enderc00kiez.anticheat;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class AnticheatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("meteor-client")) {
            throw new IllegalStateException("Meteor client is loaded, please remove it.");
        }
        if (FabricLoader.getInstance().isModLoaded("baritone")) {
            throw new IllegalStateException("Baritone is loaded, please remove it.");
        }
        if (FabricLoader.getInstance().isModLoaded("seedcrackerx")) {
            throw new IllegalStateException("Seedcracker is loaded, please remove it.");
        }
    }

}
