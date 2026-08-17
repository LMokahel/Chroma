package com.dontnag.chroma.event;

import com.dontnag.chroma.option.HighlightColor;
import com.dontnag.chroma.option.Modifier;
import com.dontnag.chroma.option.Size;
import com.dontnag.chroma.option.TextColor;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import org.jetbrains.annotations.NotNull;

public class EventManager extends ListenerAdapter{

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName().toLowerCase()) {
            case "color" -> EventManagerUtils.execute(event, EventManagerUtils::color);
            case "modify" -> EventManagerUtils.execute(event, EventManagerUtils::modify);
            case "header" -> EventManagerUtils.execute(event, EventManagerUtils::header);
        }
    }
    @Override
    public void onGuildReady(@NotNull GuildReadyEvent event) {
        OptionData textInput = new OptionData(OptionType.STRING, "text", "", true);

        OptionData textColor = new OptionData(OptionType.STRING, "color", "Color you want the text to be", true);
        OptionData highlightColor = new OptionData(OptionType.STRING, "background", "Color you want the highlight to be", false);

        OptionData textModifier = new OptionData(OptionType.STRING, "", "", false);

        OptionData headerOptionOne = new OptionData(OptionType.STRING, "header_size", "Size of the header", true);

        for (String color : EventManagerUtils.getOptions(TextColor.class)) {
            textColor.addChoice(color.toLowerCase(), color);
        }

        for (String color : EventManagerUtils.getOptions(HighlightColor.class)) {
            highlightColor.addChoice(color.toLowerCase(), color);
        }

        for (String modifier : EventManagerUtils.getOptions(Modifier.class)) {
            textModifier.addChoice(modifier.toLowerCase(), modifier);
        }

        for (String size : EventManagerUtils.getOptions(Size.class)) {
            headerOptionOne.addChoice(size.toLowerCase(), size);
        }

        event.getJDA()
            .updateCommands()
            .addCommands(
                Commands.slash("color","Colors text").addOptions(
                    textInput.setDescription("Text to be colored"),
                    textColor,
                    highlightColor
                ),
                Commands.slash("modify","Modifies text").addOptions(
                    textInput.setDescription("Text to be modified"),
                    textModifier.setName("modifier_one").setDescription("First modifier").setRequired(true),
                    textModifier.setName("modifier_two").setDescription("Second modifier"),
                    textModifier.setName("modifier_three").setDescription("Third modifier"),
                    textModifier.setName("modifier_four").setDescription("Fourth modifier")
                ),
                Commands.slash("header", "Formats text into a header").addOptions(
                    textInput.setDescription("Text to be formatted"),
                    headerOptionOne
                )
            )
            .queue();
    }
}
