package com.repeatedstrings.BohrMod.Handlers;

import com.repeatedstrings.BohrMod.Items.BohrBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 9/20/17.
 */
public class BohrBlockHandler {
    public static Block bohrBlock;
    public static ItemBlock inventoryBohrBlock;

    public static void init() {
        bohrBlock = new BohrBlock(Material.ROCK, "bohr_block", CreativeTabs.BUILDING_BLOCKS, 1F, 2F, 0, "pickaxe");
        inventoryBohrBlock = (ItemBlock) new ItemBlock(bohrBlock);
    }

    public static void register() {
        GameRegistry.register(inventoryBohrBlock, bohrBlock.getRegistryName());
        GameRegistry.register(bohrBlock);
    }

    public static void registerRenders() {
        registerRenders(bohrBlock);
    }

    public static void registerRenders(Block bohrBlock) {
        Item aBohrBlockItem = Item.getItemFromBlock(bohrBlock);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(aBohrBlockItem, 0, new ModelResourceLocation(aBohrBlockItem.getRegistryName(), "inventory"));

    }
}
