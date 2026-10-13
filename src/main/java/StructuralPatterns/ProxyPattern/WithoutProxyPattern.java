package StructuralPatterns.ProxyPattern;


interface Image{
    void Display();
}

class RealImage implements Image{
    private String fileName;


    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

 private void loadImage(){
     System.out.println("image is loading ");
 }
    @Override
    public void Display() {
        System.out.println("Image : " + fileName);
    }
}


public class WithoutProxyPattern {
    public static void main(String[] args) {
       Image img = new RealImage("hello");
       Image img2 = new RealImage("hello2");


       //now you can have idea like why we are using loadimage() in constructer
        //we can use it in Display() right but now you can see tat we have called display for
        //same obj for 2 time now for both it will load image so its repatation
        //so that is wrong java.nio.file.StandardOpenOption
       img.Display();
       img.Display();
       img2.Display();
    }
}
