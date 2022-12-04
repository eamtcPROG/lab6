package View;

import Model.RankingModel;
import Model.TeamModel;

public class RankingView implements IRankingView{
    @Override
    public void printPoints(TeamModel team, RankingModel ranking) {
        System.out.print("Points of ");
        TeamView teamView = new TeamView();
        teamView.printTeamName(team);
        System.out.print(": " + ranking.points);
        System.out.println("-----------------------------");
    }
}
