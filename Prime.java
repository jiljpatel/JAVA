import java.util.Scanner;
public class Prime {


public static void main(String[] args) 
{ int n;
int count=0;
	System.out.println("Enter any Number: ");
	Scanner r = new Scanner(System.in);
	n= r.nextInt();
	
	for(int i=1;i<=n;i++)
	{  
		if(n%i==0)
		{  count++;
	}
	}
	if(count==2)
		{
		System.out.print("Number Entered is Prime Number");
		}
	
	else
		System.out.print("Number Entered is not a Prime Number");
	
}

}
