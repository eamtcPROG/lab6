package Model;

public class TeamModel {
    public String name;
    public float rating;
    public PlayerModel players[];
    public CoachModel coach;

    public TeamModel(String name, PlayerModel players[],CoachModel coach) {
        this.name = name;
        this.coach = coach;
        this.players = players;

    }
}
