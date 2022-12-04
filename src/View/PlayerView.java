package View;

import Model.PlayerModel;

public class PlayerView implements IPlayerView{
    @Override
    public void printPlayer(PlayerModel player) {
        System.out.println("-----------------------------");
        System.out.println("Player name: " + player.name);
        System.out.println("Player surname: " + player.surname);
        System.out.println("Player age: " + player.age);
        System.out.println("Player position: " + player.position);
        System.out.println("Player rating: " + player.rating);
        System.out.println("------------- Speed: " + player.speed);
        System.out.println("------------- Stamina: " + player.stamina);
        System.out.println("------------- Technique: " + player.technique);
        System.out.println("-----------------------------");
    }
}
