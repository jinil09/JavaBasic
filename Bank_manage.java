import java.util.*;

class Account{

    double total_A,withdrowal,Deposite;

    public void takeTotalAmount(double to_a)
    {
        this.total_A=to_a;
    }

    public void withdrowalmath(double with_a) {
        this.withdrowal=with_a;
        
      
            total_A=total_A-withdrowal;
    }


    public void deposite(double dep) {
        total_A=total_A+dep;
    }

    public void setbalance(double baall) {
        this.total_A=baall;        
    }
}


public class Bank_manage {
    public static void main(String[] args) {
        
        Account obj1=new Account();
        obj1.takeTotalAmount(5000);
        boolean exit = false;
        while(!exit)
        {

            System.out.println("-------------------------");
            System.out.println("Hello Welcome to the bank System");
            System.out.println("1 = Show Blance");
            System.out.println("2 = withdrowal Amount");
            System.out.println("3 = Deposite amount");
            System.out.println("4 = For Special Persone Set Balance");
            System.out.println("5 = Exit");
            System.out.println("-------------------------");
    
            Scanner scn = new Scanner(System.in);
            int choise=scn.nextInt();
            
            switch (choise) {
                case 1:
                    System.out.println("Your Current balance is : "+obj1.total_A);
                    break;
    
                case 2:
    
                    System.out.print("Enter Withdrowal Amount : ");
                    int wa=scn.nextInt();
                    
                    if(obj1.total_A<wa)
                    {
                        System.out.println("Your account balance are not sufficiant to full fill this amount");
                    }
                    else{
                        
                        if(obj1.total_A-wa<1000)
                        {
                            System.out.println("You can not withdrowl this amount");
                        }
                        else{
                            
                            obj1.withdrowalmath(wa);
                            System.out.println("Congrates! You withdrowl this amount : "+obj1.withdrowal);
                            System.out.println("Your Current balance is : "+obj1.total_A);
                        }
                    }
                    break;
    
                case 3:
                    System.out.print("Enter Deposite Amount : ");
                    int depo=scn.nextInt();
                    obj1.deposite(depo);
                    
                    System.out.println("Congrates! You Deposite this amount : "+depo);
                    System.out.println("Your Current balance is : "+obj1.total_A);
                break;
    
                case 4:
    
                System.out.print("Enter Password : ");
                int pass=scn.nextInt();
    
                if(pass==1234)
                {
                    System.out.print("Enter Balance Amount : ");
                    int bal=scn.nextInt();
                    
                    obj1.setbalance(bal);
    
                    System.out.println(obj1.total_A);
                }
                else{
                    System.out.println("Please Enter valid password to access Blance");
                }
    
                
                break;
            
                case 5:
                exit=true;
                break;
    
                default:
                System.out.println("Please Enter Any of this Choise");
                    break;
            }
        }
        


        

        // obj1.deposite(5000);

        
    }
}
