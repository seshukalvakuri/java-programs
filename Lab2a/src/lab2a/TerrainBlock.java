/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2a;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class TerrainBlock {
    
    private boolean powerPallet;
      private GameCharacter gameCharacter;

    public TerrainBlock(boolean powerPallet, GameCharacter gameCharacter) {
        this.powerPallet = powerPallet;
        this.gameCharacter = gameCharacter;
    }
    
    public int getTerrainPoints(){
    if(powerPallet == true){
    return 100;
    }
    else 
        return 10;
    }
    
    public int getPoints(){
    if(gameCharacter!=null){
    return gameCharacter.getPoints();
    }
    else 
        return getTerrainPoints();
    }
    
    public boolean containsGhost(){
    if(gameCharacter==null){
    return false;
    }
    else
        return true;
    }

    public boolean isPowerPallet() {
        return powerPallet;
    }

    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }

    public void setGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }
    
    
}
