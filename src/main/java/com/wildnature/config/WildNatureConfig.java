package com.wildnature.config;

/**
 * Design placeholder for configuration.
 *
 * Implementation note: wire these values into NeoForge's supported config system
 * after confirming the exact API for the selected NeoForge 26.3 build.
 */
public final class WildNatureConfig {
    private WildNatureConfig() {}

    public static final int DEFAULT_GROUND_DENSITY_PERCENT = 55;
    public static final boolean DEFAULT_MANUAL_PICKUP = true;
    public static final boolean DEFAULT_AUTOMATIC_PICKUP = true;
    public static final double DEFAULT_PICKUP_RADIUS = 1.5D;
    public static final boolean DEFAULT_AMBIENT_SOUNDS = true;
    public static final boolean DEFAULT_WEATHER_EFFECTS = true;
}
