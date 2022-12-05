package Controller;

import Model.GameModel;
import Model.StadiumModel;
import Model.TeamModel;

public interface IGameController {
    GameModel getGameResult(TeamModel team1, TeamModel team2, StadiumModel stadiumModel);
    void printGameResult(TeamModel teamModel,TeamModel teamModel2,StadiumModel stadiumModel);
    void printGame(TeamModel teamModel,TeamModel teamModel2);
    int createInjury(int c);
}
