package BehaviouralPatterns.Momento_Prac.BadCode;

public class MomentoMain {
    public static void main (String[] args){
//        System.out.println("Hello");

        // now this is a wrong way this isnot following momento patter
        //moment mean storing  states or  storing moment so here text editor work is is only to store first content
        //then  evrything is done by managestatement class right
        //also here this statemanagement class knows internal state of a text editor whioch violate encapsulation
        //this is a bad practice
        TextEditor text = new TextEditor("HEllo world");
        text.setContent("hy");
        text.setContent("Why");


        System.out.println(text.getContent());

        System.out.println(text.manage.undo());
        System.out.println(text.manage.undo());

    }
}
