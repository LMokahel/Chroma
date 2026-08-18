package com.dontnag.chroma.event;

import com.dontnag.chroma.option.HighlightColor;
import com.dontnag.chroma.option.Modifier;
import com.dontnag.chroma.option.Size;
import com.dontnag.chroma.option.TextColor;

import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;

public class EventManagerUtils {

    public static OptionData copyOption(OptionData option) {
        return new OptionData(option.getType(), option.getName(), option.getDescription(), option.isRequired())
            .addChoices(option.getChoices());
    }

    public static <T extends Enum<T>> String[] getOptions(Class<T> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants())
            .map(Enum::name)
            .toArray(String[]::new);
    }

    public static void execute(SlashCommandInteraction event, BiFunction<String, List<OptionMapping>, String> command) {
        String text = Objects.requireNonNull(
            event.getOption("text")).getAsString();
        List<OptionMapping> options = event.getOptions().stream()
            .skip(1)
            .toList();

        event.reply(command.apply(text, options)).queue();
    }

    public static String color(String text, List<OptionMapping> colors) {
        String highlightColor = colors.size() == 1 ? "0" : HighlightColor.fromName(colors.get(1)).getValue();
        String textColor = TextColor.fromName(colors.get(0)).getValue();

        return "```ansi\n\u001b[" + highlightColor + ";" + textColor + "m" + text + "\n```";
    }

    public static String modify(String text, List<OptionMapping> modifiers) {
        StringBuilder msg = new StringBuilder(text);

        for (OptionMapping modifier : modifiers) {
            if (modifier != null) {
                String symbol = Modifier.fromName(modifier).getValue();

                msg.insert(0, symbol);
                msg.append(symbol);
            }
        }

        return msg.toString();
    }

    public static String header(String text, List<OptionMapping> size) {
        String prefix = Size.fromName(size.get(0)).getValue();

        return prefix + " " + text;
    }
}
