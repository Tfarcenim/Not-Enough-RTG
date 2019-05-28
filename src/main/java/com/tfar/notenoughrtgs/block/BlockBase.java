package com.tfar.notenoughrtgs.block;

import com.tfar.notenoughrtgs.util.Global;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import nc.tile.ITile;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends Block {

    public BlockBase(Material material) {
        super(material);
        setHarvestLevel("pickaxe", 0);
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, net.minecraft.entity.EntityLiving.SpawnPlacementType type) {
        return false;
    }

    @Override
    public boolean rotateBlock(World world, BlockPos pos, EnumFacing axis) {
        return false;
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (this instanceof ITileEntityProvider) {
            if (world.getTileEntity(pos) instanceof ITile) ((ITile)world.getTileEntity(pos)).onBlockNeighborChanged(state, world, pos, fromPos);
        }
    }

    }



