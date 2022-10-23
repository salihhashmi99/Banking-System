public class parent {
    public String name;
    public int cnic;
    public double money;
    
    public void withdraw(double m){
        System.out.println("You are withdrawing "+m);
        money=money-m;
        System.out.println("Your account balance is : "+money);
        
    }
    
    public void deposit(double m){
        System.out.println("You are depositing "+m);
        money=money+m;
        System.out.println("Your account balance is : "+money);
        
    }
    
    static void display(){
    System.out.println("Welcome to noob banking services");
    System.out.println("it's your choice to open current account (with 0% interest rate) or Saving account(with 0.5% interest rate)");
        
    }
}

public class current extends parent {
    void interest(){
        double interest = 0/money*100;
        money = money+interest;
        System.out.println("Your account balance with interest is : "+" "+money);
    }
}

public class Saving extends parent {
    void interest(){
        double interest = (money/100)*0.5;
        money = money+interest;
        System.out.println("Your account balance with interest is : "+" "+money);
    }
}

public static void main(String[] args) {
        
        parent.display();
        System.out.println("Which account do you want to open ?");
        System.out.println("press 1 for current account and 2 for saving account");
        
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        
        switch(a){
            case 1:
                current c1=new current();
                System.out.println("Enter name");
                Scanner input1 = new Scanner(System.in);
                c1.name=input1.nextLine();
                System.out.println("Enter cnic");
                Scanner input2 = new Scanner(System.in);
                c1.cnic=input2.nextInt();
            
            
            System.out.println("Enter the amount for deposit");
            Scanner input5=new Scanner(System.in);
            double z=input5.nextDouble();
            
            c1.deposit(z);
            c1.interest();
            
            System.out.println("Enter the amount for withdraw");
            Scanner input6=new Scanner(System.in);
            double x = input6.nextDouble();
            c1.withdraw(x);
            break ;
            
            case 2:
                Saving s1 = new Saving();
                
                System.out.println("Enter name");
                Scanner input3 = new Scanner(System.in);
                s1.name=input3.nextLine();
                System.out.println("Enter cnic");
                Scanner input4 = new Scanner(System.in);
                s1.cnic=input4.nextInt();
            
            System.out.println("Enter the amount for deposit");
            Scanner input7=new Scanner(System.in);
            double l=input7.nextDouble();
            
            s1.deposit(l);
            s1.interest();
            
            System.out.println("Enter the amount for withdraw");
          Scanner input8=new Scanner(System.in);
            double p=input8.nextDouble();
            s1.withdraw(p);
            break ;          
        }       
    }
}
