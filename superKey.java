class person{
    String name;
    String brand;

    person(String brand){
        this.brand=brand;
        System.out.println("Heello This iss Controctorrr : "+brand);
    }

    public void person1(String pname){
        this.name=pname;
    }

    public void Display(){
        System.out.println("The Brand is : "+name);
    }
}


class manager extends person{

    manager(String brand){
        super(brand);
        System.out.println("Hello THis is call using Manager Constructor");
    }
    public void disSuper() {
        
        super.Display();
    }
}


public class superKey {
    public static void main(String[] args) {
        manager m1=new manager("Jinil");
        // m1.person1("Jinil");
        // m1.disSuper();
    }
}
