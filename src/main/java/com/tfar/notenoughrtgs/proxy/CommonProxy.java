package com.tfar.notenoughrtgs.proxy;

import com.tfar.notenoughrtgs.init.ModBlocks;
import com.tfar.notenoughrtgs.init.ModTiles;
import com.tfar.notenoughrtgs.radiation.RadiationSources;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent preEvent) {

        ModBlocks.init();
        ModBlocks.register();
        ModTiles.register();

    }
    public void Init(FMLInitializationEvent event) {
        RadiationSources.init();
    }
    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}
