package com.antonic.skord;

import com.antonic.skord.registry.*;
import com.antonic.skord.registry.world.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import static com.antonic.skord.Reference.logBackRGB256;

public class Skord implements ModInitializer {

	public static final boolean DEBUG = true;

	@Override
	public void onInitialize() {
		logBackRGB256("Initializing", 255, 255, 0, 255, 0, 127);

		//Register Classes

		ModItems.register();
		ModBlocks.register();
		ModItemGroups.register();
		ModCommands.register();
		ModBlockEntities.register();
		ModScreenHandlers.register();
		ModRecipes.register();
		ModWorldGen.register();
		ModMessages.registerC2SPackets();
		ModEffects.register();

		ModRegistries.register();
	}
}