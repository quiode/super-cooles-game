package com.troytd.enemies;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.troytd.game.TroyTD;
import com.troytd.helpers.Stat;
import com.troytd.maps.Map;

import java.util.HashMap;

public class Cart_Rider extends Enemy {
    public final static HashMap<String, Stat> defaultStats = (HashMap<String, Stat>) Enemy.defaultStats.clone();

    static {
        defaultStats.put("speed", new Stat<>("speed", 80));
        defaultStats.put("damage", new Stat<>("damage", 50));
        defaultStats.put("range", new Stat<>("range", 40));
        defaultStats.put("spawnSpeed", new Stat<>("spawnSpeed", 80));
        defaultStats.put("worth", new Stat<>("worth", 30));
        defaultStats.put("maxHP", new Stat<>("maxHP", 30000));
    }

    /**
     * @param line       the line where the enemy is located, 0 is the top line, 1 is the middle line, 2 is the bottom line
     * @param game       the game instance
     * @param position   the position of the enemy
     * @param texture
     * @param path       the path the enemy will follow, in precalculated points
     * @param map
     */
    public Cart_Rider(byte line, TroyTD game, Vector2 position, Vector2[] path, Map map) {
        super(line, game, position, game.assetManager.get("enemies/Cart_Rider.png", Texture.class), path, map);
    }
}
