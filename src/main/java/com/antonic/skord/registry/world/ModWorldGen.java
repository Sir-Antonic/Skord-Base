package com.antonic.skord.registry.world;

import static com.antonic.skord.Reference.log;

public class ModWorldGen {

    public ModWorldGen()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering World Generation");

        ModGeodeGen.generate();
        ModOreGen.generate();
        ModTreeGen.generate();
        ModFlowerGen.generate();
        ModEntitySpawns.addSpawns();
    }
}
