package com.dontnag.chroma.option;

import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public enum Size implements Option {

    SMALL("**"),
    MEDIUM("*"),
    LARGE("~~");

    private final String value;

    Size(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public static Size fromName(OptionMapping option) {
        if (option == null) return null;
        return Size.valueOf(option.getAsString());
    }
}
