import Builder.HumanBuilder;
import Controller.*;
import Model.*;
import View.*;

import java.util.Arrays;

public class Main {
    public static PlayerModel[] createPlayers(int ageTeam1[],int statsTeam1[]){
        HumanBuilder humanBuilder =new HumanBuilder();
        PlayerView playerView = new PlayerView();
        PlayerModel player1 = new PlayerModel(humanBuilder.age(ageTeam1[0]).name("Player").surname(String.valueOf(0)), 1, statsTeam1[0], statsTeam1[1], statsTeam1[2]);
        PlayerController playerController = new PlayerController(player1, playerView);
        PlayerModel player2 = new PlayerModel(humanBuilder.age(ageTeam1[1]).name("Player").surname(String.valueOf(1)), 2, statsTeam1[3], statsTeam1[4], statsTeam1[5]);
        PlayerController playerController2 = new PlayerController(player2, playerView);
        PlayerModel player3 = new PlayerModel(humanBuilder.age(ageTeam1[2]).name("Player").surname(String.valueOf(2)), 3, statsTeam1[6], statsTeam1[7], statsTeam1[8]);
        PlayerController playerController3 = new PlayerController(player3, playerView);
        PlayerModel player4 = new PlayerModel(humanBuilder.age(ageTeam1[3]).name("Player").surname(String.valueOf(3)), 4, statsTeam1[9], statsTeam1[10], statsTeam1[11]);
        PlayerController playerController4 = new PlayerController(player4, playerView);
        PlayerModel player5 = new PlayerModel(humanBuilder.age(ageTeam1[4]).name("Player").surname(String.valueOf(4)), 5, statsTeam1[12], statsTeam1[13], statsTeam1[14]);
        PlayerController playerController5 = new PlayerController(player5, playerView);
        PlayerModel player6 = new PlayerModel(humanBuilder.age(ageTeam1[5]).name("Player").surname(String.valueOf(5)), 6, statsTeam1[15], statsTeam1[16], statsTeam1[17]);
        PlayerController playerController6 = new PlayerController(player6, playerView);
        PlayerModel players[] = new PlayerModel[]{playerController.getPlayer(),playerController2.getPlayer(),
                playerController3.getPlayer(),playerController4.getPlayer(),playerController5.getPlayer(),playerController6.getPlayer()};
        return players;
    }
    public static GameController play(TeamModel team1,TeamModel team2,StadiumModel stadiumModel){
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView();
        GameController gameController = new GameController(gameModel,gameView);

        gameController.printGame(team1,team2);
        gameController.printGameResult(team1,team2,stadiumModel);
        return  gameController;
    }
    public static RankingController returnNumberOfPoints(TeamModel team1,TeamModel[] teams,int i){
        StadiumModel stadiumModel = new StadiumModel("h");
        StadiumModel stadiumModel2 = new StadiumModel("a");

        RankingModel rankingModel = new RankingModel(0);
        RankingView rankingView = new RankingView();
        RankingController rankingController = new RankingController(rankingModel,rankingView);

        Arrays.stream(teams).forEach(teamModel -> {
            if(i % 2 == 0){
                rankingController.calcPoints(play(team1,teamModel,stadiumModel));
            }else {
                rankingController.calcPoints(play(team1,teamModel,stadiumModel2));
            }
        });
        return rankingController;
    }
    public static RankingController mergeToControllers(RankingController r1,RankingController r2){
        RankingModel rankingModel = new RankingModel(0);
        RankingView rankingView = new RankingView();
        RankingController rankingController = new RankingController(rankingModel,rankingView);
        rankingController.rankingModel.points = r1.rankingModel.points + r2.rankingModel.points;

        return rankingController;
    }
    public static void main(String[] args) {
        //Team 1
        while (true) {
        int[] ageTeam1 = new int[]{ 24,34,19,30,24,26,25,22,39,29,19};
        int[] statsTeam1 = new int[]{ 40,60,70,40,54,10,56,70,82,93,70,81,47,60,79,42,54,100};
        HumanBuilder humanBuilder =new HumanBuilder();
        CoachModel coachModel = new CoachModel(humanBuilder.age(50).name("Coach").surname("1").rating(5),10);
        PlayerModel players[] = createPlayers(ageTeam1,statsTeam1);
        PlayerView playerView = new PlayerView();
        PlayerController playerController = new PlayerController(players[5], playerView);
//        playerController.showPlayer();
        TeamModel team1 = new TeamModel("Team 1",players,coachModel);
        TeamView teamView = new TeamView();
        TeamController teamController = new TeamController(team1,teamView);
        teamController.setTeamRating();
        teamController.showTeam();
        //Team 2
        int[] ageTeam2 = new int[]{ 24,34,19,18,24,16,35,22,39,29,19};
        int[] statsTeam2 = new int[]{ 80,40,70,70,54,100,26,70,82,63,70,81,37,60,79,42,54,100};
        PlayerModel players2[] = createPlayers(ageTeam2,statsTeam2);
        CoachModel coachModel2 = new CoachModel(humanBuilder.age(40).name("Coach").surname("2").rating(5),5);
        TeamModel team2 = new TeamModel("Team 2",players2,coachModel2);
        TeamController teamController2 = new TeamController(team2,teamView);
        teamController2.showTeam();
        teamController2.showTeamWithPlayers(playerView);
        //Team 3
        int[] ageTeam3 = new int[]{ 24,34,19,18,24,16,35,22,39,29,19};
        int[] statsTeam3 = new int[]{ 50,60,20,100,64,80,26,30,52,73,10,51,97,80,39,42,54,20};
        PlayerModel players3[] = createPlayers(ageTeam3,statsTeam3);
        CoachModel coachModel3 = new CoachModel(humanBuilder.age(40).name("Coach").surname("3").rating(6),5);
        TeamModel team3 = new TeamModel("Team 3",players3,coachModel3);
        TeamController teamController3 = new TeamController(team3,teamView);
        teamController3.showTeam();
        //Team 4
        int[] ageTeam4 = new int[]{ 24,34,19,18,24,16,35,22,39,29,19};
        int[] statsTeam4 = new int[]{ 50,60,20,100,64,80,26,30,52,73,10,51,97,80,39,42,54,20};
        PlayerModel players4[] = createPlayers(ageTeam4,statsTeam4);
        CoachModel coachModel4 = new CoachModel(humanBuilder.age(40).name("Coach").surname("4").rating(6),5);
        TeamModel team4 = new TeamModel("Team 4",players4,coachModel4);
        TeamController teamController4 = new TeamController(team4,teamView);
        teamController4.showTeam();
        //Team 5
        int[] ageTeam5 = new int[]{ 25,35,19,18,25,16,35,22,39,29,19};
        int[] statsTeam5 = new int[]{ 100,30,70,100,35,80,86,20,72,43,30,81,17,90,79,52,65,55};
        PlayerModel players5[] = createPlayers(ageTeam5,statsTeam5);
        CoachModel coachModel5 = new CoachModel(humanBuilder.age(50).name("Coach").surname("5").rating(6),5);
        TeamModel team5 = new TeamModel("Team 5",players5,coachModel5);
        TeamController teamController5 = new TeamController(team5,teamView);
        teamController5.showTeam();
        //Team 6
        int[] ageTeam6 = new int[]{ 26,36,19,18,26,16,36,22,39,29,19};
        int[] statsTeam6 = new int[]{ 100,30,70,100,36,80,86,20,22,43,30,81,17,90,79,62,66,66};
        PlayerModel players6[] = createPlayers(ageTeam6,statsTeam6);
        CoachModel coachModel6 = new CoachModel(humanBuilder.age(60).name("Coach").surname("6").rating(6),6);
        TeamModel team6 = new TeamModel("Team 6",players6,coachModel6);
        TeamController teamController6 = new TeamController(team6,teamView);
        teamController6.showTeam();
        //Team 7
        int[] ageTeam7 = new int[]{ 27,37,19,18,27,17,37,22,39,29,19};
        int[] statsTeam7 = new int[]{ 100,30,70,100,37,80,87,20,52,43,30,81,17,90,79,72,77,77};
        PlayerModel players7[] = createPlayers(ageTeam7,statsTeam7);
        CoachModel coachModel7 = new CoachModel(humanBuilder.age(70).name("Coach").surname("7").rating(7),7);
        TeamModel team7 = new TeamModel("Team 7",players7,coachModel7);
        TeamController teamController7 = new TeamController(team7,teamView);
        teamController7.showTeam();
        //Team 8
        int[] ageTeam8 = new int[]{ 28,38,19,18,28,18,38,22,39,29,19};
        int[] statsTeam8 = new int[]{ 70,30,50,66,38,80,88,20,92,43,30,81,18,90,89,82,88,88};
        PlayerModel players8[] = createPlayers(ageTeam8,statsTeam8);
        CoachModel coachModel8 = new CoachModel(humanBuilder.age(80).name("Coach").surname("8").rating(8),8);
        TeamModel team8 = new TeamModel("Team 8",players8,coachModel8);
        TeamController teamController8 = new TeamController(team8,teamView);
        teamController8.showTeam();

            TeamModel teamModelHome[] = new TeamModel[]{team2, team4, team6, team8};
            TeamModel teamModelAway[] = new TeamModel[]{team3, team5, team7};
        TeamModel teamModelAway3[] = new TeamModel[]{team2, team5, team7};
        TeamModel teamModelHome2[] = new TeamModel[]{team1, team4, team6, team8};
        TeamModel teamModelHome4[] = new TeamModel[]{team1, team3, team6, team8};
        TeamModel teamModelAway5[] = new TeamModel[]{team2, team4, team7};
        TeamModel teamModelHome6[] = new TeamModel[]{team1, team3, team5, team8};
        TeamModel teamModelAway7[] = new TeamModel[]{team2, team4, team6};
        TeamModel teamModelHome8[] = new TeamModel[]{team1, team3, team5, team7};
        RankingController rankingControllerTeam1 = mergeToControllers(returnNumberOfPoints(team1, teamModelHome, 2), returnNumberOfPoints(team1, teamModelAway, 1));


            rankingControllerTeam1.printRanking(team1);


            RankingController rankingControllerTeam2 = mergeToControllers(returnNumberOfPoints(team2, teamModelHome2, 2), returnNumberOfPoints(team2, teamModelAway, 1));
            rankingControllerTeam2.printRanking(team2);


            RankingController rankingControllerTeam3 = mergeToControllers(returnNumberOfPoints(team3, teamModelHome2, 2), returnNumberOfPoints(team3, teamModelAway3, 1));
            rankingControllerTeam3.printRanking(team3);

            RankingController rankingControllerTeam4 = mergeToControllers(returnNumberOfPoints(team4, teamModelHome4, 2), returnNumberOfPoints(team4, teamModelAway3, 1));
            rankingControllerTeam4.printRanking(team5);

            RankingController rankingControllerTeam5 = mergeToControllers(returnNumberOfPoints(team5, teamModelHome4, 2), returnNumberOfPoints(team5, teamModelAway5, 1));
            rankingControllerTeam5.printRanking(team5);

            RankingController rankingControllerTeam6 = mergeToControllers(returnNumberOfPoints(team6, teamModelHome6, 2), returnNumberOfPoints(team6, teamModelAway5, 1));
            rankingControllerTeam6.printRanking(team6);

            RankingController rankingControllerTeam7 = mergeToControllers(returnNumberOfPoints(team7, teamModelHome6, 2), returnNumberOfPoints(team7, teamModelAway7, 1));
            rankingControllerTeam7.printRanking(team7);

            RankingController rankingControllerTeam8 = mergeToControllers(returnNumberOfPoints(team8, teamModelHome8, 2), returnNumberOfPoints(team8, teamModelAway7, 1));
            rankingControllerTeam8.printRanking(team8);
            RankingController rankingControllerArrays[] = new RankingController[]{rankingControllerTeam1, rankingControllerTeam2, rankingControllerTeam3, rankingControllerTeam4,
                    rankingControllerTeam5, rankingControllerTeam6, rankingControllerTeam7, rankingControllerTeam8};
            ChampionshipModel championshipModel = new ChampionshipModel();
            ChampionshipView championshipView = new ChampionshipView();
            ChampionshipController championshipController = new ChampionshipController(championshipModel, championshipView);
            int[] arr = new int[]{rankingControllerTeam1.rankingModel.points, rankingControllerTeam2.rankingModel.points, rankingControllerTeam3.rankingModel.points,
                    rankingControllerTeam4.rankingModel.points, rankingControllerTeam5.rankingModel.points, rankingControllerTeam6.rankingModel.points,
                    rankingControllerTeam7.rankingModel.points, rankingControllerTeam8.rankingModel.points};
            Arrays.stream(rankingControllerArrays).forEach(el -> {
                        el.printRanking();
                    }

            );
            championshipController.setPointsWinner(arr);
            championshipController.showChampionshipWinnerPoints();
        }
    }
}