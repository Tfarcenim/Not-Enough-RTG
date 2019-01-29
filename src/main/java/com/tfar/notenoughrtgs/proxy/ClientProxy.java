package com.tfar.notenoughrtgs.proxy;

import com.tfar.notenoughrtgs.init.ModBlocks;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent preEvent) {

                super.preInit(preEvent);

        ModBlocks.registerRenders();
    }
}

