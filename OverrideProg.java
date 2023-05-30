class demo{ 
    
    String Enrollno,result; 
    
    public String getenrollmenno()

    {
    
    return Enrollno;
    
    } 
    
    public void setenrollno(String enrollno)
    
    { 
        this.Enrollno=enrollno;
    } 
    
    @Override
    
    public String toString() 
    { 
        return ("Enrollment number = "+ getenrollmenno());
    
    }
}
    
   

public class OverrideProg {
    public static void main(String[] args) {
        demo d1=new demo(); 
        d1.setenrollno("ABC968");
        System.out.println(d1);
    }
}
