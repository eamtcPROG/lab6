package View;

import Model.RankingModel;
import Model.TeamModel;

public interface IRankingView {
    void printPoints(TeamModel team, RankingModel ranking);
}
