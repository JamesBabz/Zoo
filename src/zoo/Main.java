/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import zoo.animals.*;

/**
 *
 * @author James
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Zoo z = new Zoo();
        z.add(new Lion("male",4,"Roar"));
        z.add(new Lion("female",4,"Meow"));
        z.add(new Elephant("male",4,"Elephant sound!!!"));
        z.add(new Elephant("female",4,"Sad trumphet sound!!!"));
        z.add(new Bear("male",4,"Grrrr"));
        z.add(new Bear("female",4,"Grrrrish!!"));
        
        z.allAnimalsMakeSound();
        z.countLegs();
        z.getNumberOfGender("male");
        z.getNumberOfGender();
    }
    
}
