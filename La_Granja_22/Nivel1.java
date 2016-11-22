import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        inicia(); 
    }
    void inicia()
    {
    Granjero j1 = new Granjero();
    addObject(j1,200,200);
    Bicho1 b1 = new Bicho1();
    addObject(b1,300,300);
    }
    
    
}
