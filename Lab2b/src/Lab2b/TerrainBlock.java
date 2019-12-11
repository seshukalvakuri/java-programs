/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2b;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class TerrainBlock {
    private boolean starman;
    private GameCharacter gamecharacter;

    public TerrainBlock(boolean starman, GameCharacter gamecharacter) {
        this.starman = starman;
        this.gamecharacter = gamecharacter;
    }
    
    public int getTerrainPoints(){
    if(starman == true){
    return 100;
    }
    else{
    return 10;
    }
    }
    
    public int getPoints(){
    if(gamecharacter != null){
    return gamecharacter.getPoints();
    }
    else{
    return getTerrainPoints();
    }
    }
    
    public boolean containsEnemy(){
    if(gamecharacter == null){
    return false;
    }
    else {
    return true;
    }
    }

    public boolean isStarman() {
        return starman;
    }

    public GameCharacter getGamecharacter() {
        return gamecharacter;
    }

    public void setGamecharacter(GameCharacter gamecharacter) {
        this.gamecharacter = gamecharacter;
    }
    
    
}
