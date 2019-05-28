package com.tfar.notenoughrtgs.init;

import com.tfar.notenoughrtgs.util.Global;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(value = Global.MOD_ID)
public class ObjectHolders {

  public static Block rtg_uranium_compact;
  public static Block rtg_plutonium_compact;
  public static Block rtg_americium_compact;
  public static Block rtg_californium_compact;

  public static Block rtg_uranium_dense;
  public static Block rtg_plutonium_dense;
  public static Block rtg_americium_dense;
  public static Block rtg_californium_dense;
}
