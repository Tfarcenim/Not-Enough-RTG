package com.tfar.notenoughrtgs.radiation;

import com.tfar.notenoughrtgs.NotEnoughRTGs;
import nc.radiation.RadSources;

import static nc.radiation.RadSources.put;

public class RadiationSources {

    public static void init() {

        put(RadSources.URANIUM_238, NotEnoughRTGs.MOD_BLOCKS.get(0));
        put(RadSources.PLUTONIUM_238, NotEnoughRTGs.MOD_BLOCKS.get(1));
        put(RadSources.AMERICIUM_241, NotEnoughRTGs.MOD_BLOCKS.get(2));
        put(RadSources.CALIFORNIUM_250, NotEnoughRTGs.MOD_BLOCKS.get(3));

        put(RadSources.URANIUM_238 * 8, NotEnoughRTGs.MOD_BLOCKS.get(4));
        put(RadSources.PLUTONIUM_238 * 8, NotEnoughRTGs.MOD_BLOCKS.get(5));
        put(RadSources.AMERICIUM_241 * 8, NotEnoughRTGs.MOD_BLOCKS.get(6));
        put(RadSources.CALIFORNIUM_250 * 8, NotEnoughRTGs.MOD_BLOCKS.get(7));
    }
}