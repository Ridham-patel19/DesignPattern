package BehaviouralPatterns.StatePattern;


 enum State{
    PENDING ,
     PAID ,
     SHIPPED,
     CANCELED
}



class ManageState{
     private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void getDetail(){
       switch (state){
           case PAID -> System.out.println("Its been paid you are redirecting to tarcking page  ");
           case PENDING -> System.out.println("Its pending you are redirecting to payment ");
           case CANCELED -> System.out.println("Its camcelled you are redirecting to buy again section  ");
           case SHIPPED -> System.out.println("Its Shipped you are redirected to tracking ");
       }
    }


}
public class WithoutStatePattern {
    public static void main(String[] args) {
       ManageState state = new ManageState();

       state.setState(State.PENDING);
       state.getDetail();
    }
}
