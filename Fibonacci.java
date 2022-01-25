import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args)
	{int a=0,b=1,c,j;
	System.out.print("Enter the term Uptill where you want to print the fibonacci series :");
	Scanner n= new Scanner(System.in);
	j = n.nextInt();
	System.out.print("series of "+j+ " term is as follow ");
	System.out.println("");
	System.out.println(a+" "+b);
	for(int i=1;i<j;i++)
	{
		c=a+b;
		System.out.println(" "+c);
		a=b;
		b=c;
		
	}
	}

}
