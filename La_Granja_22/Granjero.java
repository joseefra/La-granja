import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Granjero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granjero extends Actor
{
    /**
     * Act - do whatever the Granjero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movimientos();
    }
    public void  movimientos()
    {
       //mueve a el granjero para la derecha
        if(Greenfoot.isKeyDown("right"))
        {
            
            setRotation(0);
            move(3);
           
        }
      //  Disparar(); 
        //mueve a el granjero para la izquierda
        if(Greenfoot.isKeyDown("left"))
        {
           setRotation(-0);
            move(-3);
           
        }
         //mover para arriba a el granjero del usuario
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(-90);
            move(3);
           
        }
         //mover el granjero del usuario a hacia abajo      
        if(Greenfoot.isKeyDown("down"))
        {
          setRotation(90);
            move(3);  
        }  
    }
}
