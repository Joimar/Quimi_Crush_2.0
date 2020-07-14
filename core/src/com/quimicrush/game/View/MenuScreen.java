package com.quimicrush.game.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.quimicrush.game.QuimiCrush;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MenuScreen implements Screen
{
    public static Texture backgroundTexture;
    private Stage stage;
    private TextureAtlas atlas;
    private TextureAtlas.AtlasRegion background;

    private Table view;

    private TextButton button;
    private TextureRegion textureButton;

    //Tentando setar o background novamente

    private SpriteBatch batch;
    public static Sprite backgroundSprite;

    public MenuScreen() {

        //this.stage = stage;
        //background = atlas.findRegion("background");

        backgroundTexture = new Texture("background.png");
        backgroundSprite =new Sprite(backgroundTexture);


    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
//        batch.draw(backgroundTexture, 10, 10);
        backgroundSprite.draw(batch);
        batch.end();

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

    public void setAssets()
    {

    }
}
