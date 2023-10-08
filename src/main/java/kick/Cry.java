package kick;
import java.lang.Character;

public class Cry implements KickStrategy {

    @Override
    public void kick(lotr.Character character, lotr.Character opponent) {
        System.out.println("😢😢😢");
    }
    
}
