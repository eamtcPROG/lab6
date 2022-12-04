package Model;

import Builder.HumanBuilder;

public class PlayerModel extends HumanModel{
    public int position;
    public int technique;
    public int stamina;
    public int speed;

    public PlayerModel(HumanBuilder builder,int position,int technique,int stamina, int speed) {
        super(builder);
        this.position = position;
        this.technique = technique;
        this.stamina = stamina;
        this.speed = speed;
        this.rating = (this.technique + this.speed + this.stamina)/3;
    }
}
