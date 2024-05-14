package com.antonic;

import com.antonic.registry.ModMessages;
import com.antonic.registry.ModModelPredicateProviders;
import net.fabricmc.api.ClientModInitializer;

public class SkordClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModMessages.registerS2CPackets();

        ModModelPredicateProviders.register();
    }
}
