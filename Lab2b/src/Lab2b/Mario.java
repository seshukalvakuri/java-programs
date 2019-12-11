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
public class Mario extends GameCharacter {
    
    private boolean invulnerable;
    
    

    public Mario() {
        super(1,"Mario",0);
        this.invulnerable=false;
    }

       public boolean isInvulnerable() {
        return invulnerable;
    }

    public void setInvulnerable(boolean invulnerable) {
        this.invulnerable = invulnerable;
    }
    
    public int getFinalScore() throws DeadMarioException{
    if(super.getLife()>0){
    return 1000+super.getPoints();
    }
    else throw new DeadMarioException();
    }
    
    
    
    @Override
    public String printState() {
        try{
        return "Mario wins: "+getFinalScore()+" points";
        }
        catch(DeadMarioException e){
        return "Mario dies";
        }
    }
    
}
