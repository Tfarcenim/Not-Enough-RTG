package com.tfar.notenoughrtgs.block;

import com.tfar.notenoughrtgs.init.ModBlocks;
import com.tfar.notenoughrtgs.init.ModItems;
import com.tfar.notenoughrtgs.Main;
import com.tfar.notenoughrtgs.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setHarvestLevel("pickaxe", 0);
        setHardness(2F);
        setResistance(15F);
    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}