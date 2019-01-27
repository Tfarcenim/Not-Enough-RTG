package com.tfar.notenoughrtgs.block.tile;

import com.tfar.notenoughrtgs.block.BlockBase;
import com.tfar.notenoughrtgs.init.ModTiles;
import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class BlockTile extends BlockBase implements ITileEntityProvider {


    public BlockTile(String name, Material material) {
        super(name, material);
        hasTileEntity = true;
        setDefaultState(blockState.getBaseState());
    }

    @Override
    public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity tile, ItemStack stack) {
        super.harvestBlock(world, player, pos, state, tile, stack);
        world.setBlockToAir(pos);
    }



    @Override
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param) {
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }


}
