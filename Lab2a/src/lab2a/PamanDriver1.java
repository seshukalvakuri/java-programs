/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class PamanDriver1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner myScanner = new Scanner(new File("PacmanMaze.txt"));
        while (myScanner.hasNext()) {
            ArrayList<TerrainBlock> terrain = new ArrayList<TerrainBlock>();
            Pacman pacman = new Pacman();
            String firstLine = myScanner.nextLine();
            Ghost ghostobj;
            for (int i = 0; i < firstLine.length(); i++) {


                switch (firstLine.charAt(i)) {
                    case '*':
                        terrain.add(new TerrainBlock(false, null));
                        break;
                    case 'O':
                        terrain.add( new TerrainBlock(true, null));
                        break;
                    case 'B':
                       terrain.add(new TerrainBlock(false, new Ghost(2, "Blinky", 40)));
                       break;
                    case 'Y':
                       terrain.add(new TerrainBlock(false, new Ghost(2, "Pinky", 30)));
                       break;
                    case 'I':
                        terrain.add(new TerrainBlock(false, new Ghost(1, "Inky", 20)));
                        break;
                    case 'C':
                        terrain.add(new TerrainBlock(false, new Ghost(1, "Clyde", 10)));
                        break;
                }
                
            }
            for (TerrainBlock t : terrain) {
                
                int d = pacman.getPoints() + t.getPoints();
                pacman.setPoints(d);
                if (t.isPowerPallet() == true) {
                    pacman.setInvincible(true);
                }
                if (t.containsGhost() == true) {
                    if (pacman.isInvincible() == false) {
                        pacman.setLife(0);
                        t.setGameCharacter(pacman);
                    } else {
                        t.getGameCharacter().setLife(t.getGameCharacter().getLife() - 1);
                    }

                }

            }
            if (pacman.getLife() > 0) {
                terrain.get(terrain.size()-1).setGameCharacter(pacman);
            }
            System.out.println(pacman.printState());
            System.out.println();

        }
    }

}
