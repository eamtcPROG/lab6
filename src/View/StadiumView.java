package View;

import Model.StadiumModel;

public class StadiumView implements IStadiumView{
    @Override
    public void printStadium(StadiumModel stadiumModel) {
        System.out.println("-----------------------------");
        System.out.println("Stadium: " + stadiumModel.stadiumType);
        System.out.println("-----------------------------");
    }
}
