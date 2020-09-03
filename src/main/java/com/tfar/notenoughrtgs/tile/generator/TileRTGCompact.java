package com.tfar.notenoughrtgs.tile.generator;

import nc.config.NCConfig;
import nc.multiblock.rtg.tile.TileRTG;
import nc.radiation.RadSources;


public class TileRTGCompact extends TileRTG {

    public static class UraniumCompact extends TileRTGCompact {

        public UraniumCompact() {
            super(NCConfig.rtg_power[0]*8, RadSources.URANIUM_238);
        }
    }

    public static class PlutoniumCompact extends TileRTGCompact {

        public PlutoniumCompact() {
            super(NCConfig.rtg_power[1]*8, RadSources.PLUTONIUM_238);
        }
    }

    public static class AmericiumCompact extends TileRTGCompact {

        public AmericiumCompact() {
            super(NCConfig.rtg_power[2]*8, RadSources.AMERICIUM_241);
        }
    }

    public static class CaliforniumCompact extends TileRTGCompact {

        public CaliforniumCompact() {
            super(NCConfig.rtg_power[3]*8, RadSources.CALIFORNIUM_250);
        }
    }

    public TileRTGCompact(int power, double radiation) {
        super(power, radiation);
    }
}