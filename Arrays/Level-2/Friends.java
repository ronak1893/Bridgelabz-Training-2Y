import java.util.*;
class friends
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String n[] ={"Amar" , "Akbar" , "Anthony"};
		int age[] = new int[3];
		double h[] = new double[3];
		for (int i =0; i<3 ;i++)
		{
		System.out.println("enter a age: "+(i+1));
		age[i] =input.nextInt();
		System.out.println("enter a height: "+(i+1));
		h[i] = input.nextDouble();
		}
		int young = 0;
		int tallest =0;
		for (int i =0 ;i<3;i++)
		{
			if (age[i]<age[young]){
			young = i;
			}
			else if (h[i]>h[tallest]){
				tallest =i;
			}
		}
		System.out.println("youngest friend "+n[young]+":"+age[young]);
		System.out.println("tallest friend "+n[tallest]+":"+h[tallest]);
		
		
		
		
	}
}