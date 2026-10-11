package CreationalPattern.AbstarctFactoryPattern;

interface Btn{
    void click();
}

interface Scroll{
    void Scrolling();
}
class WinBtn1 implements Btn{
    public void click(){
        System.out.println("rendering win btn");
    }
}

class WinScrollBar1 implements Scroll{
    public void Scrolling(){
        System.out.println("Scrolling win ");
    }
}

class MacBtn1 implements Btn{
    public void click(){
        System.out.println("rendering Mac btn");
    }
}

class MacScrollBar1 implements Scroll{
    public void Scrolling(){
        System.out.println("Scrolling Mac ");
    }
}

interface UIComposnent{
    Btn returnBtn();
    Scroll returnScroll();
}

class Win implements UIComposnent{

    @Override
    public Btn returnBtn() {
        return new WinBtn1();
    }

    @Override
    public Scroll returnScroll() {
        return new WinScrollBar1();
    }
}


class Mac implements UIComposnent{

    @Override
    public Btn returnBtn() {
        return new MacBtn1();
    }

    @Override
    public Scroll returnScroll() {
        return new MacScrollBar1();
    }
}

class App{
    private UIComposnent currentUI;


    public App(CreationalPattern.AbstarctFactoryPattern.UIComposnent currentUI) {
        this.currentUI = currentUI;
    }


    public void setCurrentUI(UIComposnent currentUI) {
        this.currentUI = currentUI;
    }

    void run(){
        Btn btn = currentUI.returnBtn();
        Scroll scroll = currentUI.returnScroll();
        scroll.Scrolling();
        btn.click();

    }
}
public class WithAbstractFactory {

    public static void main(String[] args) {
       UIComposnent win = new Win();

       App app = new App(win);
    app.setCurrentUI(new Mac());
       app.run();

    }
}

//AbstarctFactory pattern  helps us to cretae family of objecs
//as you can see that in Win there lot of  components and same in Mac

// now client doesnot know anything its justt pass that which Os it needs to appp and app returns that