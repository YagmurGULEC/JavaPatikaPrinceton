
import java.util.Scanner;
import Player.Player;
public class Game{
    private Player player;
    public void  start(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the name of player");
            String playerName=input.nextLine();
            PlayerFactory playerCreator=new PlayerFactory();
            player=playerCreator.createPlayer(playerName);
            System.out.println("Player derived class: "+ player.getClass().getName()+"\t Main player class: "+ player.getClass().getSuperclass().getName());
        }
        
        
    }

}