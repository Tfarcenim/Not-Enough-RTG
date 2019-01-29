package com.tfar.notenoughrtgs.enums;


import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import com.tfar.notenoughrtgs.tile.generator.TileRTGDense;
import nc.tab.NCTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
public class BlockEnums {



    public enum SimpleTileType implements IStringSerializable {

        RTG_URANIUM_COMPACT("rtg_uranium_compact", NCTabs.MACHINES),
        RTG_PLUTONIUM_COMPACT("rtg_plutonium_compact", NCTabs.MACHINES),
        RTG_AMERICIUM_COMPACT("rtg_americium_compact", NCTabs.MACHINES),
        RTG_CALIFORNIUM_COMPACT("rtg_californium_compact", NCTabs.MACHINES),

        RTG_URANIUM_DENSE("rtg_uranium_dense", NCTabs.MACHINES),
        RTG_PLUTONIUM_DENSE("rtg_plutonium_dense", NCTabs.MACHINES),
        RTG_AMERICIUM_DENSE("rtg_americium_dense", NCTabs.MACHINES),
        RTG_CALIFORNIUM_DENSE("rtg_californium_dense", NCTabs.MACHINES);

        private String name;
        private CreativeTabs tab;

        SimpleTileType(String name, CreativeTabs tab) {
            this.name = name;
            this.tab = tab;
        }

        @Override
        public String getName() {
            return name;
        }

        public TileEntity getTile() {
            switch (this){

                case RTG_URANIUM_COMPACT:
                    return new TileRTGCompact.UraniumCompact();
                case RTG_PLUTONIUM_COMPACT:
                    return new TileRTGCompact.PlutoniumCompact();
                case RTG_AMERICIUM_COMPACT:
                    return new TileRTGCompact.AmericiumCompact();
                case RTG_CALIFORNIUM_COMPACT:
                    return new TileRTGCompact.CaliforniumCompact();
                case RTG_URANIUM_DENSE:
                    return new TileRTGDense.UraniumDense();
                case RTG_PLUTONIUM_DENSE:
                    return new TileRTGDense.PlutoniumDense();
                case RTG_AMERICIUM_DENSE:
                    return new TileRTGDense.AmericiumDense();
                case RTG_CALIFORNIUM_DENSE:
                    return new TileRTGDense.CaliforniumDense();

                default:
                    return null;
            }}


        public CreativeTabs getTab() {
            return tab;
        }
    }}



