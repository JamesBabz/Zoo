/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.List;
import zoo.animals.*;

/**
 *
 * @author James
 */
public class Zoo {
    List<Animal> animals = new ArrayList<>();;

    void add(Animal animal)
    {
        animals.add(animal);
    }

    void allAnimalsMakeSound()
    {
        for (int i = 0; i < animals.size(); i++)
        {
            animals.get(i).makeSound();
        }
    }

    void countLegs()
    {
        int legs = 0;
        for (int i = 0; i < animals.size(); i++)
        {
            legs = legs + animals.get(i).getLegs();
        }
        System.out.println("Numbers of legs: " + legs);
    }

    
}
