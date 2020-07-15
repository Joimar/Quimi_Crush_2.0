package com.quimicrush.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.quimicrush.game.View.MenuScreen;

public class QuimiCrush extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	MenuScreen menu;

	TextureRegion region;
	FPSLogger fpsLogger = new FPSLogger();

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("background.png");
		region = new TextureRegion(new Texture("background.png"), 0, 0, 2048, 563);
		//menu = new MenuScreen();

	}

	@Override//render dando trabalho muito
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		fpsLogger.log();

		batch.begin();
		batch.draw(region, 0, 0);



		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
