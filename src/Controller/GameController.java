package Controller;

import Model.GameModel;
import Model.StadiumModel;
import Model.TeamModel;
import View.GameView;

import java.util.Random;

public class GameController implements IGameController{
    public GameModel gameModel;
    public GameView gameView;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }
    public GameModel getGameResult(TeamModel team1, TeamModel team2, StadiumModel stadiumModel){
        if(stadiumModel.stadiumType == "h") team1.rating = team1.rating + 1;
        else team1.rating = team1.rating - 5;
        if(createInjury(10) == 8) {
            team1.rating = team1.rating - 10;
            gameView.printInjury(team1);
        }
        if(team1.rating < team2.rating){
            this.gameModel.result = 1;
        } else if (team1.rating == team1.rating) {
            this.gameModel.result = 0;
        }
        else {
            this.gameModel.result = -1;
        }
        return this.gameModel;
    }
    public void printGameResult(TeamModel teamModel,TeamModel teamModel2,StadiumModel stadiumModel){
        gameView.printWinner(getGameResult(teamModel,teamModel2,stadiumModel),teamModel,stadiumModel);
    }
    public void printGame(TeamModel teamModel,TeamModel teamModel2){
        gameView.printGame(teamModel,teamModel2);
    }
    public int createInjury(int c){
        Random r = new Random();
        int ran = r.nextInt(c);
        return ran;
    }
}
