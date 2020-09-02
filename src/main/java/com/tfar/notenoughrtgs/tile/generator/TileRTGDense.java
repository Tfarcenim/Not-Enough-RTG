package com.tfar.notenoughrtgs.tile.generator;


import nc.config.NCConfig;
import nc.radiation.RadSources;
import nc.tile.generator.TileRTG;


public class TileRTGDense extends TileRTG {

    public static class UraniumDense extends TileRTGDense {

        public UraniumDense() {
            super(NCConfig.rtg_power[0]*64, RadSources.URANIUM_238*8);
        }
    }

    public static class PlutoniumDense extends TileRTGDense {

        public PlutoniumDense() {
            super(NCConfig.rtg_power[1]*64, RadSources.PLUTONIUM_238*8);
        }
    }

    public static class AmericiumDense extends TileRTGDense {

        public AmericiumDense() {
            super(NCConfig.rtg_power[2]*64, RadSources.AMERICIUM_241*8);
        }
    }

    public static class CaliforniumDense extends TileRTGDense {

        public CaliforniumDense() {
            super(NCConfig.rtg_power[3]*64, RadSources.CALIFORNIUM_250*8);
        }
    }

    public TileRTGDense(int power, double radiation) {
        super(power, radiation);
        getRadiationSource().setRadiationLevel(radiation);
    }
}
