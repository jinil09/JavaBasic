class Product{
    String name;
    double price;
    int quntity;
    static int totalSold=0;

    public void sell(int quntity){
        totalSold=totalSold+quntity;
    }

    public void RInfo(){
        System.out.println("Product name is : "+name);
        System.out.println("Total earn : "+(totalSold*price));
        System.out.println("Remains Quntity : "+(quntity-totalSold));
    }
    public static void getTotalSold(){
        // return totalSold;
        System.out.println("Total sold is :"+totalSold);
    }

}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name="Mobile";
        p1.price=15000;
        p1.quntity=15;

        p1.sell(5);
        p1.sell(3);
        p1.getTotalSold();
        p1.RInfo();
    }
    
}
