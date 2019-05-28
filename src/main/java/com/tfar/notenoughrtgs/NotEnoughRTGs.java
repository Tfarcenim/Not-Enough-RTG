package com.tfar.notenoughrtgs;

import com.tfar.notenoughrtgs.block.item.ItemBlocks;
import com.tfar.notenoughrtgs.block.tile.BlockSimpleTile;
import com.tfar.notenoughrtgs.enums.BlockEnums;
import com.tfar.notenoughrtgs.init.ModTiles;
import com.tfar.notenoughrtgs.radiation.RadiationSources;
import com.tfar.notenoughrtgs.util.Global;
import nc.NuclearCraft;
import nc.config.NCConfig;
import nc.tab.NCTabs;
import nc.util.InfoHelper;
import nc.util.UnitHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
@Mod(modid = Global.MOD_ID, name = Global.NAME, version = Global.VERSION,
        dependencies = Global.DEPENDENCIES, acceptedMinecraftVersions = Global.MC_VERSION)
public class NotEnoughRTGs {

  public static final List<Block> MOD_BLOCKS = new ArrayList<>();

  @EventHandler
  public void preInit(FMLPreInitializationEvent preEvent) {
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    ModTiles.register();
    RadiationSources.init();
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    RadiationSources.init();
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    IForgeRegistry<Block> registry = event.getRegistry();

    for (BlockEnums.SimpleTileType block : BlockEnums.SimpleTileType.values())
      helper(new BlockSimpleTile(block), block.getName(), registry);
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    IForgeRegistry<Item> registry = event.getRegistry();

    int i = 0;
    for (Block block : MOD_BLOCKS) {
      helper2(block, registry, InfoHelper.formattedInfo(infoLine(), UnitHelper.prefix(NCConfig.rtg_power[i % 4] * ((i / 4) * 56 + 8), 5, "RF/t")));
      i++;
    }
  }

  private static String infoLine() {
    return "tile." + nc.Global.MOD_ID + ".rtg.desc";
  }

  private static void helper(Block block, String name, IForgeRegistry<Block> registry) {
    block.setRegistryName(name);
    block.setTranslationKey(block.getRegistryName().toString());
    block.setResistance(15);
    block.setHardness(2);
    MOD_BLOCKS.add(block);
    registry.register(block);
  }

  private static void helper2(Block block, IForgeRegistry<Item> registry, String... info) {
    ItemBlock itemBlock = new ItemBlocks(block, info);
    itemBlock.setRegistryName(block.getRegistryName());
    registry.register(itemBlock);
  }

  @SubscribeEvent
  public static void registerModels(ModelRegistryEvent event) {
    for (Block block : MOD_BLOCKS)
      helper3(Item.getItemFromBlock(block));
  }

  private static void helper3(Item item) {
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }

}