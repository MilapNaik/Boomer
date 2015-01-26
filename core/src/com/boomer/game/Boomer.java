package com.boomer.game;
import com.badlogic.gdx.Game;
import com.boomer.game.Assets;
import com.boomer.game.GameScreen;

public class Boomer extends Game {

	
	public GameScreen game_screen;
	
	@Override
	public void create () {
		Assets.load();//load the assets from Assets.java
		
		game_screen = new GameScreen(this);
		setScreen(game_screen);
		
		
	}

	@Override
	public void render () {
		
	}
}