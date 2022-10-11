package lab2algorithm;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter No of transaction");		//10 70	50	100	30  --
		int size=sc.nextInt();
		
		int trans[]=new int[size];
		for(int i=0;i<size;i++)
		{
			trans[i]=sc.nextInt();
		}

		System.out.println("Enter No of test cases");
		int testcases=sc.nextInt();
		int targetAmount;
		int j,sum,flag;
		for(int i=1;i<=testcases;i++)
		{
			sum=0;
			flag=0;
			System.out.println("Enter Target Amount of " + i + "case");  //120
			targetAmount=sc.nextInt();
			for(j=0;j<trans.length;j++)
			{
				sum=sum+trans[j];
				if(sum>=targetAmount)
				{
					System.out.println("Target complete on "+ ++j + "day" );
					flag=1;
					break;
				}
			}
			if(flag==0)
			System.out.println("Target not fulfilled" );
		}
	}
	}
}

