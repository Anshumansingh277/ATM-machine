//import packages
import java.util.*;
import java.util.Scanner;
class ATM
{
  public static void main(String [] args)
  {
    int balance=50000,withdraw,deposit;
    Scanner scn=new Scanner(System.in);
    while(true)
    {
      System.out.println(" Select 1 for withdraw money");
       System.out.println(" Select 2 for deposit money");
       System.out.println(" Select 3 for check balance");
       System.out.println(" Select 4 for exit");
      
      int choice =scn.nextInt();
      switch(choice)
      {
        case 1:
          System.out.println("enter amount ");
          int withdraw=scn.nextInt();
          if(balance>=withdraw)
          {
            System.out.println("your money is withdrawn is suxessfull !!");
            balance=balance-withdraw;
          }
          else
          {
            System.out.println("insuffcient balance");
          }
          break;
          
        case 2:
                System.out.println("enter amount to be deposited");
                deposit=scn.nextInt();
               balance=balanc+deposit;
               System.out.println("your money is deposited sucessfully ");
          break;
        case 3:
          System.out.println("your account balance is "+balance);
          break;
        case 4:
          System.exit(0);
      }
    }
  }
}

          Syst
                
