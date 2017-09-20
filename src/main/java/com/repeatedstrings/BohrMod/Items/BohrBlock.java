package com.repeatedstrings.BohrMod.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by james on 9/20/17.
 */
public class BohrBlock extends Block {

    public BohrBlock(Material mat, String name, CreativeTabs locationTab, float hardness, float numSwings, int numGivn, String tool) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(locationTab);
        setHardness(hardness);
        setResistance(numSwings);
        setHarvestLevel(tool, numGivn);
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        // initially set up random drops, a further lesson will provide the bohrOre.
        int oreType = (int)Math.random() % 4;
        switch(oreType) {
            case 1:
                return Items.GOLD_INGOT;
            case 2:
                return Items.DIAMOND;
            case 3:
                return Items.IRON_INGOT;
            case 4:
                return Items.CHICKEN;
            default:
                return Items.APPLE;
        }

//        return BohrItemHandler.bohrOre;
//        return super.get ItemDropped(state, rand, fortune);
    }
    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return random.nextInt(6) + 1;
    }
}
