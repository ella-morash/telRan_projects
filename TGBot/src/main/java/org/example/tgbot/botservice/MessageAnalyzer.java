package org.example.tgbot.botservice;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.example.tgbot.Berlin24Searcher;
import org.example.tgbot.CatalogParser;
import org.example.tgbot.utils.TelegramKeyBoard;

import java.util.List;

public class MessageAnalyzer {

    public static void analyzeMessage(long chatId, String message, TelegramBot bot) {
        if (message.equals("/start") || message.equals("Новый поиск")) {
            initOnStart(chatId, message, bot);

        } else {
            processMessage(chatId, message, bot);
        }
    }

    private static void initOnStart(long chatId, String message, TelegramBot bot) {

        var replyKeyboardMarkup = TelegramKeyBoard.createTelegramKeyboard(Berlin24Searcher.getLabels());
        SendResponse execute = bot.execute(new SendMessage(chatId, "Berlin 24").replyMarkup(replyKeyboardMarkup));
    }

    private static void processMessage(long chatId, String message, TelegramBot bot) {

        if (Berlin24Searcher.getLabels().contains(message)) {
            Berlin24Searcher searcher = new Berlin24Searcher();
            searcher.getLinksAndLabels();

            CatalogParser catalogParser = new CatalogParser(searcher, message);
            catalogParser.createCatalog();
            List<String> catalog = catalogParser.getCatalog();
            if (catalog.size()<=10) {
                catalog.forEach(info -> bot.execute(new SendMessage(chatId, info)));
            } else {
                for (int i = 0; i < 10; i++) {
                    bot.execute(new SendMessage(chatId, catalog.get(i)));
                }
                SendResponse execute3 = bot.execute(
                        new SendMessage(chatId, "Berlin 24").replyMarkup(TelegramKeyBoard.createAnotherBottom()));
                for (int i = 10; i < catalog.size(); i++) {
                    bot.execute(new SendMessage(chatId, catalog.get(i)));

                }
            }


            //SendResponse execute3 = bot.execute(new SendMessage(chatId, "To continue searching tap /again"));
            SendResponse execute4 = bot.execute(
                    new SendMessage(chatId,"Berlin 24").replyMarkup(TelegramKeyBoard.createBottom())
            );
        }
    }

}


