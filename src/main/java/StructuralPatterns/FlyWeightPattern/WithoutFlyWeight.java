package StructuralPatterns.FlyWeightPattern;


class Bullet{

    //this is excentric property it going to be diff diff for al object
    private int x;
    private int y;
    private int velocity;

    // this is incentric property so it going to be same for all bullet object
    private String color;


    public Bullet(int x, int y, String color, int velocity) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.velocity = velocity;
    }

    public void display(){
        System.out.println("Displaying bullet on cordinate " + x + "," + y + "with velocity of " + velocity +
        "and color is " + color);
    }
}
public class WithoutFlyWeight {
    public static void main(String[] args) {

        //here we are creating 5 red color bullet
          for(int i = 0 ; i < 5 ; i++){
              Bullet b = new Bullet(i*10 , i*12 , "red" , 4);
              b.display();
          }

        //here we are creating 5 green color bullet
        for(int i = 0 ; i < 5 ; i++){
            Bullet b = new Bullet(i*10 , i*12 , "green" , 4);
            b.display();
        }
    }

    // you will see that 5 bullet has same color and other 5 has also have same color so
    //every time we are loaading green and resd so more memory is wasted here
}
