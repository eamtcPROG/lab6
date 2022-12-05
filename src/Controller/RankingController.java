package Controller;

import Model.RankingModel;
import Model.TeamModel;
import View.RankingView;

public class RankingController {
    public RankingModel rankingModel;
    public RankingView rankingView;

    public RankingController(RankingModel rankingModel, RankingView rankingView) {
        this.rankingModel = rankingModel;
        this.rankingView = rankingView;
    }
    public RankingModel calcPoints(GameController gameController){
        if(gameController.gameModel.result == 1){
            this.rankingModel.points += 3;
        } else if (gameController.gameModel.result == 0) {
            this.rankingModel.points += 1;
        }
        else{
            this.rankingModel.points += 0;
        }
        return this.rankingModel;
    }
    public void printRanking(TeamModel teamModel){
        rankingView.printPoints(teamModel,this.rankingModel);
    }
    public void printRanking(){
        rankingView.printPoints(this.rankingModel);
    }
}
