package com.unaj.javaweb.lescano;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public class BotService {

	@Autowired
	private MybotRepository UserRepository;

	public BotService() {
		super();
	}

	public void save(User u) {
		
		UserRepository.save(u);
	}
	
	public List<User> findAll(){
		return (List<User>) UserRepository.findAll();
	}
}
