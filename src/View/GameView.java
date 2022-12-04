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
            System.out.print(" Winner");
        } else if(gameModel.result == -1){
            System.out.print(" Defeat");
        }
        else {
            System.out.print(" Tie");
        }
        System.out.print("The team played: ");
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
}
