//This is the simple Constroctor use with agument and without Argument
//We can also declare Constructore Using in public modifier but we can not attach reture type

class Const{
    
    int karan,jinil,jay,harsh;

    Const(){
        karan=500;
        jinil=600;
        jay=700;
        harsh=900;
    }

    Const(int chK, int chJ)
    {
        this.karan=chK;
        this.jinil=chJ;
    }

}


public class cunstructor {
    public static void main(String[] args) {
        
        Const obj1=new Const();

        System.out.println(obj1.karan);

        Const obj2=new Const(1000,1100);
        
        System.out.println(obj2.karan);
        System.out.println(obj2.jinil);

    }
}
