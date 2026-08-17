package com.dontnag.chroma.option;

import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public enum TextColor implements Option {

    GRAY("30"),
    RED("31"),
    GREEN("32"),
    YELLOW("33"),
    BLUE("34"),
    PINK("35"),
    CYAN("36"),
    WHITE("37");

    private final String value;

    TextColor(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public static TextColor fromName(OptionMapping option) {
        if (option == null) return null;
        return TextColor.valueOf(option.getAsString());
    }
}
