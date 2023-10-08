package kick;
import java.lang.Character;

public class ElfStrategy implements KickStrategy {

    @Override
    public void kick(lotr.Character character, lotr.Character opponent) {
        int elfPower = character.getPower();
        if (elfPower > opponent.getPower()) {
            opponent.setHp(0);}
        else{
            character.setPower(elfPower - 1);
        }
    }
}
