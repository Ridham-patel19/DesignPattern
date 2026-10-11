
package BehaviouralPatterns.StatePattern;

/*
 * State Pattern vs Strategy Pattern:
 *
 * State Pattern: An object's behavior changes according to
 * its current state.
 *
 * Strategy Pattern: We choose an algorithm to perform a task
 * differently according to our requirements.
 *
 * Here, the order behaves differently depending on whether
 * it is Pending, Paid, or Cancelled.
 */

interface StateType {
    void getDetail();
}

class Pending implements StateType {

    @Override
    public void getDetail() {
        System.out.println(
                "Order is Pending. Redirecting to Payment Page."
        );
    }
}

class Cancelled implements StateType {

    @Override
    public void getDetail() {
        System.out.println(
                "Order is Cancelled. Redirecting to Buy Again."
        );
    }
}

class Paid implements StateType {

    @Override
    public void getDetail() {
        System.out.println(
                "Order is Paid. Redirecting to Product Tracking Page."
        );
    }
}

class ManageState1 {

    private StateType state;

    public ManageState1(StateType state) {
        this.state = state;
    }

    public void setState(StateType state) {
        this.state = state;
    }

    public void getOrderDetail() {
        state.getDetail();
    }
}

public class WithStatePattern {

    public static void main(String[] args) {

        ManageState1 currentState =
                new ManageState1(new Pending());

        currentState.getOrderDetail();

        currentState.setState(new Paid());
        currentState.getOrderDetail();

        currentState.setState(new Cancelled());
        currentState.getOrderDetail();
    }
}

/*
 * Understanding:
 *
 * The output changes according to the current state of the order.
 *
 * 1. Pending:
 *    The order is awaiting payment, so the user is redirected
 *    to the Payment Page.
 *
 * 2. Paid:
 *    The payment is completed, so the user is redirected
 *    to the Product Tracking Page.
 *
 * 3. Cancelled:
 *    The order is cancelled, so the user is redirected
 *    to the Buy Again page.
 *
 * We can add new states by creating new classes that implement
 * StateType, without adding more if-else conditions to ManageState1.
 */

//
//3. But here is the important design decision
//You suggested writing an if condition inside the manager to check whether cancellation is allowed.
//For example:
//        if (state.getStatus() == OrderStatus.DELIVERED) {
//        throw new IllegalStateException(
//        "Delivered orders cannot be cancelled"
//);
//}
//
//
//This works. It is not incorrect code.
//        However, if you add conditions for every possible transition, your manager may eventually look like this:
//        if (currentStatus == OrderStatus.PENDING) {
//        // Allow payment
//        // Allow cancellation
//        }
//        else if (currentStatus == OrderStatus.PAID) {
//        // Allow delivery
//        // Allow cancellation
//        }
//        else if (currentStatus == OrderStatus.DELIVERED) {
//        // Reject cancellation
//        }
//
//
//As you add more states and business rules, the manager becomes responsible for all the state-specific behavior again.
//That is precisely where the State Pattern can help.
//4. A better implementation using the State Pattern
//Instead of making the manager understand every state's rules, let each state decide which transitions it allows.
//OrderState.java
//interface OrderState {
//
//    OrderStatus getStatus();
//
//    void pay(ManageState1 order);
//
//    void deliver(ManageState1 order);
//
//    void cancel(ManageState1 order);
//}