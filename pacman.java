import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pacman extends Actor
{
    private static final int COUNT_OB=20;
    private int mouthDelay=COUNT_OB;
    private static final int DIRECTION=0;
    private static final int DIRECTIONLEFT=1;
    private static final int DIRECTIONUNDER=2;
    private static final int DIRECTIONUP=3;
    private String [][]images;
    private int imageIndex;
    private int direction=DIRECTION;
    private static final int OFFSET=1;
    private int score= 0;
    private int a,b;
     public pacman()
    {
        imagescollection();
        setImage(images[DIRECTION][0]);
    }
    private void imagescollection(){
        images=new String[4][];
        images[DIRECTION]=new String []{
            "images/pacman-open.png","images/pacman-close.png"
        };
        images[DIRECTIONLEFT]=new String []{
            "images/pacman-open-left.png","images/pacman-close-left.png"
        };
        images[DIRECTIONUNDER]=new String []{
            "images/pacman-open-down.png","images/pacman-close-down.png"
        };
        images[DIRECTIONUP]=new String []{
            "images/pacman-open-up.png","images/pacman-close-up.png"
        };
    }
    public void act()
    {
        movePacman();
        handLekeys();
        imageSelect();
        checkdots();
        update();
        stoppared();
       
    }
    private void handLekeys(){
        if(Greenfoot.isKeyDown("left")){
            direction=DIRECTIONLEFT;
        }else if(Greenfoot.isKeyDown("right")){
            direction=DIRECTION;
        }else if(Greenfoot.isKeyDown("up")){
            direction=DIRECTIONUP;
        } else if(Greenfoot.isKeyDown("down")){
            direction=DIRECTIONUNDER;
        }
    }
    private void imageSelect(){
        mouthDelay--;
       if (mouthDelay ==0){
           imageIndex=(imageIndex+1)%images[direction].length;
           setImage(images[direction][imageIndex]);
           mouthDelay=COUNT_OB;
       }
    }
    public void stoppared(){
        if(getOneIntersectingObject(pared.class)!=null){
            setLocation(a,b);
        }else{
            a = getX();
            b = getY();
        }
    }
    private void movePacman(){
        switch(direction)
        {
        case DIRECTION:
            setLocation(getX()+OFFSET,getY());
        break;
        case DIRECTIONLEFT:
            setLocation(getX()-OFFSET,getY());
        break;
        case DIRECTIONUNDER:
            setLocation(getX(),getY()+OFFSET);
        break;
        case DIRECTIONUP:
            setLocation(getX(),getY()-OFFSET);
        break;
        }
    }
    private void update(){
         World world = getWorld();
     world.showText("Score:"+score , world.getWidth()-50, 10);
    }
    private void checkdots(){
    item  Item = (item)this.getOneIntersectingObject(item.class);
    if(Item != null){
        score += Item.getPoints();
        this.getWorld().removeObject(Item);
    }
    }
}
