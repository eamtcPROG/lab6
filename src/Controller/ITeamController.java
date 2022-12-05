package Controller;

import Model.TeamModel;
import View.PlayerView;

public interface ITeamController {
    TeamModel setTeamRating();
    void showTeam();
    void showTeamWithPlayers(PlayerView playerView);
}
