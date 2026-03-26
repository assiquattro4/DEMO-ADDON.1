package net.examplemod.registry;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class ModItems {
    // Registriamo l'oggetto chiamato "item_demo"
    public static final Item ITEM_DEMO = Registry.register(
        BuiltInRegistries.ITEM, 
        new ResourceLocation("examplemod", "item_demo"), 
        new Item(new Item.Properties())
    );

    public static void register() {} 
}
