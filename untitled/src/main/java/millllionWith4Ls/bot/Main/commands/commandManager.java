package millllionWith4Ls.bot.Main.commands;

import millllionWith4Ls.bot.Main.discordBot;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import javax.security.auth.login.LoginException;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;


public class commandManager extends ListenerAdapter{
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event){
        String command = event.getName();
        if(command.equalsIgnoreCase("color")){
            OptionMapping colorOption = event.getOption("color");
            String textOption = event.getOption("message").getAsString();
            String color = colorOption.getAsString();
            event.reply(cleanUp.color(color,textOption)).queue();
        }else if(command.equalsIgnoreCase("mod")){
            OptionMapping modOption = event.getOption("mod");
            String textOption = event.getOption("message").getAsString();
            String mod = modOption.getAsString();
            event.reply(cleanUp.mod(mod,textOption)).queue();
        }else if(command.equalsIgnoreCase("modtwo")){
            OptionMapping modOptiontwo = event.getOption("modtwo");
            OptionMapping modOption = event.getOption("mod");
            String textOption = event.getOption("message").getAsString();
            String mod = modOption.getAsString();
            String modtwo = modOptiontwo.getAsString();
            event.reply(cleanUp.modTwo(modtwo,mod,textOption)).queue();
        }else if(command.equalsIgnoreCase("modthree")){
            OptionMapping modOptiontwo = event.getOption("modtwo");
            OptionMapping modOption = event.getOption("mod");
            OptionMapping modOptionthree = event.getOption("modthree")
            String textOption = event.getOption("message").getAsString();
            String mod = modOption.getAsString();
            String modtwo = modOptiontwo.getAsString();
            String modthree = modOptionthree.getAsString();
            event.reply(cleanUp.modThree(modthree,modtwo,mod,textOption)).queue();
        }
    }
    @Override
    public void onGuildReady(GuildReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();
        OptionData main = new OptionData(OptionType.STRING, "message", "message you want colorized", true);
        OptionData colorOpp = new OptionData(OptionType.STRING, "color", "Color you want the text to be", true).addChoice("yellow","yellow").addChoice("cyan","cyan").addChoice("red","red").addChoice("green","green").addChoice("blue","blue").addChoice("grey","grey").addChoice("orange","orange");
        OptionData modOpp = new OptionData(OptionType.STRING, "mod", "Option you want the text to be", true).addChoice("bold","bold").addChoice("italic","italic").addChoice("strike","strike").addChoice("under","under");
        OptionData modOppTwo = new OptionData(OptionType.STRING, "modtwo", "Option you want the text to be", true).addChoice("bold","bold").addChoice("italic","italic").addChoice("strike","strike").addChoice("under","under");
        OptionData modOppThree = new OptionData(OptionType.STRING, "modthree", "Option you want the text to be", true).addChoice("bold","bold").addChoice("italic","italic").addChoice("strike","strike").addChoice("under","under");
        commandData.add(Commands.slash("color","Generate text with a specific color").addOptions(main,colorOpp));
        commandData.add(Commands.slash("mod","Generate text with a specific modifier").addOptions(main,modOpp));
        commandData.add(Commands.slash("modtwo","Generate text with two specific modifiers").addOptions(main,modOpp,modOppTwo));
        commandData.add(Commands.slash("modtwo","Generate text with two specific modifiers").addOptions(main,modOpp,modOppTwo,modOppThree));
        event.getGuild().updateCommands().addCommands(commandData).queue();
    }
    public static void main(String[] args) {

    }
}
