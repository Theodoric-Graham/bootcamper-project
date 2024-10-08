package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.GameImpl;
import com.organization.mvcproject.api.service.GameService;
import com.organization.mvcproject.repository.MockGameDAO;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private MockGameDAO gameDao;
	
	@Override
	public List<GameImpl> retrieveAllGames() {
		return gameDao.retrieveAllGames();
	}
	
	@Override
	public GameImpl saveGame(GameImpl game) {
		return gameDao.saveOrUpdateGame(game);
	}
	
	public GameImpl updateGame(GameImpl game) {
		return gameDao.saveOrUpdateGame(game);
	}

	public boolean deleteGameById(Long gameId) {
		return gameDao.deleteGameById(gameId);
	}

	@Override
	public List<GameImpl> findGamesByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}




}