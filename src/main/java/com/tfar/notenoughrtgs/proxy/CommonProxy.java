package com.tfar.notenoughrtgs.proxy;

import com.tfar.notenoughrtgs.init.ModBlocks;
import com.tfar.notenoughrtgs.init.ModTiles;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent preEvent) {

        ModBlocks.init();
        ModBlocks.register();
        ModTiles.register();

    }
    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}
