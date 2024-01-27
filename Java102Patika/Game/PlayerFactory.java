import Player.*;
public class PlayerFactory {
    public Player createPlayer(String playerName)
    {
        if (playerName.equalsIgnoreCase("samurai"))
        return new Samurai();
        else
        throw new IllegalArgumentException("An invalid type");
    }
    
}
