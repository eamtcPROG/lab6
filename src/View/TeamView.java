package View;

import Model.TeamModel;

import java.util.Arrays;

public class TeamView implements ITeamView{
    @Override
    public void printTeam(TeamModel team) {
        System.out.println("-----------------------------");
        System.out.println("Team name: " + team.name);
        System.out.println("Team rating: " + team.rating);
        System.out.println("Team coach name: " + team.coach.name);
        System.out.println("-----------------------------");
    }
    public void printTeam(TeamModel team,PlayerView playerView) {
        System.out.println("|||||||||||||||||||||||||||||");
        printTeam(team);
        for (int i =0; i< team.players.length;i++){
            playerView.printPlayer(team.players[i]);
        }
        System.out.println("|||||||||||||||||||||||||||||");
    }
    public void printTeamName(TeamModel teamModel){
        System.out.print("Team name: " + teamModel.name);
    }
}
