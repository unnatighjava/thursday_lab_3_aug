package thursday_lab_3_aug;

import java.util.Scanner;
// use abstraction
public abstract class BankAccont {
	//initiliized variable
	String bankname,acc_number;
	int amount,bal=3000;
Scanner sc=new Scanner(System.in);
//new method
public void acc() {
System.out.println("Enter your BankName");
bankname=sc.next();
System.out.println("Enter your Account Number");
acc_number=sc.next();
}

//method for withdrawing
public void withdrow()
{
	System.out.println("****Enter amount which you want withdraw****");
	amount =sc.nextInt();
	bal+=amount;
	System.out.println("Hello"+"\nyour account balnce  after withdraW amount :"+bal);
	}

//method for deposit
public void deposite() {
	System.out.println("****Enter amount which you want to deposite*****");
	amount =sc.nextInt();
	bal-=amount;
	System.out.println("Hello"+"\nyour account balnce after deposite amount :"+bal);
}
}

