package com.tfar.notenoughrtgs.init;

import com.tfar.notenoughrtgs.block.BlockBase;

import nc.block.NCBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COMPACT_RTG_URANIUM = new BlockBase("compact_rtg_uranium", Material.IRON);
    public static final Block COMPACT_RTG_AMERICIUM = new BlockBase("compact_rtg_americium", Material.IRON);
    public static final Block COMPACT_RTG_PLUTONIUM = new BlockBase("compact_rtg_plutonium", Material.IRON);
    public static final Block COMPACT_RTG_CALIFORNIUM = new BlockBase("compact_rtg_californium", Material.IRON);
}
