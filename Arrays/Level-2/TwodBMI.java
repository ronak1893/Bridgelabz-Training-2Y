import java.util.*;
public class TwodBMI
{
	public static void main(String[]args)
	{
		Scanner sy=new Scanner(System.in);
		System.out.print("Enter no. of peoples: ");
		int n=sy.nextInt();
		String a[] = {"Meter","Height"};
		double data [][] = new double[n][2];
		double bmi[] = new double[n];
		String status[] =new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter height(in meters) "+(i+1)+":");
			data[i][0]=sy.nextDouble();
			System.out.print("Enter weight(in kg) "+(i+1)+":");
			data[i][1]=sy.nextDouble();
			
		}
		for(int i=0;i<n;i++)
		{
			bmi[i]=data[i][1]/(data[i][0]*data[i][0]);
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
			System.out.println("for people " + (i+1)+":" );
			System.out.println("height is :" +data[i][0]);
			System.out.println("weight is: "+data[i][1]);
			System.out.println("BMI : "+bmi[i]);
			System.out.println("status : "+status[i]);
		}
		
	}
}