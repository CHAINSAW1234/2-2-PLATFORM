package uk.epl.game;
import uk.epl.player.*;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player player) {
        players.add(player);
    }
    public void moveUp(final int n) {
        for(Player p:players) {
            if(p.getJerseyNumber()==n)
                p.moveUp();
        }
    }
    public void moveDown(final int n) {
        for (Player p : players) {
            if (p.getJerseyNumber() == n)
                p.moveDown();
        }
    }
    public void moveLeft(final int n) {
        for(Player p:players) {
            if(p.getJerseyNumber()==n)
                p.moveLeft();
        }
    }
    public void moveRight(final int n) {
        for (Player p : players) {
            if (p.getJerseyNumber() == n)
                p.moveRight();
        }
    }
    public void start() {
        int i=1;
        for(Player p:players) {
            p.changePosition(34,25*i++);
        }

    }
    public void info() {
        for(Player p: players)
            System.out.println(p);
    }
    public void stop() {

    }


}
