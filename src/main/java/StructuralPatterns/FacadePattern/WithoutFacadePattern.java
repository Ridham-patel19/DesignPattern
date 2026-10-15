package StructuralPatterns.FacadePattern;


class OrderService{
    private int orderId;

    public OrderService(int orderId) {
        this.orderId = orderId;


    }

    public void getOrderDetail(){
        System.out.println("Your order detail " + orderId);
    }
}

class PaymentService{
    private int paymentId;

    public PaymentService(int orderId) {
        this.paymentId = orderId;


    }

    public void getOrderDetail(){
        System.out.println("Your payment detail " + paymentId);
    }
}

class UserService{
    private int userId;

    public UserService(int userId) {
        this.userId = userId;


    }

    public void getUserDetail(){
        System.out.println("Your user detail " + userId);
    }
}
public class WithoutFacadePattern {
    public static void main(String[] args) {

        UserService user = new UserService(1);
        OrderService order = new OrderService(12);
        PaymentService pay = new PaymentService(123);

        user.getUserDetail();
        order.getOrderDetail();
        pay.getOrderDetail();
    }
}

// now you can see that here client is calling 3 service but
//it has to call all by it self also it konw all implementation
