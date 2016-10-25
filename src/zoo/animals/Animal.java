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

    private String sound;
    private int legs;
    private String gender;

    public abstract int getLegs();
    public abstract void makeSound();
}
