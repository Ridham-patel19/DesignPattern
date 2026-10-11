package BehaviouralPatterns.CommandPattern;

 interface Command {
     void execute();
}

class TextEditor1 {
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
        System.out.println("Changing to Upper Case");
    }
}


class BoldCommand implements Command{
     private TextEditor1 editor;

    public BoldCommand(TextEditor1 editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.MakeBold();
    }
}


class ItalicCommand implements Command{
    private TextEditor1 editor;

    public ItalicCommand(TextEditor1 editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.MakeItalic();
    }
}


class ChangeColorCommand implements Command{
    private TextEditor1 editor;

    public ChangeColorCommand(TextEditor1 editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.ChangeColor();
    }
}


class OnlyUpperCaseCommand implements Command{
    private TextEditor1 editor;

    public OnlyUpperCaseCommand(TextEditor1 editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.OnlyUppercase();
    }
}

class Button1 {
    private Command command;


    public void Command(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}



public class WithCommandPattern
{
    public static void main(String[] args) {
        TextEditor1 editor = new TextEditor1();
        Button1 btn = new Button1();

        btn.Command(new BoldCommand(editor));
        btn.click();
        btn.Command(new OnlyUpperCaseCommand(editor));
        btn.click();
    }
}


//here you can seee btn doesnot know about editor class at all its just know it has to
// perform specific command adn all thos class are actully performing action