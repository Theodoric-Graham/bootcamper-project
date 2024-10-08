package com.organization.mvcproject.api.service;

import java.util.List;

import com.organization.mvcproject.model.GameImpl;

public interface GameService {
	

	List<GameImpl> retrieveAllGames();
	
	List<GameImpl> findGamesByGenre(String genre);
	
	GameImpl saveGame(GameImpl gameImpl);
	
	GameImpl updateGame(GameImpl gameImpl);

	boolean deleteGameById(Long id);

}
