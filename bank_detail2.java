package thursday_lab_3_aug;

import java.util.Scanner;
//using inheritance
public class bank_detail2 extends Bank_detail {
	//initilized variable
	int choice,newpin,loan_amount,time_period,loan_per=10;
	char ans;
	Scanner sc=new Scanner(System.in);
	
	public void ac()
	{
		System.out.println("Enter Your bank name:");
		Bank_name=sc.next();
		System.out.println("Enter your branch name:");
		branch_name=sc.next();
		System.out.println("Enter your name:");
		user_name=sc.next();
		System.out.println("Enter your ac number");
		setAc_no(sc.nextInt());
		System.out.println("Enter your pin no");
		newpin=sc.nextInt();
		//for checking 
		if(newpin==getPin())
		{
			user_choice();
		}
		else
		{
			System.out.println("Invalid pin");
		}
		
	}
	//for withdraw amount and deposit amount
	public void transaction() {
		System.out.println("Enter your amount");
		amount=sc.nextInt();
		int bal=getBal();
		
		if(choice==2)
		{
			bal+=amount;
		}	
		else
		{
			bal-=amount;
		}
		setBal(bal);
	}
	
	//for counting interest to y=the loan
	public void loan() {
		System.out.println("*******loan procedure*********");
		System.out.println("enter loan amount");
		loan_amount=sc.nextInt();
		if(loan_amount>=10000) {
			System.out.println("time period(in year)");
			time_period=sc.nextInt();
			System.out.println("your loan amount is"+loan_amount+"\npercentage of amount is:"+loan_per+"%");
		int interest =(loan_amount+loan_per+time_period)/100;      //formula of interest
		System.out.println("\ntotal amount is:"+(loan_amount+interest)+"/-\n");
		System.out.println("intrest amount on"+loan_amount+"is"+interest+"/-");
		}
		else if(loan_amount<=10000) {
			System.out.println("loan is applicable on above 10000/- amount");
		}
	}
	
	
	public void user_choice() {
		//do while for repetition
		do
		{
			System.out.println("1:check Balance\n2:Deposit\n3:Withdraw\n4 loan");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("*******check Balance*********");
				System.out.println("Hello "+user_name+"\nYour account balance is ="+getBal());
			break;
			case 2: 
				System.out.println("*******Deposit*********");
				transaction();
			System.out.println("Hello "+user_name+"\nYour account balance is ="+getBal());
			break;
			case 3:System.out.println("*******Withdraw*********");
				transaction();
				System.out.println("Hello "+user_name+"\nYour account balance is ="+getBal());
			break;
			
			case 4:
				loan();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to repeat");
			ans=sc.next().charAt(0);
		}while(ans=='y'||ans=='Y');
		
		System.out.println("-------thank you-------");
	}

	}

