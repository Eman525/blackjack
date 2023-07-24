/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
        GUI gui = new GUI();
        //Card c = new Card();
        Game g = new Game();
        
        g.add_player();
        
        
    }
    
}
