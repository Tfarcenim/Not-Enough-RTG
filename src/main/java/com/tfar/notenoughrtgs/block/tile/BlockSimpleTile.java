package com.tfar.notenoughrtgs.block.tile;

import com.tfar.notenoughrtgs.enums.BlockEnums.SimpleTileType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

    public class BlockSimpleTile extends BlockTile {

        private final SimpleTileType type;

        public BlockSimpleTile(SimpleTileType type) {
            super(type.getName(), Material.IRON);
            this.type = type;
            setCreativeTab(type.getTab());
        }

        @Override
        public TileEntity createNewTileEntity(World world, int meta) {
            return type.getTile();
        }

    }
