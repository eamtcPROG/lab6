package View;

import Model.GameModel;
import Model.StadiumModel;
import Model.TeamModel;


public interface IGameView {
    void printGame(TeamModel team1,TeamModel team2);
    void printWinner(GameModel gameModel, TeamModel team, StadiumModel stadium);
}
