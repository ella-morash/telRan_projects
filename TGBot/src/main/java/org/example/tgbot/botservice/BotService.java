package org.example.tgbot.botservice;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;

public class BotService {

    private final String TOKEN = "";
    private final TelegramBot bot = new TelegramBot(TOKEN);

    public void initUpdateListener() {

        bot.setUpdatesListener(updates -> {

            for (Update update : updates) {

                if (update.message() != null && update.message().text() != null) {
                    long chatId = update.message().chat().id();
                    String messageFromUser = update.message().text();
                    System.out.println(messageFromUser);
                    MessageAnalyzer.analyzeMessage(chatId, messageFromUser,this.bot);
                }
            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;

        });
    }
}
