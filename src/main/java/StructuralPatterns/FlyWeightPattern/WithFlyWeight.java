package StructuralPatterns.FlyWeightPattern;


import java.util.HashMap;

class Bullet1{

    //this is excentric property it going to be diff diff for al object
    private int x;
    private int y;
    private int velocity;
    private BulletType color;

    public Bullet1(int x, int y, int velocity , String color) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.color = BulletTypefactory.getBulletType(color);
    }

    public void display(){
        System.out.println("Displaying bullet on cordinate " + x + "," + y + "with velocity of " + velocity +
                "and color is " + color.getColor());
    }
}


class BulletType{
    // this is incentric property so it going to be same for all bullet object
    private String color;

    public String getColor() {
        return color;
    }

    public BulletType(String color) {
        this.color = color;
        System.out.println("Color loaded in memmory ");
    }
}

class BulletTypefactory{
    private static final HashMap<String , BulletType> hm = new HashMap<>();

    public static BulletType getBulletType(String color){
        BulletType b;
        if(!hm.containsKey(color)){
             b = new BulletType(color);
            hm.put(color , b);
        }
        b = hm.get(color);

        return b;
    }
}
public class WithFlyWeight {
    public static void main(String[] args) {

        //here we are creating 5 red color bullet
        for(int i = 0 ; i < 5 ; i++){
            Bullet1 b = new Bullet1(i*10 , i*12 , 4 , "red");
            b.display();
        }

        //here we are creating 5 green color bullet
        for(int i = 0 ; i < 5 ; i++){
            Bullet1 b = new Bullet1(i*10 , i*12 , 4 , "green");
            b.display();
        }
    }

   //now you can see that we havenot chnaged anything in client and we are loading color only one time for
    // all other color and then accrding to color object using same color
}
