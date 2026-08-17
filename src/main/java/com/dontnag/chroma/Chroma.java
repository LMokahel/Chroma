package com.dontnag.chroma;

import io.github.cdimascio.dotenv.Dotenv;

import com.dontnag.chroma.event.EventManager;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Chroma {

    public static void main(String[] args) {
        Dotenv config = Dotenv.configure().load();
        String token = config.get("TOKEN");

        JDABuilder.createDefault(token)
            .setStatus(OnlineStatus.ONLINE)
            .setActivity(Activity.playing("discord.gg/avf4H9RbvF"))
            .build()
            .addEventListener(new EventManager());
    }
}
