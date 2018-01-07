package com.igs.ipi.tpspringbootcastro.service;

import org.springframework.stereotype.Service;
import com.igs.ipi.tpspringbootcastro.modele.GameModel;

@Service
public class GameService {

	public GameModel newGame() {
	GameModel gameModel = new GameModel("joueur1", "joueur2");
	return gameModel;
	}

	

	
}
