package BehaviouralPatterns.Momento_Prac.GoodCode;

import java.util.Stack;

public class StateManagement {

    private Stack<MomentoState> stateOfContent;


    public StateManagement() {
        this.stateOfContent = new Stack<MomentoState>();
    }

    public void saveState(TextEditor editor){
        stateOfContent.push(editor.save());
    }

    public  void undo(TextEditor editor){
        if(!stateOfContent.isEmpty()){
            stateOfContent.pop();
            editor.restore(stateOfContent.peek());
        }
    }
}
