/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MarioDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner myScanner = new Scanner(new File("MarioGameWord.txt"));

        while (myScanner.hasNext()) {
            ArrayList<TerrainBlock> terrain = new ArrayList<TerrainBlock>();
            Mario mario = new Mario();
            String line = myScanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '$') {
                    TerrainBlock t1 = new TerrainBlock(false, null);
                    terrain.add(t1);
                }
                if (line.charAt(i) == 'I') {
                    TerrainBlock t2 = new TerrainBlock(true, null);
                    terrain.add(t2);
                }
                if (line.charAt(i) == 'G') {
                    TerrainBlock t3 = new TerrainBlock(false, new Enemy(2, "Goombas", 50));
                    terrain.add(t3);
                }
                if (line.charAt(i) == 'K') {
                    TerrainBlock t4 = new TerrainBlock(false, new Enemy(2, "KoopaTroopas", 40));
                    terrain.add(t4);
                }
                if (line.charAt(i) == 'B') {
                    TerrainBlock t5 = new TerrainBlock(false, new Enemy(1, "Buzzy Beetles", 30));
                    terrain.add(t5);
                }
                if (line.charAt(i) == 'X') {
                    //TerrainBlock t6 = new TerrainBlock(false, new Enemy(1, "Bullet Bills", 20));
                    GameCharacter enemy = new Enemy(1, "Bullet Bills", 20);
                    TerrainBlock t6 = new TerrainBlock(false, enemy);
                    terrain.add(t6);
                }
            }
                for (TerrainBlock b : terrain) {
                    if (mario.getLife() > 0) {
                        int m = mario.getPoints() + b.getPoints();
                        mario.setPoints(m);
                        
                        if (b.isStarman()) {
                        mario.setInvulnerable(true);
                    }
                    

                    if (b.containsEnemy() == true) {
                        if (mario.isInvulnerable() == false) {
                            mario.setLife(0);
                            b.setGamecharacter(mario);
                        } else {
                            //mario.setLife(mario.getLife() - 1);
                            b.getGamecharacter().setLife(b.getGamecharacter().getLife()-1);
                            //t.getGameCharacter().setLife(t.getGameCharacter().getLife() - 1);
                        }
                    }
                    
                    }
                }

                if (mario.getLife() > 0) {
                    terrain.get(terrain.size() - 1).setGamecharacter(mario);
                    
                }

                
            
            System.out.println(mario.printState());
            System.out.println();
        }

    }

}
