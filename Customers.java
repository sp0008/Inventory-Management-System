package IMS;

public class Customers {
    private String user;
    private String pwd;
    private String userId;
    private int orders;
    private int counter;
    private static int orderCount = 0;
    private static float discount;
    private String[] prods;

    Customers(String user, String pwd, String userId, int orders, int counter, int orderCount, float discount) {
        this.user = user;
        this.pwd = pwd;
        this.userId = userId;
        this.orders = orders;
        this.counter = counter;
        this.orderCount = orderCount;
        this.discount = discount;
    }

    public void discount(int orderCount){
            if(orderCount>=15){
                discount=0.1f;
            }
            else{
                discount=0.05f;
            }
    }


    private int getOrders(String[] prods, int orderCount){
        return orderCount;
    }

    private float getDiscount(int orderCount){
            return discount;
    }
}


