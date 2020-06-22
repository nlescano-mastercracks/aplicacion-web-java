package com.unaj.javaweb.lescano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Configuration
public class BotConfig {

	@Autowired
	BotService service;
	
	
	private MyBot bot;
	
	private boolean contextStarted =false;
	
	@Bean
	public MyBot  bot() throws TelegramApiException {
		onCotextInitialized();
		return bot;
		
	}
	
	
	private void onCotextInitialized() throws TelegramApiException{
		if (!contextStarted) {
			ApiContextInitializer.init();
			final TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

			try {
				bot=new MyBot();
				telegramBotsApi.registerBot(bot);
				bot.setService(service);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
			
		}
	}
}
