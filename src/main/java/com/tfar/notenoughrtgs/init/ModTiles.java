package com.tfar.notenoughrtgs.init;


import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import com.tfar.notenoughrtgs.util.reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTiles {	public static void register() {
    GameRegistry.registerTileEntity(TileRTGCompact.UraniumCompact.class, reference.MOD_ID + ":rtg_uranium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.PlutoniumCompact.class, reference.MOD_ID + ":rtg_plutonium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.AmericiumCompact.class, reference.MOD_ID + ":rtg_americium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.CaliforniumCompact.class, reference.MOD_ID + ":rtg_californium_compact");
}
}
