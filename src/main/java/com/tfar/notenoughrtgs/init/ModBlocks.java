package com.tfar.notenoughrtgs.init;


import com.tfar.notenoughrtgs.block.tile.BlockTile;
import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import com.tfar.notenoughrtgs.tile.generator.TileRTGDense;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

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

      //  InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[3], 5, "RF/t"))
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGCompact.CaliforniumCompact();
        }
    };
    public static final Block DENSE_RTG_URANIUM = new BlockTile("rtg_uranium_dense", Material.IRON) {

        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGDense.UraniumDense();
        }
    };
    public static final Block DENSE_RTG_AMERICIUM = new BlockTile("rtg_americium_dense", Material.IRON) {

        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGDense.AmericiumDense();
        }
    };
    public static final Block DENSE_RTG_PLUTONIUM = new BlockTile("rtg_plutonium_dense", Material.IRON) {
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGDense.PlutoniumDense();
        }
    };
    public static final Block DENSE_RTG_CALIFORNIUM = new BlockTile("rtg_californium_dense", Material.IRON) {

        //  InfoHelper.formattedInfo(infoLine("rtg"), UnitHelper.prefix(NCConfig.rtg_power[3], 5, "RF/t"))
        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileRTGDense.CaliforniumDense();
        }
    };



    public static void register() {
    }
}
