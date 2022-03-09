package net.growthcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.growthcraft.entity.GrowthcraftBlockEntities;
import net.growthcraft.machines.roaster.RoasterScreen;

public class GrowthcraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(GrowthcraftBlockEntities.BOX_SCREEN_HANDLER, RoasterScreen::new);
    }
}
