package com.tfar.notenoughrtgs.proxy;

import com.tfar.notenoughrtgs.init.ModBlocks;
import com.tfar.notenoughrtgs.init.ModTiles;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id){}
    public void preInit(FMLPreInitializationEvent preEvent) {

        ModBlocks.init();
        ModBlocks.register();
        ModTiles.register();

    }}
