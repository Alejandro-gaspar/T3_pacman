import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new pared(),176,124);
        addObject(new pared(),176,175);
        addObject(new pared(),176,224);
        addObject(new pared(),326,24);
        addObject(new pared(),326,74);
        addObject(new pared(),376,24);
        addObject(new pared(),426,24);
        addObject(new pared(),329,224);
        addObject(new pared(),379,224);
        addObject(new pared(),429,224);
        addObject(new pared(),479,224);
        addObject(new pared(),329,274);
        addObject(new pared(),574,373);
        addObject(new pared(),524,373);
        addObject(new pared(),574,323);
        addObject(new pared(),27,226);
        addObject(new pared(),27,276);
        addObject(new pared(),27,326);
        addObject(new pared(),27,376);
        addObject(new pared(),77,376);

        addObject(new pacman(),176,74);
        point_1 point_1 = new point_1();
        addObject(point_1,224,274);
        point_2 point_2 = new point_2();
        addObject(point_2,372,376);
        point_3 point_3 = new point_3();
        addObject(point_3,476,124);
        point_0 point_0 = new point_0();
        addObject(point_0,75,128);
        point_3 point_32 = new point_3();
        addObject(point_32,79,75);
        point_2 point_22 = new point_2();
        addObject(point_22,127,274);
        point_1 point_12 = new point_1();
        addObject(point_12,227,129);
        point_1 point_13 = new point_1();
        addObject(point_13,224,380);
        
       
    }
}