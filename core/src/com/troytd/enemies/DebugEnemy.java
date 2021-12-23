package com.troytd.enemies;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.CatmullRomSpline;
import com.badlogic.gdx.math.Vector2;
import com.troytd.game.TroyTD;

/**
 * Class for debugging enemies
 */
public class DebugEnemy extends Enemy {
    protected final static short spawnSpeed = 3;

    public DebugEnemy(byte line, final TroyTD game, Vector2 position, final Vector2 distortion, final
    Vector2[] path) {
        super(line, game, position, game.assetManager.<Texture>get("enemies/DebugEnemy.png", Texture.class),
              distortion, path);
    }
}
