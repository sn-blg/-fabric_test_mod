package com.example_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.example_mod.ExampleMod;

public class ModItemGroups {
    public static final ItemGroup NEW_GROUP = registerItemGroup();
    private static ItemGroup registerItemGroup() {
        ItemGroup returnGroup = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.NEW_ITEM))
                .displayName(Text.translatable("item_group.example_mod.new_group"))
                .entries((context, entries) -> {
                    entries.add(ModItems.NEW_ITEM);
                })
                .build();
        Registry.register(Registries.ITEM_GROUP, new Identifier(ExampleMod.MOD_ID, "new_group"), returnGroup);
        return returnGroup;
    }
    public static void register() {
        ExampleMod.LOGGER.debug("Registering groups for: " + ExampleMod.MOD_ID);
    }
}
