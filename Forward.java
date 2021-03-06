package uk.epl.player;
public class Forward extends Player {
    private int ACCELERATION_POINT = 10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name,jerseyNumber,speed,stamina,passing);
    }

    @Override
    protected float getSpeed() {
        return super.getSpeed() + ACCELERATION_POINT;
    }
    public String toString() {
        String s = "Player name='" + getName() + ", JerseyNumber=" + getJerseyNumber() + " Position (" + position.x +
                " , " + position.y + ") Forward SPEED=" + getSpeed() + ", , STAMINA=" + getStamina() +
                ", , PASSING=" + getPassing();
        return s;
    }

}