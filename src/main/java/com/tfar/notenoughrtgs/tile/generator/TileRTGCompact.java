package com.tfar.notenoughrtgs.tile.generator;

import nc.config.NCConfig;
import nc.radiation.RadSources;
import nc.tile.generator.TilePassiveGenerator;


public abstract class TileRTGCompact extends TilePassiveGenerator {

    public TileRTGCompact(int maxPowerGen) {
        super(maxPowerGen);
    }

    public static abstract class UraniumCompact extends TileRTGCompact {

        public UraniumCompact() {
            super(NCConfig.rtg_power[0]*8, RadSources.URANIUM_238*8/4D);
        }
    }

    public static abstract class PlutoniumCompact extends TileRTGCompact {

        public PlutoniumCompact() {
            super(NCConfig.rtg_power[1]*8, RadSources.PLUTONIUM_238*8/4D);
        }
    }

    public static abstract class AmericiumCompact extends TileRTGCompact {

        public AmericiumCompact() {
            super(NCConfig.rtg_power[2]*8, RadSources.AMERICIUM_241*8/4D);
        }
    }

    public static abstract class CaliforniumCompact extends TileRTGCompact {

        public CaliforniumCompact() {
            super(NCConfig.rtg_power[3]*8, RadSources.CALIFORNIUM_250*8/4D);
        }
    }

    public TileRTGCompact(int power, double radiation) {
        super(power);
        getRadiationSource().setRadiationLevel(radiation);
    }

    @Override
    public int getGenerated() {
        return power;
    }

    @Override
    public boolean shouldSaveRadiation() {
        return false;
    }
}