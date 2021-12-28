package com.troytd.enemies;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.troytd.game.TroyTD;

import java.util.ArrayList;

/**
 * an enemy with its texture, health and other related properties
 */
public abstract class Enemy {
    public final static short spawnSpeed = 2000;
    protected final static short hp = 100;
    protected final static int speed = 1;
    protected final static short damage = 10;
    protected final Vector2[] path;
    protected final byte line;
    protected final TroyTD game;
    /**
     * t in [0,1] in path
     */
    protected int position_on_path;
    protected Sprite enemySprite;
    private boolean draw = true;

    /**
     * @param line     the line where the enemy is located, 0 is the top line, 1 is the middle line, 2 is the bottom line
     * @param game     the game instance
     * @param position the position of the enemy
     * @param path     the path the enemy will follow, in precalculated points
     */
    public Enemy(byte line, final TroyTD game, final Vector2 position, final Texture texture, final Vector2 distortion,
                 Vector2[] path) {
        this.line = line;
        this.game = game;
        this.enemySprite = new Sprite(texture);
        this.path = path;
        enemySprite.setPosition(position.x, position.y);
        enemySprite.setSize(enemySprite.getWidth() * distortion.x, enemySprite.getHeight() * distortion.y);
    }

    public static void loadAssets() {
    }

    public Vector2 getPosition() {
        return enemySprite.getBoundingRectangle().getPosition(new Vector2());
    }

    public void setPosition(Vector2 position) {
        enemySprite.setPosition(position.x, position.y);
    }

    public void dispose() {
        enemySprite.getTexture().dispose();
    }

    public void hide() {
        draw = false;
    }

    public void show() {
        draw = true;
    }

    public void draw() {
        if (draw) enemySprite.draw(game.batch);
    }

    public void update(final ArrayList<Enemy> enemies) {
        position_on_path += speed;

        if (position_on_path < path.length) {
            enemySprite.setPosition(path[position_on_path].x, path[position_on_path].y + line * 5);
        } else {
            enemies.remove(this);
        }
    }
}
