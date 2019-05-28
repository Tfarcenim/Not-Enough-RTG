package com.tfar.notenoughrtgs.init;


import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import com.tfar.notenoughrtgs.tile.generator.TileRTGDense;
import com.tfar.notenoughrtgs.util.Global;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTiles {

    public static void register() {
        GameRegistry.registerTileEntity(TileRTGCompact.UraniumCompact.class, Global.MOD_ID + ":rtg_uranium_compact");
        GameRegistry.registerTileEntity(TileRTGCompact.PlutoniumCompact.class, Global.MOD_ID + ":rtg_plutonium_compact");
        GameRegistry.registerTileEntity(TileRTGCompact.AmericiumCompact.class, Global.MOD_ID + ":rtg_americium_compact");
        GameRegistry.registerTileEntity(TileRTGCompact.CaliforniumCompact.class, Global.MOD_ID + ":rtg_californium_compact");
        GameRegistry.registerTileEntity(TileRTGDense.UraniumDense.class, Global.MOD_ID + ":rtg_uranium_dense");
        GameRegistry.registerTileEntity(TileRTGDense.PlutoniumDense.class, Global.MOD_ID + ":rtg_plutonium_dense");
        GameRegistry.registerTileEntity(TileRTGDense.AmericiumDense.class, Global.MOD_ID + ":rtg_americium_dense");
        GameRegistry.registerTileEntity(TileRTGDense.CaliforniumDense.class, Global.MOD_ID + ":rtg_californium_dense");
    }
}




