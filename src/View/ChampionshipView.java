package View;

import Model.ChampionshipModel;

public class ChampionshipView implements IChampionshipView{
    @Override
    public void printChampionshipWinner(ChampionshipModel championship) {
        System.out.println("------------- !!! -------------");
        System.out.println("ChampionshipWinner is " + championship.winner +
                " with " + championship.pointsWinner + " points");
    }
}
