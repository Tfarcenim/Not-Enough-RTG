package com.tfar.notenoughrtgs.init;

import com.tfar.notenoughrtgs.block.BlockBase;

import com.tfar.notenoughrtgs.block.tile.BlockTile;
import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import nc.block.NCBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COMPACT_RTG_URANIUM = new BlockTile("rtg_uranium_compact", Material.IRON) {
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGCompact.UraniumCompact();
        }
    };
    public static final Block COMPACT_RTG_AMERICIUM = new BlockTile("rtg_americium_compact", Material.IRON) {
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGCompact.AmericiumCompact();
        }
    };
    public static final Block COMPACT_RTG_PLUTONIUM = new BlockTile("rtg_plutonium_compact", Material.IRON) {
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGCompact.PlutoniumCompact();
        }
    };
    public static final Block COMPACT_RTG_CALIFORNIUM = new BlockTile("rtg_californium_compact", Material.IRON) {
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return null;
        }
    };

    public static void register() {
    }
}
