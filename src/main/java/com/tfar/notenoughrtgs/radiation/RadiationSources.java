package com.tfar.notenoughrtgs.radiation;

import com.tfar.notenoughrtgs.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import nc.radiation.RadSources;
import static nc.radiation.RadSources.addToStackMap;

public class RadiationSources {

    public static void init2() {
        put(RadSources.URANIUM_238, ModBlocks.rtg_uranium_compact);
        put(RadSources.PLUTONIUM_238, ModBlocks.rtg_plutonium_compact);
        put(RadSources.AMERICIUM_241, ModBlocks.rtg_americium_compact);
        put(RadSources.CALIFORNIUM_250, ModBlocks.rtg_californium_compact);

        put(RadSources.URANIUM_238 * 8, ModBlocks.rtg_uranium_dense);
        put(RadSources.PLUTONIUM_238 * 8, ModBlocks.rtg_plutonium_dense);
        put(RadSources.AMERICIUM_241 * 8, ModBlocks.rtg_americium_dense);
        put(RadSources.CALIFORNIUM_250 * 8, ModBlocks.rtg_californium_dense);
    }
    private static void put(double radiation, Block... blocks) {
        for (Block block : blocks) addToStackMap(new ItemStack(block), radiation);
    }
}