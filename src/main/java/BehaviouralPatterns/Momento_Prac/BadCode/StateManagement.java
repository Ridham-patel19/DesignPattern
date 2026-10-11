package BehaviouralPatterns.Momento_Prac.BadCode;

import java.util.Stack;

public class StateManagement {

    private Stack<String> stateOfContent;


    public StateManagement() {
        this.stateOfContent = new Stack<String>();
    }

    public void push(String content){
        stateOfContent.push(content);

    }

    public String undo(){
         if(!stateOfContent.isEmpty()){
              stateOfContent.pop();
              return stateOfContent.peek();
         }else{
             return "END!!!";
         }
    }
}
