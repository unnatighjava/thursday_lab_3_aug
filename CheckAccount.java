package thursday_lab_3_aug;

import java.util.Scanner;
//using inheritance
public class CheckAccount extends BankAccont{
	
	public static void main(String[]args) {
		int choice,ans;
		
		Scanner sc=new Scanner(System.in);
		
		//calling object
		CheckAccount obj3=new CheckAccount();
		obj3.acc();
		//using do while for repetition
		do{
	System.out.println("\n1.withraw\n2.deposite");
	System.out.println("enter your choice");
        choice=sc.nextInt();
        //using switch for multiple choice
        switch(choice) {
        case 1:
        	CheckAccount obj=new CheckAccount();
        	obj.withdrow();
        	break;
        case 2:
        	CheckAccount obj1=new CheckAccount();
        	obj1.deposite();
        	break;
        	default:
        		System.out.println("invalid choice");
        		break;
        }
        System.out.println("Do you want to repeat");
		ans=sc.next().charAt(0);
		//end of do while
	}while(ans=='y'||ans=='Y');
		System.out.println("********thank you*********");	
}
	
	}

