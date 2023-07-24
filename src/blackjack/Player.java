/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author dell
 */
public class Player {
    private String name;
    private int Score=0;
    Card []c=new Card[11];
    boolean win =false;
    boolean lose =false;
    int p_counter=0;
    public void setName(String name) {
        this.name = name;
    }
    public Player()
    {

    }
    public void add_card(Card ca)
    {
        c[p_counter]=new Card();
        c[p_counter]=ca;
        p_counter++;
        Score=Score+c[p_counter].getValue();
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }
    
}
