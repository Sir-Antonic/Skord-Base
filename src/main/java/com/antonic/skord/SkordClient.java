package com.antonic.skord;

import com.antonic.skord.registry.ModMessages;
import com.antonic.skord.registry.ModModelPredicateProviders;
import net.fabricmc.api.ClientModInitializer;

public class SkordClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModMessages.registerS2CPackets();

        ModModelPredicateProviders.register();
    }
}
