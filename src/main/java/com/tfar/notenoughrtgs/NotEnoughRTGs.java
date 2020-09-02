package com.tfar.notenoughrtgs;

import com.tfar.notenoughrtgs.block.item.ItemBlocks;
import com.tfar.notenoughrtgs.block.tile.BlockSimpleTile;
import com.tfar.notenoughrtgs.radiation.RadiationSources;
import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import com.tfar.notenoughrtgs.tile.generator.TileRTGDense;
import com.tfar.notenoughrtgs.util.Global;
import nc.config.NCConfig;
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
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
@Mod(modid = NotEnoughRTGs.MOD_ID, name = Global.NAME, version = Global.VERSION,
        dependencies = Global.DEPENDENCIES, acceptedMinecraftVersions = Global.MC_VERSION)
public class NotEnoughRTGs {

  public static final List<Block> MOD_BLOCKS = new ArrayList<>();
  public static final String MOD_ID = "notenoughrtgs";

  @EventHandler
  public void init(FMLInitializationEvent event) {

    GameRegistry.registerTileEntity(TileRTGCompact.UraniumCompact.class, NotEnoughRTGs.MOD_ID + ":rtg_uranium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.PlutoniumCompact.class, NotEnoughRTGs.MOD_ID + ":rtg_plutonium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.AmericiumCompact.class, NotEnoughRTGs.MOD_ID + ":rtg_americium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.CaliforniumCompact.class, NotEnoughRTGs.MOD_ID + ":rtg_californium_compact");
    GameRegistry.registerTileEntity(TileRTGDense.UraniumDense.class, NotEnoughRTGs.MOD_ID + ":rtg_uranium_dense");
    GameRegistry.registerTileEntity(TileRTGDense.PlutoniumDense.class, NotEnoughRTGs.MOD_ID + ":rtg_plutonium_dense");
    GameRegistry.registerTileEntity(TileRTGDense.AmericiumDense.class, NotEnoughRTGs.MOD_ID + ":rtg_americium_dense");
    GameRegistry.registerTileEntity(TileRTGDense.CaliforniumDense.class, NotEnoughRTGs.MOD_ID + ":rtg_californium_dense");

    RadiationSources.init();
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    IForgeRegistry<Block> registry = event.getRegistry();

    registerBlock(new BlockSimpleTile(TileRTGCompact.UraniumCompact::new),"rtg_uranium_compact",registry);
    registerBlock(new BlockSimpleTile(TileRTGCompact.PlutoniumCompact::new),"rtg_plutonium_compact",registry);
    registerBlock(new BlockSimpleTile(TileRTGCompact.AmericiumCompact::new),"rtg_americium_compact",registry);
    registerBlock(new BlockSimpleTile(TileRTGCompact.CaliforniumCompact::new),"rtg_californium_compact",registry);

    registerBlock(new BlockSimpleTile(TileRTGDense.UraniumDense::new),"rtg_uranium_dense",registry);
    registerBlock(new BlockSimpleTile(TileRTGDense.PlutoniumDense::new),"rtg_plutonium_dense",registry);
    registerBlock(new BlockSimpleTile(TileRTGDense.AmericiumDense::new),"rtg_americium_dense",registry);
    registerBlock(new BlockSimpleTile(TileRTGDense.CaliforniumDense::new),"rtg_californium_dense",registry);
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    IForgeRegistry<Item> registry = event.getRegistry();

    int i = 0;
    for (Block block : MOD_BLOCKS) {
      registerItem(block, registry, InfoHelper.formattedInfo(infoLine(), UnitHelper.prefix(NCConfig.rtg_power[i % 4] * (i / 4 * 56 + 8), 5, "RF/t")));
      i++;
    }
  }

  private static String infoLine() {
    return "tile." + nc.Global.MOD_ID + ".rtg.desc";
  }

  private static void registerBlock(Block block, String name, IForgeRegistry<Block> registry) {
    block.setRegistryName(name);
    block.setTranslationKey(block.getRegistryName().toString());
    block.setResistance(15);
    block.setHardness(2);
    MOD_BLOCKS.add(block);
    registry.register(block);
  }

  private static void registerItem(Block block, IForgeRegistry<Item> registry, String... info) {
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