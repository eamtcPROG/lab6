package Controller;

import Model.RankingModel;
import Model.TeamModel;

public interface IRankingController {
    RankingModel calcPoints(GameController gameController);
    void printRanking(TeamModel teamModel);
    void printRanking();
}
