package Controller;

import Model.PlayerModel;
import View.PlayerView;

public class PlayerController implements IPlayerController{
    public PlayerModel modelPlayer;
    public PlayerView viewPlayer;

    public PlayerController(PlayerModel modelPlayer, PlayerView viewPlayer) {
        this.modelPlayer = modelPlayer;
        this.viewPlayer = viewPlayer;
    }

    public PlayerModel getPlayer(){
        if(this.modelPlayer.position == 1){
            if(this.modelPlayer.technique > 60){
                this.modelPlayer.rating = this.modelPlayer.rating + 5;
            }
            else {
                this.modelPlayer.rating = this.modelPlayer.rating - 5;
            }
        }
        if(this.modelPlayer.position < 5 && this.modelPlayer.position > 1){
            if(this.modelPlayer.stamina > 60){
                this.modelPlayer.rating = this.modelPlayer.rating + 5;
            }
            else {
                this.modelPlayer.rating = this.modelPlayer.rating - 5;
            }
        }
        if(this.modelPlayer.position < 5 && this.modelPlayer.position > 1){
            if(this.modelPlayer.stamina > 60){
                this.modelPlayer.rating = this.modelPlayer.rating + 5;
            }
            else {
                this.modelPlayer.rating = this.modelPlayer.rating - 5;
            }
        }
        if(this.modelPlayer.position < 12 && this.modelPlayer.position > 8){
            if(this.modelPlayer.speed > 60){
                this.modelPlayer.rating = this.modelPlayer.rating + 5;
            }
            else {
                this.modelPlayer.rating = this.modelPlayer.rating - 5;
            }
        }
        if(this.modelPlayer.age < 27 && this.modelPlayer.age > 22){
            this.modelPlayer.rating = this.modelPlayer.rating + 5;
        }
        if(this.modelPlayer.age < 40 && this.modelPlayer.age > 36){
            this.modelPlayer.rating = this.modelPlayer.rating - 5;
        }
        return this.modelPlayer;
    }
    public void showPlayer(){
        viewPlayer.printPlayer(getPlayer());
    }
}
