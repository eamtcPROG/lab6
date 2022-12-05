package View;

import Model.PlayerModel;
import Model.TeamModel;

import java.util.Arrays;

public class TeamView implements ITeamView{
    @Override
    public void printTeam(TeamModel team) {
        System.out.println("-----------------------------");
        System.out.println("Team name: " + team.name);
        System.out.println("Team rating: " + team.rating);
        System.out.println("Team coach name: " + team.coach.name + " " + team.coach.surname);
        System.out.println("-----------------------------");
    }
    public void printTeam(TeamModel team,PlayerView playerView) {
        System.out.println("|||||||||||||||||||||||||||||");
        printTeam(team);
        Arrays.stream(team.players).forEach(playerView::printPlayer);
        System.out.println("|||||||||||||||||||||||||||||");
    }
    public void printTeamName(TeamModel teamModel){
        System.out.print("Team name: " + teamModel.name);
    }
}
