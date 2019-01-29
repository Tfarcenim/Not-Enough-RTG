package com.tfar.notenoughrtgs.proxy;

import com.tfar.notenoughrtgs.init.ModBlocks;
import nc.handler.TooltipHandler;
import nc.radiation.RadiationHUD;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    private final Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void preInit(FMLPreInitializationEvent preEvent) {

                super.preInit(preEvent);

        ModBlocks.registerRenders();
    }
    @Override
    public void postInit(FMLPostInitializationEvent postEvent) {
        super.postInit(postEvent);

        MinecraftForge.EVENT_BUS.register(new TooltipHandler());

        MinecraftForge.EVENT_BUS.register(new RadiationHUD(mc));
    }

}

