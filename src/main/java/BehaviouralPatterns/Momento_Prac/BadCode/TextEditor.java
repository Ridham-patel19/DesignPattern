package BehaviouralPatterns.Momento_Prac.BadCode;

public class TextEditor {
    //here we are practicing momento design and we have to create unddo redo design

    private String content;
    StateManagement manage = new StateManagement();


    public TextEditor(String content) {
        this.content = content;

        manage.push(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        manage.push(content);
    }
//now  to implement we  can  use  stack but we donont have to do that in this class its collide with our
    //single responsibility principle cuz this is state management for this content so we will create new class for it
}
