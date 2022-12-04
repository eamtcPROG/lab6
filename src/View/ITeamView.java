package View;

import Model.TeamModel;

public interface ITeamView {
    void printTeam(TeamModel team);
    void printTeam(TeamModel team,PlayerView playerView);
    void printTeamName(TeamModel team);
}
