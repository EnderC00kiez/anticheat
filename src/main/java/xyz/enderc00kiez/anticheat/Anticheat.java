package xyz.enderc00kiez.anticheat;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Anticheat implements ModInitializer {
    // register new block
    public static final Block SUS_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        Registry.register(Registry.BLOCK, new Identifier("anticheat", "sus_block"), SUS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("anticheat", "sus_block"), new BlockItem(SUS_BLOCK, new FabricItemSettings().group(ItemGroup.COMBAT)));
    }

}
