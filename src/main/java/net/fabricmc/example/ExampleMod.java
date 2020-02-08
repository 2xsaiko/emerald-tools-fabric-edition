package net.fabricmc.example;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import java.util.function.Supplier;

public class ExampleMod implements ModInitializer {

    private ItemStack icon;

    @Override
    public void onInitialize()
    {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        System.out.println("Hello Fabric world!");

        ItemGroup itemgroup = FabricItemGroupBuilder.create(new Identifier("emeraldtools")).icon(new Supplier<ItemStack>() {
            @Override
            public ItemStack get() {
                return icon;
            }}).build();

        icon = new ItemStack(Registry.register(Registry.ITEM, "emerald-tools-fabric-edition:emeremeraldsword", new SwordItem(EmeraldToolMaterial.emerald, 10, 0.5f, new Item.Settings().group(itemgroup).maxDamage(1000))));

        Registry.register(Registry.ITEM, "emerald-tools-fabric-edition:axe", new AxeItem(EmeraldToolMaterial.emerald, 10, 0.5f, new Item.Settings().group(itemgroup).maxDamage(1000)) {});
        Registry.register( Registry.ITEM, "emerald-tools-fabric-edition:emeraldshovel", new ShovelItem(EmeraldToolMaterial.emerald, 10, 0.5f, new Item.Settings().group(itemgroup).maxDamage(1000)));
        Registry.register(Registry.ITEM, "emerald-tools-fabric-edition:emeraldpick", new PickaxeItem(EmeraldToolMaterial.emerald, 10, 0.5f, new Item.Settings().group(itemgroup).maxDamage(1000)) {});
    }
}
