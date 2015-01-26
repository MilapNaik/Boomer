package com.boomer.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Assets {
	public static Texture texture_back; //The background image
	public static Sprite sprite_back; //The game version of the background image; what you render
	
	public static void load(){
		texture_back = new Texture(Gdx.files.internal("")); //File for background
		texture_back.setFilter(TextureFilter.Linear, TextureFilter.Linear); //Will help LibGDX scale
		
		sprite_back = new Sprite(texture_back);
		sprite_back.flip(false,  true); //flipping the image Y-wise
	}

}
