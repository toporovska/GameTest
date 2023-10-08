import lotr.Hobbit;
import lotr.Elf;
import lotr.King;
import lotr.Knight;
import lotr.Character;
import kick.KickStrategy;
import kick.KingStrategy;

import javax.sound.midi.Track;

import kick.Cry;
import kick.ElfStrategy;

public class GameManager {
    public void Fiting(Character c1, Character c2){
        while (c1.isAlive() == true && c2.isAlive() == true) {
            if (c1 instanceof Hobbit || c2 instanceof Hobbit){
                System.out.println("Hobbits are peaceful creatures and do not participate in battles");
                if (c1 instanceof Hobbit) 
                {c1.kick(c2);}
                else
                    {c2.kick(c1);}
                System.out.println(" You upset the Hobbit");  
                break;
            }

            c1.kick(c2);
            System.out.println("Character 1: " + c1.toString());
            System.out.println("Character 2: " + c2.toString());
            c2.kick(c1);
            System.out.println("Character 1: " + c1.toString());
            System.out.println("Character 2: " + c2.toString());
        }
        if (c1.isAlive() == (boolean) true && c2.isAlive() == (boolean) true){
            System.out.println("The hobbits do not engage in battle, so all are alive and unharmed"); 
        }
        else if (c1.isAlive() == (boolean) true){
            System.out.println("The first character won the game"); 
        }
         else if (c2.isAlive() == (boolean) true){
            System.out.println("The second character won the game"); 
        }
        else{
            System.out.println("No one survived this battle"); 
        }
    }
}
