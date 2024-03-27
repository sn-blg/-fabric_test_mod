package com.example_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.example_mod.ExampleMod;

public class ModItems {
    public static final Item NEW_ITEM = registerItem("new_item", new Item(new FabricItemSettings()));
    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, id), item);
    }
    public static void register() {
        ExampleMod.LOGGER.debug("Registering items for: " + ExampleMod.MOD_ID);
    }
}
