package Controller;

import Model.PlayerModel;
import Model.TeamModel;
import View.PlayerView;
import View.TeamView;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

public class TeamController implements ITeamController{
    public TeamModel teamModel;
    public TeamView teamView;

    public TeamController(TeamModel teamModel, TeamView teamView) {
        this.teamModel = teamModel;
        this.teamView = teamView;
    }
    public TeamModel setTeamRating(){
        Stream<Float> stream =  Arrays.stream(this.teamModel.players).map(el -> el.rating );
        this.teamModel.rating = 0;
        stream.forEach(el -> this.teamModel.rating = this.teamModel.rating + el);
        this.teamModel.rating = this.teamModel.rating / this.teamModel.players.length;

        return this.teamModel;
    }
    public void showTeam(){
        teamView.printTeam(setTeamRating());
    }
    public void showTeamWithPlayers(PlayerView playerView){
        teamView.printTeam(this.teamModel,playerView) ;
    }
}
