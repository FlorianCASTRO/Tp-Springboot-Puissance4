package com.igs.ipi.tpspringbootcastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igs.ipi.tpspringbootcastro.modele.GameModel;
import com.igs.ipi.tpspringbootcastro.service.GameService;
import com.igs.ipi.tpspringbootcastro.service.PartieEnCours;

@Controller
@RequestMapping("/game")
public class GameController {
	
	
	@Autowired
	private GameService gameService;
	
	@Autowired
	private PartieEnCours partieEnCours;
	
	public GameController(GameService gameService) {
	}
	
	public GameController(GameService gameService, PartieEnCours partieEnCours) {
		this.gameService = gameService;
		this.partieEnCours = partieEnCours;
	}
	
	
	@GetMapping("/new")
	public ModelAndView SetnewGame () {
    		GameModel gameModel = gameService.newGame();
    		partieEnCours.setGameModel(gameModel);
    		ModelAndView mav = new ModelAndView("game");
    		mav.addObject("gameModel", gameModel); 
    		return mav; 
	}
	
	@GetMapping("/game")
	public ModelAndView GetnewGame () {
    		GameModel gameModel = gameService.newGame();
    		partieEnCours.getGameModel(gameModel);
    		ModelAndView mav = new ModelAndView("game");
    		mav.addObject("gameModel", gameModel); 
    		return mav; 
	}
	
	@GetMapping("/game/drop/{i}")
	public ModelAndView drop(@PathVariable("i") Integer numColonne) {
		ModelAndView mav = new ModelAndView("game");
		GameModel gameModel = partieEnCours.getGameModel();
		int index = numColonne - 1;
		gameModel.add(index);
		mav.addObject("gameModel", gameModel); 
	return mav; 
	}
	
}
