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

    List<Animal> animals = new ArrayList<>();

    ;

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

    void getNumberOfGender()
    {
        int males = 0;
        int females = 0;
        int unknown = 0;

        for (int i = 0; i < animals.size(); i++)
        {
            if ("male".equals(animals.get(i).getGender()))
            {
                males++;
            }
            else if ("female".equals(animals.get(i).getGender()))
            {
                females++;
            }
            else
            {
                unknown++;
            }
        }
        System.out.println("There are " + males + " males, " + females + " females and " + unknown + " unknown/haven't decided for themselves yet");
    }

    void getNumberOfGender(String gender)
    {
        int genderAmount = 0;

        for (int i = 0; i < animals.size(); i++)
        {
           if (gender.equals(animals.get(i).getGender()))
            {
                genderAmount++;
            }
        }
        System.out.println("There are " + genderAmount + " " + gender + " animals in the zoo");
    }

}
