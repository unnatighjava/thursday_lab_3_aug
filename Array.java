package thursday_lab_3_aug;

import java.util.Scanner;

public class Array {
	//intilized  variable
 static int size,i,j;
int[] num;
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//creating object
		Array obj=new Array ();
		//calling object
		obj.array();
		obj.greater();
		obj.smaller();
		
	}
	//method for printing 10 number array
		public int[] array()
		{
			num=new int[10];	
		System.out.println("enter 10 number in array");
		
		
			for(i=0;i<num.length;i++)
			{
				num[i]=sc.nextInt();
			}
			return num;
		

	}
		//method for finding greater number
		public void greater() {
			
			 int grt=num[0];
			 //condition for greater number
			for(i=0;i<num.length;i++)
			{
				if(grt <num[i])
				{
					grt=num[i];
				}
				
			}
			System.out.println("1:the greater number is:"+grt);
		
		}
		
		//method for finding smaller number
		public void smaller() {
			 int smt=num[0];
			 //condition for greater number
			for(i=0;i>num.length;i++)
			{
				if(smt <num[i])
				{
					smt=num[i];
				}
				
			}
			System.out.println("2:the smaller number is:"+smt);
		
		}
			
		}
		


