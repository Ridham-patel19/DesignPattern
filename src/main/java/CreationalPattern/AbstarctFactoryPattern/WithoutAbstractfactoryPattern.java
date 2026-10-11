package CreationalPattern.AbstarctFactoryPattern;

class WinBtn{
    public void render(){
        System.out.println("rendering win btn");
    }
}

class WinScrollBar{
    public void Scrolling(){
        System.out.println("Scrolling win btn");
    }
}

class MacBtn{
    public void render(){
        System.out.println("rendering Mac btn");
    }
}

class MacScrollBar{
    public void Scrolling(){
        System.out.println("Scrolling Mac btn");
    }
}

public class WithoutAbstractfactoryPattern {
    public static void main(String[] args) {
        //win Ui
        WinBtn btn = new WinBtn();
        btn.render();
        MacScrollBar scroll = new MacScrollBar();
        scroll.Scrolling();

        //here client is tightly coupled with all composnent
        //and now user can have win btn and mac scroll and its wrong

    }
}
