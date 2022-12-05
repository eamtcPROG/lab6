package Controller;

import Model.ChampionshipModel;
import View.ChampionshipView;

import java.util.Arrays;

public class ChampionshipController implements IChampionshipController{
    public ChampionshipModel championshipModel;
    public ChampionshipView championshipView;

    public ChampionshipController(ChampionshipModel championshipModel, ChampionshipView championshipView) {
        this.championshipModel = championshipModel;
        this.championshipView = championshipView;
    }
    public void setPointsWinner(int arr[]){
        this.championshipModel.pointsWinner = Arrays.stream(arr).max().getAsInt();
        int index = Arrays.asList(arr).indexOf(this.championshipModel.pointsWinner);
        this.championshipModel.winner = index;
    }

    public void showChampionshipWinnerPoints(){
        championshipView.printChampionshipWinner(this.championshipModel);
    }
}
