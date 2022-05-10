package IMS;
import IMS.Contact;
import IMS.Address;

public class Vendors {
    public String vendor;
    public String company;
    private String[] totalProd;
    public String prodDet;
    private float credit;
    private float totalCost;

    Vendors(String vendor, String company, float credit, String[] totalProd, String prodDet){
        this.vendor=vendor;
        this.company=company;
        this.credit=credit;
        this.totalProd=totalProd;
        this.prodDet=prodDet;
    }

    private float getCredit(float totalCost){
        return credit;
    }
}
