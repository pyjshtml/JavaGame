package game.mob.enemy;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class Zombie extends Enemy{
    public static final Color ZOMBIE_COLOR = Color.DARKGREEN;
    public Zombie(Point2D position){
        super(position, ZOMBIE_COLOR);
    }
    // Override thiss
    @Override
    public void attackPlayer(){}
    @Override
    public String toString(){
        String s = super.toString();
        return "Zombie" + s.substring(5, s.length());
    }
}