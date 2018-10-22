package com.libgdx.spritebatch;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Application extends ApplicationAdapter {
	SpriteBatch batch;
	Texture texture;
	TextureRegion textureRegion;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		texture = new Texture("badlogic.jpg");
		textureRegion = new TextureRegion(texture, 20, 20, 50, 50);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);  // This cryptic line clears the screen.
		batch.begin();
		// Drawing goes here!
		batch.draw(texture, 10, 10);
		batch.end();
	}
	
	@Override
	public void dispose () {
		texture.dispose();
		batch.dispose();
	}
}
