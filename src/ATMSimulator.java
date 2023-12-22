import java.util.*;

public class ATMSimulator {

	public static void main(String[] args) {
		int balance = 0, withdraw,deposite,num;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to ATM Machine");
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. EXIT");
			
			num = in.nextInt();
			
			switch(num) {
			case 1 : System.out.println("Enter Amount to Deposite");
			         deposite = in.nextInt();
			         balance = balance+deposite;
			         System.out.println("Money has been deposited successfully");
			         System.out.println("Your updated balance is : "+balance);
			         System.out.println("");
			break;
			         
			case 2 : System.out.println("Enter Amount to Withdraw");
			         withdraw = in.nextInt();
			         if(balance >= withdraw) {
			        	 balance = balance - withdraw;
			        	 System.out.println("Do Not Remove Card");
			        	 System.out.println("please collect money");
			         }
			         else {
			        	 System.out.println("You Don't have enough money for withdraw");
			         }
			         System.out.println("");
			 break;
			 
			case 3 : System.out.println("Balance Amount is : "+balance);
			         System.out.println("");
			break;
			
			case 4 : System.exit(0);
			         System.out.println("");
			}
		}

	}

}
