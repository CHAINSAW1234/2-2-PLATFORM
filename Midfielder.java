package uk.epl.player;
public class Midfielder extends Player {
    private int PASSING_POINT = 10;

    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name,jerseyNumber,speed,stamina,passing);

    }

    @Override
    protected float getPassing() {
        return super.getPassing() + PASSING_POINT;
    }
    public String toString() {
        String s = "Player name='" + getName() + ", JerseyNumber=" + getJerseyNumber() + " Position (" + position.x +
                " , " + position.y + ") Midfielder SPEED=" + getSpeed() + ", , STAMINA=" + getStamina() +
                ", , PASSING=" + getPassing();
        return s;
    }

}
