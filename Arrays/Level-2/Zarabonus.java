import java.util.*;
class Zarabonus
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n= 10;
		double salary[] = new double [n];
		double year[] = new double[n];
		double bonus[] =new double[n];
		double newsalary[] = new double[n];
		double totaloldsalary =0;
		double totalbonus = 0;
		double totalnewsalary =0;
		for (int i = 0; i<n;i++){
			System.out.println("enter a salary: "+(i+1));
			salary[i] = input.nextInt();
			System.out.println("enter a year:");
			year[i] = input.nextInt();
			if (salary[i] <= 0||year[i] < 0) {
             System.out.println("Invalid input");
             i--;  
             continue;
            }
            totaloldsalary += salary[i];
            System.out.println();
        }
		for (int i =0;i<n;i++){
			if (year[i]>5){
				bonus[i] = salary[i]*0.5;
				
			}
			else{
				bonus[i] = salary[i]*0.2;
			}
			newsalary[i] = salary[i] +bonus[i];
			totalbonus += bonus[i];
			totalnewsalary += newsalary[i];
		}
		System.out.println("totaloldsalary: "+totaloldsalary);
		System.out.println("totalbonus: "+totalbonus);
		System.out.println("totalnewsalary: "+totalnewsalary);
		

	}
		
		
}