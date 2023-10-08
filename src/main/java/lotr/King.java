package lotr;


import kick.KingStrategy;

public class King extends Character{


    public King() {
        super( (int) Math.random() * (11) + 5, (int) Math.random() * (11) + 5, new KingStrategy());

    }
    
}
