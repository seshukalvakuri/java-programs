/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2a;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Pacman extends GameCharacter{
   private boolean invincible;
   
    public Pacman() {
        super(1,"Pacman" , 0);
        this.invincible = false;
    }

    
    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }
   
    public int getFinalScore() throws DeadPacmanException{
    if(super.getLife()>0){
    return 1000+super.getPoints();
    }
    else
        throw new DeadPacmanException();
    
    }

    @Override
    public String printState() {
        try{
        return "Pacman wins:" + getFinalScore() + "points";
        } catch (DeadPacmanException ex) {
           return "Pacman dies";
       }
    }
   
}
