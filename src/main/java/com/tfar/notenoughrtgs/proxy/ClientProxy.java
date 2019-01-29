package com.tfar.notenoughrtgs.proxy;

import com.tfar.notenoughrtgs.init.ModBlocks;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    public void preInit(FMLPreInitializationEvent preEvent) {

        ModBlocks.registerRenders();
    }
}

