package com.dontnag.chroma.option;

import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public enum Modifier implements Option {

    BOLD("**"),
    ITALIC("*"),
    STRIKETHROUGH("~~"),
    UNDERLINE("__");

    private final String value;

    Modifier(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public static Modifier fromName(OptionMapping option) {
        if (option == null) return null;
        return Modifier.valueOf(option.getAsString());
    }
}
