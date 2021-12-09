package com.devinhouse.controllers.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devinhouse.model.Game;

@RestController
@RequestMapping("/games")
public class GamesRest {

	public List<Game> gamesList = Arrays.asList(
			new Game("It Takes Two", "Electronic Arts Inc", 123.31),
			new Game("Synth Riders", "KLUGE STRATEGIC, INC", 124.50),
			new Game("NieR Replicant", "SQUARE ENIX CO. LTD", 249.90),
			new Game("Psychonauts 2", "Microsoft Corporation", 207.93),
			new Game("Mass Effect™ Legendary Edition", "Electronic Arts Inc", 149.45),
			new Game("Disco Elysium - The Final Cut", "ZA/UM", 214.90),
			new Game("HITMAN 3", "IO Interactive A/S", 127.96),
			new Game("Guilty Gear -Strive-", "ARC SYSTEM WORKS", 194.93),
			new Game("Castlevania Advance Collection", "Konami Digital Entertainment, Inc", 99.90),
			new Game("Persona®5 Strikers", "SEGA of America, Inc", 299.90)
	);
	
	@GetMapping("/list")
	public List<Game> listGames(){
		return gamesList;
	}
}
