package com.tfar.notenoughrtgs.radiation;

import com.tfar.notenoughrtgs.init.ModBlocks;
import nc.util.ItemInfo;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import nc.radiation.RadSources;
import static nc.radiation.RadSources.STACK_MAP;


public class RadiationSources {

    private static void addToStackMap(ItemStack stack, Double radiation) {
        STACK_MAP.put(new ItemInfo(stack), radiation);
    }

    public static void init2() {
        put(RadSources.URANIUM_238 / 4D * 8, ModBlocks.rtg_uranium_compact);
        put(RadSources.PLUTONIUM_238 / 4D * 8, ModBlocks.rtg_plutonium_compact);
        put(RadSources.AMERICIUM_241 / 4D * 8, ModBlocks.rtg_americium_compact);
        put(RadSources.CALIFORNIUM_250 / 4D * 8, ModBlocks.rtg_californium_compact);

        put(RadSources.URANIUM_238 / 4D * 64, ModBlocks.rtg_uranium_dense);
        put(RadSources.PLUTONIUM_238 / 4D * 64, ModBlocks.rtg_plutonium_dense);
        put(RadSources.AMERICIUM_241 / 4D * 64, ModBlocks.rtg_americium_dense);
        put(RadSources.CALIFORNIUM_250 / 4D * 64, ModBlocks.rtg_californium_dense);
    }

    private static void put(double radiation, Block... blocks) {
        for (Block block : blocks) addToStackMap(new ItemStack(block), radiation);
    }
}