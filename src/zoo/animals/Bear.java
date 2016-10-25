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
public class Bear extends Animal{
 
    
    public Bear(String gender, int legs, String sound)
    {
        super(gender, legs, sound);
        this.sound = sound;
        this.gender = gender;
        this.legs = legs;
    }
    
    @Override
    public void makeSound()
    {
        System.out.println(sound);
        
    }
   
}
