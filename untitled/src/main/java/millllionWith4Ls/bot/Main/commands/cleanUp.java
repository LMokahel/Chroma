package millllionWith4Ls.bot.Main.commands;


public class cleanUp {
    cleanUp(){
    }
    public static String mod(String mod,String textOption){
        String reply = "";
        switch(mod.toLowerCase()){
            case "bold" ->{reply = "**" + textOption + "**";}
            case "italic" ->{reply = "*" + textOption + "*";}
            case "strike" ->{reply = "~~" + textOption + "~~";}
            case "under" ->{reply = "__" + textOption + "__";}
            default ->{reply = "invalid modifier";}
        }
        return reply;
    }
    public static String modTwo(String modtwo,String mod,String textOption){
        String reply = "";
        if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("italic")){reply = "***"+textOption+"***";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("under")){reply = "**__"+textOption+"__**";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("strike")){reply = "**~~"+textOption+"~~**";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("italic")){reply = "~~*"+textOption+"*~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("under")){reply = "~~__"+textOption+"__~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("bold")){reply = "~~**"+textOption+"**~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("italic")){reply = "__*"+textOption+"*__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("bold")){reply = "__**"+textOption+"**__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("strike")){reply = "__~~"+textOption+"~~__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("bold")){reply = "***"+textOption+"***";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("under")){reply = "*__"+textOption+"__*";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("strike")){reply = "*~~"+textOption+"~~*";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }
        return reply;
    }
    public static String color(String color, String textOption){
        String reply = "";
        switch(color.toLowerCase()){
            case "yellow" ->{reply = "```fix\n" + textOption + "\n```";}
            case "cyan" ->{reply = "```yaml\n" + textOption + "\n```";}
            case "red" ->{reply = "```diff\n-" + textOption + "\n```";}
            case "green" ->{reply = "```diff\n+" + textOption + "\n```";}
            case "blue" ->{reply = "```ini\n[" + textOption + "]\n```";}
            case "grey" ->{reply = "```brainfuck\n" + textOption + "\n```";}
            case "orange" ->{reply = "```css\n[" + textOption + "]\n```";}
            default ->{reply = "invalid color";}
        }
        return reply;
    }
    public static String modThree(String modthree,String modtwo,String mod,String textOption){
        String reply = "";
        if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("strike")){reply = "**__~~"+textOption+"~~__**";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("italic")){reply = "***__"+textOption+"__***";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("under")){reply = "**~~__"+textOption+"__~~**";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("italic")){reply = "***~~"+textOption+"~~***";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("under")){reply = "***__"+textOption+"__***";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("strike")){reply = "***~~"+textOption+"~~***";
        }else if(mod.equalsIgnoreCase("bold")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("strike")){reply = "__**~~"+textOption+"~~**__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("italic")){reply = "__***"+textOption+"***__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("bold")){reply = "__~~**"+textOption+"**~~__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("italic")){reply = "__~~*"+textOption+"*~~__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("bold")){reply = "__***"+textOption+"***__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("strike")){reply = "__*~~"+textOption+"~~*__";
        }else if(mod.equalsIgnoreCase("under")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("under")){reply = "~~**__"+textOption+"__**~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("italic")){reply = "~~***"+textOption+"***~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("bold")){reply = "~~__**"+textOption+"**__~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("italic")){reply = "~~__*"+textOption+"*__~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("bold")){reply = "~~***"+textOption+"***~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("under")){reply = "~~*__"+textOption+"__*~~";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("strike")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("under")){reply = "***__"+textOption+"__***";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("strike")){reply = "***~~"+textOption+"~~***";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("bold")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("bold")){reply = "***__"+textOption+"__***";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("strike")){reply = "*__~~"+textOption+"~~__*";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("under")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("bold")){reply = "***~~"+textOption+"~~***";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("under")){reply = "*~~__"+textOption+"__~~*";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("strike")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("bold")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("under")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("strike")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }else if(mod.equalsIgnoreCase("italic")&&modtwo.equalsIgnoreCase("italic")&&modthree.equalsIgnoreCase("italic")){reply = "Duplicate mod(s) detected: invalid choice(s)";
        }
        return reply;
    }
}
