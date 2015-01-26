package com.boomer.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen{
	Boomer game;
	OrthographicCamera camera;
	SpriteBatch batch;

	
	public GameScreen(Boomer game){
		this.game=game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1920, 1080); //Y-Axis 0 is top left
		
		batch = new SpriteBatch();
		

	}
	
	@Override
	public void show() {

		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1F, 1F, 1F, 1F); //clears the screen to white
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //clears canvas and allows you to draw on it
		camera.update();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

}
