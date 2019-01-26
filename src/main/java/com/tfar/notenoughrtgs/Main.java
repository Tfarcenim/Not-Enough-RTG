package com.tfar.notenoughrtgs;

import com.tfar.notenoughrtgs.init.ModTiles;
import com.tfar.notenoughrtgs.proxy.CommonProxy;
import com.tfar.notenoughrtgs.util.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION,
        dependencies = reference.DEPENDENCIES, acceptedMinecraftVersions = reference.MC_VERSION)
public class Main {
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Logger logger;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        ModTiles.register();
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {

    }
    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event) {

    }
}