package IMS;

public class Products {
    public String[] prods;
    private int prodQuant;
    public long prodID;
    public String prodName;
    public float salesPrice;
    private float costPrice;
    public boolean prodActive;
    private int threshold;
    public String prod;

    Products(String prod, int prodQuant, long prodID, String prodName, float salesPrice, float costPrice, boolean prodActive, int threshold){
        this.prod=prod;
        this.prodQuant = prodQuant;
        this.prodID = prodID;
        this.prodName=prodName;
        this.salesPrice=salesPrice;
        this.costPrice=costPrice;
        this.prodActive=prodActive;
        this.threshold=threshold;
    }

    private float getProfit(float salesPrice,float costPrice){
    return salesPrice-costPrice;
    }

    public boolean prodStatus(int threshold){
        if(threshold>100){
            return prodActive=true;
        }
        else{
            return prodActive=false;
        }
    }


}
