package StructuralPatterns.ProxyPattern;



interface Image1{
    void Display();
}

class RealImage1 implements Image1{
    private String fileName;


    public RealImage1(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    public void loadImage(){
        System.out.println("image is loading ");
    }
    @Override
    public void Display() {
        System.out.println("Image : " + fileName);
    }
}

class ProxyImage implements Image{
    private String fileName;
    private RealImage1 img;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void Display(){
    if(img != null){
        img.Display();
    }else {
        img = new RealImage1(fileName);
        img.Display();
    }

    }
}

public class WithProxyPattern {
    public static void main(String[] args) {
    Image img = new ProxyImage("hello");

    img.Display();
    }
}
