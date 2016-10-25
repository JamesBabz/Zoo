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
 
    public Lion(String gender, int legs, String sound)
    {
        super(gender, legs, sound);
    }
    
    @Override
    public void makeSound()
    {
        System.out.println(sound);
    }
    
}
