package BehaviouralPatterns.CommandPattern;


class TextEditor{
    public void ChangeColor(){
        System.out.println("Changing color");
    }

    public void MakeBold(){
        System.out.println("Changing to bold");
    }

    public void MakeItalic(){
        System.out.println("Changing to itaalic");
    }

    public void OnlyUppercase(){
        System.out.println("Changing color");
    }
}

class Button{
   private TextEditor editor;

    public Button(TextEditor editor) {
        this.editor = editor;
    }

    public void click(String commmand) {
        if(commmand == "MakeBold"){
            editor.MakeBold();
        }else if(commmand == "OnlyUpperCase"){
            editor.OnlyUppercase();
        }else if(commmand == "ChangeColor"){
            editor.ChangeColor();
        }
    }
}
public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Button btn = new Button(editor);

        btn.click("ChangeColor");
        btn.click("MakeBold");
    }
}


//now you can see that btn know about all action in editor class and its
//tightly coupled with editor class now in future if this btn has to perform anything ewlse from
//another class it has to change which wrong and not good pattern