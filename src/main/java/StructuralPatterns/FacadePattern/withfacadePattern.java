package StructuralPatterns.FacadePattern;



class OrderService1{
    private int orderId;

    public OrderService1(int orderId) {
        this.orderId = orderId;


    }

    public void getOrderDetail(){
        System.out.println("Your order detail " + orderId);
    }
}

class PaymentService1{
    private int paymentId;

    public PaymentService1(int orderId) {
        this.paymentId = orderId;


    }

    public void getOrderDetail(){
        System.out.println("Your payment detail " + paymentId);
    }
}

class UserService1{
    private int userId;

    public UserService1(int userId) {
        this.userId = userId;


    }

    public void getUserDetail(){
        System.out.println("Your user detail " + userId);
    }
}

class ApiGateway{
    private UserService1 user  ;
    private OrderService1 order;
    private PaymentService1 pay;


    public void getWholeOrderDetail(int userid , int orderid , int paymentid){
        user = new UserService1(userid);
        pay = new PaymentService1(paymentid);
        order = new OrderService1(orderid);

        user.getUserDetail();
        order.getOrderDetail();
        pay.getOrderDetail();
    }

}

public class withfacadePattern

{
    public static void main(String[] args) {
        ApiGateway gateWay = new ApiGateway();

        gateWay.getWholeOrderDetail(1 , 12 , 123);

        //as you can see that now client doesnot have to call everything independently also it doesnot have to
        //know likw what is implemetated
        //also now we can chnage anything in services and client doesnot care cuz it using Apigateway

    }
}
