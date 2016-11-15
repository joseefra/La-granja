import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.image.*;
/**
 * Write a description of class Granjero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granjero extends Actor
  { 
private GreenfootImage image1= new GreenfootImage("jugador3.png");//dere
private GreenfootImage image2= new GreenfootImage("jugador2.png");//Izqui 
private GreenfootImage image3= new GreenfootImage("jugador1.png");
private GreenfootImage image4= new GreenfootImage("jugador4.png");

private GreenfootImage image5= new GreenfootImage("jugador7.png");//derecha
private GreenfootImage image6= new GreenfootImage("jugador6.png");//izquierda   
private GreenfootImage image7= new GreenfootImage("jugador8.png");//arriba
private GreenfootImage image8= new GreenfootImage("jugador5.png");//abajo


   public int direccion;
   private int activado = 0;
   private int speed = 5 ;
   public int i;

    /**
     * Act - do whatever the Granjero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(activado == 0)
        {
        movimientos();
         }
    }
    public void  movimientos()
    {
       //mueve a el granjero para la derecha
        if(Greenfoot.isKeyDown("right"))
        {
            
           direccion = 1;                                  //1 Derecha
            this.setLocation(this.getX()+speed,this.getY());
            setImage(image1);
            i++;
            if(i%2 == 0)
               setImage(image5);
            
           
        }
     
        //mueve a el granjero para la izquierda
        if(Greenfoot.isKeyDown("left"))
        {
          direccion = 2;                                  //2 Izquierda
            this.setLocation(this.getX()-speed,this.getY());
            setImage(image2);
            i++;
            if(i%2 == 0)
               setImage(image6);
             
        }
         //mover para arriba a el granjero del usuario
        if(Greenfoot.isKeyDown("up"))
        {
            direccion = 3;                                 
             this.setLocation(this.getX(),this.getY()-speed);
            setImage(image4);
            i++;
            if(i%2 == 0)
               setImage(image7);
           
        }
         //mover el granjero del usuario a hacia abajo      
        if(Greenfoot.isKeyDown("down"))
        {
         direccion = 4;                                 
            this.setLocation(this.getX(),this.getY()+speed);
            setImage(image3);
            i++;
            if(i%2 == 0)
               setImage(image8);
              
        }  
    }
}
