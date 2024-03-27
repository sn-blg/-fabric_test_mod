package com.example_mod;

import com.example_mod.block.ModBlocks;
import com.example_mod.item.ModItemGroups;
import com.example_mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "example_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        ModItemGroups.register();
        ModBlocks.register();
    }
}
