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
public class Enemy extends GameCharacter {

    public Enemy(int life, String name, int points) {
        super(life, name, points);
    }

    @Override
    public String printState() {
        if (super.getLife() < 1) {
            return super.getName() + " dies";
        }
        else{
        return super.getName() + " lives";
        }
    }
}
