package IMS;

public class Orders {
    public int orderId;
    private String vendorDet;
    public String orderDate;
    public String prodName;
    private int counter2;
    public int orderQuant;
    private float prodCost;

    Orders(int orderId, String vendorDet, String orderDate, String prodName, int counter2, int orderQuant, float prodCost){
        this.orderId=orderId;
        this.vendorDet=vendorDet;
        this.orderDate=orderDate;
        this.prodName=prodName;
        this.counter2=counter2;
        this.orderQuant=orderQuant;
        this.prodCost=prodCost;
    }

    private float orderBill(float prodCost){
        return prodCost;
    }
}
