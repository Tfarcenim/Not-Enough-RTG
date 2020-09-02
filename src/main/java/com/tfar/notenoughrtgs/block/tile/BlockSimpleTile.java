package com.tfar.notenoughrtgs.block.tile;

import nc.block.tile.BlockTile;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class BlockSimpleTile extends BlockTile {

	private final Supplier<TileEntity> type;

	public BlockSimpleTile(Supplier<TileEntity> type) {
		super(Material.IRON);
		this.type = type;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return type.get();
	}
}
