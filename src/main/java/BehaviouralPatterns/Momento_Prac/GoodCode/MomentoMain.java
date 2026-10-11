package BehaviouralPatterns.Momento_Prac.GoodCode;

public class MomentoMain {
    public static void main (String[] args){
          TextEditor text = new TextEditor("A");

          StateManagement manage = new StateManagement();

          manage.saveState(text);


          text.write("b");
        manage.saveState(text);

          text.write("C");
        manage.saveState(text);

        System.out.println(text.getContent());

        manage.undo(text);

        System.out.println(text.getContent());
    }
}
