package com.example_mod.block;

import com.example_mod.ExampleMod;
import com.example_mod.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block NEW_BLOCK = registerBlock(
            "new_block",
            new Block(FabricBlockSettings
                    .create()
                    .hardness(50.0f)
                    .resistance(1200.0f)
                    .requiresTool()
                    .luminance(1)));
    private static Block registerBlock(String id, Block block) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(ExampleMod.MOD_ID, id), block);
    }
    public static void register() {
        ExampleMod.LOGGER.debug("Registering blocks for: " + ExampleMod.MOD_ID);
    }
}
