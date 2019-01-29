package com.tfar.notenoughrtgs.enums;


import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import nc.tab.NCTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.SoundEvent;

public class BlockEnums {


        public CreativeTabs getCreativeTab() {
                    return NCTabs.MACHINES;
            }


        public SoundEvent getSound() {
            return null;
        }



    public enum SimpleTileType implements IStringSerializable {

        RTG_URANIUM_COMPACT("rtg_uranium_compact", NCTabs.MACHINES);
      /*  RTG_PLUTONIUM("rtg_plutonium_compact", NCTabs.MACHINES),
        RTG_AMERICIUM("rtg_americium", NCTabs.MACHINES),
        RTG_CALIFORNIUM("rtg_californium", NCTabs.MACHINES); */



        private String name;
        private CreativeTabs tab;

        private SimpleTileType(String name, CreativeTabs tab) {
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
              /*  case RTG_PLUTONIUM:
                    return new TileRTG.Plutonium();
                case RTG_AMERICIUM:
                    return new TileRTG.Americium();
                case RTG_CALIFORNIUM:
                    return new TileRTG.Californium(); */

                default:
                    return null;
            }}


        public CreativeTabs getTab() {
            return tab;
        }
    }}



