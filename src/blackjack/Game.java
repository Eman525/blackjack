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
import java.util.Scanner;
import java.util.Random;
public class Game {
    
    Player []p=new Player[4];
    Card []c=new Card[52];
    public int high_score=0;

    public void generate_card()
    {
        for(int i=0;i<4;i++)
        {
            c[i]=new Card();
            for(int j=0;j<13;j++)
            {
                c[j].setRank(j);
                c[j].setValue(j+1);
                c[j].setSuit(i);
            }
        }
    }
    public int withdraw()
    {
        Random rand =new Random();
        int index=rand.nextInt(52);
        while (true) {
            if (c[index] == null) {
                 index=rand.nextInt(52);
            }
            else {
                return index;
            }
        }
    }
    public void add_player()
    {
        Scanner input=new Scanner(System.in);
        String n1=input.next();
        String n2=input.next();
        String n3=input.next();
        String n4=input.next();
        p[0]=new Player(n1);
        p[1]=new Player(n2);
        p[2]=new Player(n3);
        p[3]=new Player(n4);
        p[0].add_card(c[withdraw()]);
        p[0].add_card(c[withdraw()]);
        p[1].add_card(c[withdraw()]);
        p[1].add_card(c[withdraw()]);
        p[2].add_card(c[withdraw()]);
        p[2].add_card(c[withdraw()]);
        p[3].add_card(c[withdraw()]);
        p[3].add_card(c[withdraw()]);
    }
 public void


    
    
}
