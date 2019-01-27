package com.tfar.notenoughrtgs.block.tile;

import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import nc.enumm.BlockEnums;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSimpleTile extends BlockTile {

    private final BlockEnums.SimpleTileType type;

    public BlockSimpleTile(BlockEnums.SimpleTileType type) {
        super(type.getName(), Material.IRON);
        this.type = type;
        setCreativeTab(type.getTab());
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileRTGCompact();
    }



}
