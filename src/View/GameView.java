package View;

import Model.GameModel;
import Model.StadiumModel;
import Model.TeamModel;

public class GameView implements IGameView{

    public void printWinner(GameModel gameModel, TeamModel team, StadiumModel stadium) {
        TeamView teamView = new TeamView();
        StadiumView stadiumView = new StadiumView();
        teamView.printTeamName(team);
        if(gameModel.result == 1){
            System.out.println(" Winner");
        } else if(gameModel.result == -1){
            System.out.println(" Defeat");
        }
        else {
            System.out.println(" Tie");
        }
        System.out.println("The team played: ");
        stadiumView.printStadium(stadium);
    }
    @Override
    public void printGame(TeamModel team1,TeamModel team2) {
        System.out.println("------------ Game -------------");
        TeamView teamView = new TeamView();
        teamView.printTeam(team1);
        System.out.println("||||||||||||| VS ||||||||||||||");
        teamView.printTeam(team2);
        System.out.println("-----------------------------");

    }
    public void printInjury(TeamModel team){
        System.out.println("Injury in this game"+ team.name);
    }
}
