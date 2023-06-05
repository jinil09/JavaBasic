abstract class Animal{

    String name;
    int age;
    public abstract void makeSound(String name, int age);

    public void sheep(){
        System.out.println("OHH I am ship");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(String name, int age){
        System.out.println("Hello I am Dog");
        System.out.println("My name is : "+name+ "& My age is : "+age);
    }
}

class Cow extends Animal{
    @Override
    public void makeSound(String name, int age){
        System.out.println("Hello I am Cow");
        System.out.println("My name is : "+name+ " & My age is : "+age);
    }
}

public class AbstarctDemo {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.makeSound("Tommy",06);
        
        Cow c= new Cow();
        c.makeSound("Cow1", 10);
    }
}


//We can Use coman method for multiple classes