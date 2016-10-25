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
public abstract class Animal {

    protected String sound;
    protected int legs;
    protected String gender;
    
    public Animal(String gender, int legs, String sound)
    {
        this.sound = sound;
        this.gender = gender;
        this.legs = legs;
    }

    public int getLegs()
    {
        return this.legs;
    }

    public String getGender()
    {
        return this.gender;
    }
    
    public abstract void makeSound();
}
