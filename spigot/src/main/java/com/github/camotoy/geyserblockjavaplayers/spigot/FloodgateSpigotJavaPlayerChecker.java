package com.github.camotoy.geyserblockjavaplayers.spigot;

import com.github.camotoy.geyserblockjavaplayers.common.JavaPlayerChecker;
import org.geysermc.floodgate.FloodgateAPI;

import java.util.UUID;

public class FloodgateSpigotJavaPlayerChecker implements JavaPlayerChecker {
    @Override
    public boolean isBedrockPlayer(UUID uuid) {
        return FloodgateAPI.isBedrockPlayer(uuid);
    }
}
