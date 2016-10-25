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
        z.add(new Elephant("male",4,"Elephant sound!!!"));
        z.add(new Bear("female",4,"Grrrr"));
        
        z.allAnimalsMakeSound();
        z.countLegs();
    }
    
}
