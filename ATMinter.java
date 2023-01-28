import java.util.*;
public class ATMinter
{
     public static void main(String[] args)
     {
	int balance=20000, withdraw,deposite,num;
	Scanner sc= new Scanner(System.in);
	while(true)
	{
	     System.out.println("ATM machine started..!");
	     System.out.println("1.Withdraw");
	     System.out.println("2.Deposite");
	     System.out.println("3.Check Balance");
	     System.out.println("4.Exit");
	     num=sc.nextInt( );
	     switch(num)
	     {
		case 1:
			System.out.println("Enter amount to be Withdraw:");
			withdraw = sc.nextInt();
			if(balance>=withdraw)
			{
				balance = balance-withdraw;
				System.out.println("Balance amount is: "+balance);
				System.out.println("Please collect money");
			}
			else
			{
				System.out.println("You do not have enough money to withdraw");
			}
			System.out.println("  ");
			break;
		case 2:
			System.out.println("enter amount to deposite:");
			deposite=sc.nextInt();
			balance =balance+deposite;
			System.out.println("Balance amount is: "+balance);
			System.out.println("Money has been deposited successfully");
			System.out.println("  ");
			break;
		case 3:
			System.out.println("Balance of your account is:"+balance);
			System.out.println("  ");
			break;
		case 4:
			System.exit(0);
			System.out.println("  ");
	     }
	}
      }
}
