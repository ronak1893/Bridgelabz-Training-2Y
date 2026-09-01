import java.util.*;
public class ToFindBmi
{
	public static void main(String[]args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter no. of peoples: ");
		int n=sy.nextInt();
		double h[] =new double[n];
		double w[] =new double[n];
		double bmi[] = new double[n];
		String status[] =new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter height(in meters): ");
			h[i]=sy.nextDouble();
			System.out.print("Enter weight(in kg): ");
			w[i]=sy.nextDouble();
			
		}
		for(int i=0;i<n;i++)
		{
			bmi[i]=w[i]/(h[i]*h[i]);
			if(bmi[i]<18.5)
			{
				status[i]="under weight";
			}
			else if(bmi[i]<25)
			{
				status[i]="Normal weight";
			}
			else if(bmi[i]<30)
			{
				status[i]="Over weight";
			}
			else 
			{
				status[i]="obese";
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("for people: " + i+1);
			System.out.println("height is :" +h[i]);
			System.out.println("weight is: "+w[i]);
			System.out.println("status : "+status[i]);
		}
		
	}
}