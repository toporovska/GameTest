package lotr;

import kick.KingStrategy;

public class Knight extends Character {

    public Knight() {
        super( (int) Math.random() * (11) + 2, (int) Math.random() * (11) + 2, new KingStrategy());
    }
    
}
