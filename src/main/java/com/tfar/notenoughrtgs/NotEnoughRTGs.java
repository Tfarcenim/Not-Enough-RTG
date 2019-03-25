package com.tfar.notenoughrtgs;

import com.tfar.notenoughrtgs.proxy.CommonProxy;
import com.tfar.notenoughrtgs.util.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION,
        dependencies = reference.DEPENDENCIES, acceptedMinecraftVersions = reference.MC_VERSION)
public class NotEnoughRTGs {
    @Mod.Instance
    public static NotEnoughRTGs instance;
    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Logger logger;

    @EventHandler
    public void PreInit(FMLPreInitializationEvent preEvent) {proxy.preInit(preEvent);}

    @EventHandler
    public void Init(FMLInitializationEvent event) {proxy.Init(event);}

}