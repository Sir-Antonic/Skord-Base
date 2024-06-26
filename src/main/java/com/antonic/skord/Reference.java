package com.antonic.skord;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.antonic.skord.Skord.DEBUG;

public class Reference {
    public static final String ModID = "skord";
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

    //Logging

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BRIGHT_BLACK = "\u001B[90m";
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    public static final String ANSI_BRIGHT_MAGENTA = "\u001B[95m";
    public static final String ANSI_BRIGHT_CYAN = "\u001B[96m";
    public static final String ANSI_BRIGHT_WHITE = "\u001B[97m";
    public static final String ANSI_BLACK_BACK = "\u001B[40m";
    public static final String ANSI_RED_BACK = "\u001B[41m";
    public static final String ANSI_GREEN_BACK = "\u001B[42m";
    public static final String ANSI_YELLOW_BACK = "\u001B[43m";
    public static final String ANSI_BLUE_BACK = "\u001B[44m";
    public static final String ANSI_MAGENTA_BACK = "\u001B[45m";
    public static final String ANSI_CYAN_BACK = "\u001B[46m";
    public static final String ANSI_WHITE_BACK = "\u001B[47m";
    public static final String ANSI_BRIGHT_BLACK_BACK = "\u001B[100m";
    public static final String ANSI_BRIGHT_RED_BACK = "\u001B[101m";
    public static final String ANSI_BRIGHT_GREEN_BACK = "\u001B[102m";
    public static final String ANSI_BRIGHT_YELLOW_BACK = "\u001B[103m";
    public static final String ANSI_BRIGHT_BLUE_BACK = "\u001B[104m";
    public static final String ANSI_BRIGHT_MAGENTA_BACK = "\u001B[105m";
    public static final String ANSI_BRIGHT_CYAN_BACK = "\u001B[106m";
    public static final String ANSI_BRIGHT_WHITE_BACK = "\u001B[107m";

    public static void log(String message)
    {
        if (DEBUG)
            LOGGER.info(ANSI_BRIGHT_MAGENTA + ">>> {}" + ANSI_RESET, message);
    }

    public static void logN(String message)
    {
        if (DEBUG)
            LOGGER.info(">>> {}", message);
    }

    public static void logRGB256(String message, int r, int g, int b)
    {
        if (DEBUG)
            LOGGER.info("\u001B[38;2;{};{};{}m>>> {}" + ANSI_RESET, r, g, b, message);
    }

    public static void logBackRGB256(String message, int rf, int gf, int bf, int rb, int gb, int bb)
    {
        if (DEBUG)
            LOGGER.info("\u001B[38;2;{};{};{};48;2;{};{};{}m>>> {} " + ANSI_RESET, rf, gf, bf, rb, gb, bb, message);
    }

    @NotNull
    public static Identifier identifier(@NotNull String path)
    {
        return new Identifier(ModID, path);
    }

    public static MutableText translate(String key, Object... params)
    {
        return Text.translatable(ModID + "." + key, params);
    }

    //Tags
    public static class ModTags
    {
        public static class Blocks
        {

        }

        public static class Items
        {

        }

        public static class Entities
        {

        }
    }

}
