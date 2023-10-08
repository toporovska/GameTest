package kick;

import lotr.Character;

public class KingStrategy implements KickStrategy {

    @Override
    public void kick(Character character, Character opponent) {
        opponent.setHp(opponent.getHp() - character.getPower());
    }
    
}
