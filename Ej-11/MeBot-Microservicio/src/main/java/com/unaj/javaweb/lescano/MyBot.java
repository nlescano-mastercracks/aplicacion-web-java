package com.unaj.javaweb.lescano;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
	
	BotService service;
	
	

	List<BotCommand> commands = Arrays.asList(new BotCommand("saludar", "Saludar"),
			new BotCommand("usuarios", "Listas los Usuarios"));

	public MyBot() {

		try {
			execute(new SetMyCommands(commands));

		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onUpdateReceived(Update update) {
		String name = update.getMessage().getFrom().getFirstName();
		String lastName = update.getMessage().getFrom().getLastName();
		String command = update.getMessage().getText();
		User userNew = new User(name, lastName);

		if (update.hasMessage() && update.getMessage().hasText()) {
			SendMessage message = new SendMessage()
					.setChatId(update.getMessage().getChatId());
			switch (command) {
			case "/saludar":
				message.setText("Buenos diass " + name);
				break;
			case "/usuarios":
				String Users = "";
				for (User user : service.findAll()) {
					Users = Users + " " + user;
				}
				message.setText(name);
				break;
			default:
				break;
			}
			try {
				execute(message);
				service.save(userNew);

			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getBotUsername() {
		return "NicoJavabot";
	}

	@Override
	public String getBotToken() {
		return "1161323208:AAHdcXzEGwdUpf3lzMBEH8Cy8JEu1oXR_OE";
	}
	
	public void setService (BotService service) {this.service =service;}


}
