package BehaviouralPatterns.Momento_Prac.GoodCode;

public class TextEditor {
    //here we are practicing momento design and we have to create unddo redo design

    private String content;


    public TextEditor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public void write(String content){
        this.content = content;
    }
    public MomentoState save(){
        return new MomentoState(content);
    }

    public void restore(MomentoState state){
         this.content = state.getContent();
    }
}
