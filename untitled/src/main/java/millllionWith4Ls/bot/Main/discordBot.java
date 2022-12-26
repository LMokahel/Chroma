package millllionWith4Ls.bot.Main;

import io.github.cdimascio.dotenv.Dotenv;
import millllionWith4Ls.bot.Main.commands.commandManager;
import millllionWith4Ls.bot.Main.listeners.eventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;
import java.util.EventListener;

public class discordBot {

    private final ShardManager shardManager;

    private final Dotenv config;

    public Dotenv getConfig() {
        return config;
    }

    public discordBot() throws LoginException{
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.IDLE);
        builder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.DIRECT_MESSAGE_REACTIONS,GatewayIntent.DIRECT_MESSAGES,GatewayIntent.DIRECT_MESSAGE_TYPING);
        builder.setActivity(Activity.listening("your commands"));
        shardManager = builder.build();
        shardManager.addEventListener(new eventListener(), new commandManager());
    }



    public ShardManager getShardManager() {
        return shardManager;
    }

    public static void main(String[] args) throws LoginException {
        try{
            discordBot bot = new discordBot();
        }catch(LoginException e){
           System.out.println("Token Invalid");
        }
    }
}
