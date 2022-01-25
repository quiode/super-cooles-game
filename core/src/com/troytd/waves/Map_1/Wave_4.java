package com.troytd.waves.Map_1;

import com.badlogic.gdx.math.Vector2;
import com.troytd.enemies.Enemy;
import com.troytd.enemies.Horseman;
import com.troytd.enemies.Swordsman;
import com.troytd.enemies.enemyAmount;
import com.troytd.game.TroyTD;
import com.troytd.maps.Map;
import com.troytd.waves.Wave;

import java.util.ArrayList;
import java.util.Arrays;

public class Wave_4 extends Wave {
    /**
     * @param game          game instance
     * @param mapDistortion the distortion of the map
     * @param path          the path the enemies traverse
     * @param map           the map
     */
    public Wave_4(TroyTD game, Vector2 mapDistortion, ArrayList<enemyAmount> enemyList, Vector2[] path, Map map,
                  int pauseTime) {
        super(game, mapDistortion, new ArrayList<enemyAmount>(Arrays.asList(new enemyAmount(5, Horseman.class))),
              path, map,
              15000);

    }

    public static Class<? extends Enemy>[] getEnemyList() {return new Class[]{Horseman.class};}

}
