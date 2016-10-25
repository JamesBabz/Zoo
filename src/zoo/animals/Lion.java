/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.animals;

/**
 *
 * @author James
 */
public class Lion extends Animal {
 
    private String sound;
    private int legs;
    private String gender;

    public Lion(String gender, int legs, String sound)
    {
        this.sound = sound;
        this.gender = gender;
        this.legs = legs;
    }

    
    
    @Override
    public void makeSound()
    {
        System.out.println(sound);
    }

    @Override
    public int getLegs()
    {
        return this.legs;
    }

   
}
