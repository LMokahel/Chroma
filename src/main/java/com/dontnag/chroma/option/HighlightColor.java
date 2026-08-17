package com.dontnag.chroma.option;

import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public enum HighlightColor implements Option {

    BLACK("40"),
    RED("41"),
    GREEN("42"),
    YELLOW("43"),
    BLUE("44"),
    PINK("45"),
    CYAN("46"),
    WHITE("47");

    private final String value;

    HighlightColor(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public static HighlightColor fromName(OptionMapping option) {
        if (option == null) return null;
        return HighlightColor.valueOf(option.getAsString());
    }
}
