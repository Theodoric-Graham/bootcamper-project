package com.organization.mvcproject.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.organization.mvcproject.model.GameImpl;

@Repository
public class MockGameDAO {
	
	private static Long gameId = new Long(0);
	private static Long companyId = new Long(0);
	private static List<GameImpl> games = new ArrayList<>();

	static {
		games = populateGames();
	}

	private static List<GameImpl> populateGames() {

		GameImpl game1 = new GameImpl();
		game1.setId(++gameId);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		GameImpl game2 = new GameImpl();
		game2.setId(++gameId);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		GameImpl game3 = new GameImpl();
		game3.setId(++gameId);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		games.add(game1);
		games.add(game2);
		games.add(game3);

		return games;
	}
	
	//Create or Update
	public GameImpl saveOrUpdateGame(GameImpl game) {
		//is update
		if(game.getId() != null) {
			for(var i = 0; i < games.size(); i++) {
				if(game.getId().equals(games.get(i).getId())) {
					games.set(i, game);
					return game;
				}
			}
		}
		
		game.setId(++gameId);
		games.add(game);
		return game;
	}
	
	//Read
	public List<GameImpl> retrieveAllGames() {
		return games;
	}
	
	//Delete
	public boolean deleteGameById(Long gameId) {
		for(var i = 0; i < games.size(); i++) {
			if(gameId.equals(games.get(i).getId())) {
				games.remove(i);
				return true;
			}
		}
		return false;
	}
	
	


}
