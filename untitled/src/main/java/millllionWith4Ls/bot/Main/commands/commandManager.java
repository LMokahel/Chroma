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
//        TextChannel textChannel = event.getChannel().asTextChannel();
        if(command.equalsIgnoreCase("color")){
            OptionMapping colorOption = event.getOption("color");
            String textOption = event.getOption("message").getAsString();
            String color = colorOption.getAsString();
            String reply = "";
            switch(color.toLowerCase()){
                case "yellow" ->{
                    reply = "```fix\n" + textOption + "\n```";
                }
                case "cyan" ->{
                    reply = "```yaml\n" + textOption + "\n```";
                }
                case "red" ->{
                    reply = "```diff\n-" + textOption + "\n```";
                }
                case "green" ->{
                    reply = "```diff\n+" + textOption + "\n```";
                }
                case "blue" ->{
                    reply = "```ini\n[" + textOption + "]\n```";
                }
                case "grey" ->{
                    reply = "```brainfuck\n" + textOption + "\n```";
                }
                case "orange" ->{
                    reply = "```css\n[" + textOption + "]\n```";
                }
                default ->{
                    reply = "invalid color";
                }
            }
            event.reply(reply).queue();
        }else if(command.equalsIgnoreCase("mod")){
            OptionMapping modOption = event.getOption("mod");
            String textOption = event.getOption("message").getAsString();
            String mod = modOption.getAsString();
            String reply = "";
            switch(mod.toLowerCase()){
                case "bold" ->{
                    reply = "**" + textOption + "**";
                }
                case "italic" ->{
                    reply = "*" + textOption + "*";
                }
                case "strike" ->{
                    reply = "~~" + textOption + "~~";
                }
                case "under" ->{
                    reply = "__" + textOption + "__";
                }
                default ->{
                    reply = "invalid modifier";
                }
            }
            event.reply(reply).queue();
        } else if(command.equalsIgnoreCase("modtwo")){
            OptionMapping modOptiontwo = event.getOption("modtwo");
            OptionMapping modOption = event.getOption("mod");
            String textOption = event.getOption("message").getAsString();
            String mod = modOption.getAsString();
            String modtwo = modOptiontwo.getAsString();
            String reply = "";
            if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("italic")){
                reply = "***"+textOption+"***";
            }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("under")){
                reply = "**__"+textOption+"__**";
            }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("strike")){
                reply = "**~~"+textOption+"~~**";
            }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("bold")){
                reply = "Duplicate mod(s) detected: invalid choice(s).";
            }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("italic")){
                reply = "~~*"+textOption+"*~~";
            }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("under")){
                reply = "~~__"+textOption+"__~~";
            }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("bold")){
                reply = "~~**"+textOption+"**~~";
            }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("strike")){
                reply = "Duplicate mod(s) detected: invalid choice(s).";
            }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("italic")){
                reply = "__*"+textOption+"*__";
            }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("bold")){
                reply = "__**"+textOption+"**__";
            }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("strike")){
                reply = "__~~"+textOption+"~~__";
            }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("under")){
                reply = "Duplicate mod(s) detected: invalid choice(s).";
            }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("bold")){
                reply = "***"+textOption+"***";
            }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("under")){
                reply = "*__"+textOption+"__*";
            }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("strike")){
                reply = "*~~"+textOption+"~~*";
            }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("italic")){
                reply = "Duplicate mod(s) detected: invalid choice(s).";
            }
            event.reply(reply).queue();
        }
    }

    @Override
    public void onGuildReady(GuildReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();
        OptionData main = new OptionData(OptionType.STRING, "message", "message you want colorized", true);
        OptionData colorOpp = new OptionData(OptionType.STRING, "color", "Color you want the text to be", true).addChoice("yellow","yellow").addChoice("cyan","cyan").addChoice("red","red").addChoice("green","green").addChoice("blue","blue").addChoice("grey","grey").addChoice("orange","orange");
        OptionData modOpp = new OptionData(OptionType.STRING, "mod", "Option you want the text to be", true).addChoice("bold","bold").addChoice("italic","italic").addChoice("strike","strike").addChoice("under","under");
        OptionData modOppTwo = new OptionData(OptionType.STRING, "modtwo", "Option you want the text to be", true).addChoice("bold","bold").addChoice("italic","italic").addChoice("strike","strike").addChoice("under","under");
        commandData.add(Commands.slash("color","Generate text with a specific color").addOptions(main,colorOpp));
        commandData.add(Commands.slash("mod","Generate text with a specific modifier").addOptions(main,modOpp));
        commandData.add(Commands.slash("modtwo","Generate text with two specific modifiers").addOptions(main,modOpp,modOppTwo));
        event.getGuild().updateCommands().addCommands(commandData).queue();
    }
    public static void main(String[] args) {

    }
}
