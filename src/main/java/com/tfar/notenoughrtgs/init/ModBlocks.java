package com.tfar.notenoughrtgs.init;


import com.tfar.notenoughrtgs.block.item.ItemBlocks;
import com.tfar.notenoughrtgs.block.tile.BlockSimpleTile;
import nc.config.NCConfig;


import com.tfar.notenoughrtgs.enums.BlockEnums.SimpleTileType;

import nc.util.InfoHelper;
import nc.util.UnitHelper;
import net.minecraft.block.Block;
import com.tfar.notenoughrtgs.util.reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static net.minecraftforge.fml.common.registry.ForgeRegistries.BLOCKS;

public class ModBlocks {


    public static Block rtg_uranium_compact;
 /*   public static Block rtg_plutonium_compact;
    public static Block rtg_americium_compact;
    public static Block rtg_californium_compact;

    public static Block rtg_uranium_dense;
    public static Block rtg_plutonium_dense;
    public static Block rtg_americium_dense;
    public static Block rtg_californium_dense; */


    public static void init() {

        rtg_uranium_compact = new BlockSimpleTile(SimpleTileType.RTG_URANIUM_COMPACT);
        /*        rtg_plutonium_compact = new BlockSimpleTile(SimpleTileType.);
        rtg_americium_compact = new BlockSimpleTile(SimpleTileType.RTG_AMERICIUM_COMPACT);
        rtg_californium_compact = new BlockSimpleTile(SimpleTileType.RTG_CALIFORNIUM_COMPACT);



        rtg_uranium_dense = new BlockSimpleTile(SimpleTileType.RTG_URANIUM_DENSE);
        rtg_plutonium_dense = new BlockSimpleTile(SimpleTileType.RTG_PLUTONIUM);
        rtg_americium_dense = new BlockSimpleTile(SimpleTileType.RTG_AMERICIUM_DENSE);
        rtg_californium_dense = new BlockSimpleTile(SimpleTileType.RTG_CALIFORNIUM_DENSE);*/

    }

    public static void register() {


        registerBlock(rtg_uranium_compact, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[0] * 8, 5, "RF/t")));
   /*     registerBlock(rtg_plutonium_compact, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[1]*8, 5, "RF/t")));
        registerBlock(rtg_americium_compact, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[2]*8, 5, "RF/t")));
        registerBlock(rtg_californium_compact, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[3]*8, 5, "RF/t")));

        registerBlock(rtg_uranium_dense, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[0]*64, 5, "RF/t")));
        registerBlock(rtg_plutonium_dense, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[1]*64, 5, "RF/t")));
        registerBlock(rtg_americium_dense, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[2]*64, 5, "RF/t")));
        registerBlock(rtg_californium_dense, InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[3]*64, 5, "RF/t")));
*/

    }

    public static void registerRenders() {

        registerRender(rtg_uranium_compact);
     /*   registerRender(rtg_plutonium_compact);
        registerRender(rtg_americium_compact);
        registerRender(rtg_californium_compact);

        registerRender(rtg_uranium_dense);
        registerRender(rtg_plutonium_dense);
        registerRender(rtg_americium_dense);
        registerRender(rtg_californium_dense); */


    }
    private static String infoLine(String name) {
        return "tile." + reference.MOD_ID + "." + name + ".desc";
    }

    public static void registerBlock(Block block, String... info) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlocks(block, info).setRegistryName(block.getRegistryName()));
    }

    public static void registerBlock(Block block, TextFormatting fixedColor, String... info) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlocks(block, fixedColor, info).setRegistryName(block.getRegistryName()));
    }

    public static void registerBlock(Block block, TextFormatting fixedColor, String[] fixedTooltip, String... info) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlocks(block, fixedColor, fixedTooltip, info).setRegistryName(block.getRegistryName()));
    }




    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(reference.MOD_ID, fileName), "inventory"));
    }

}