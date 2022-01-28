//matrix application in java.

public class ismatrix {
	public static void main(String[] args) {
int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
int b[][]= {{1,3,4},{2,4,3},{3,4,5}};
int sum[][] = new int[3][3];
int mul[][] = new int[3][3];
System.out.println("Elements of first matrix : ");

for(int i=0;i<3;i++)
		{
	   for(int j=0;j<3;j++)
	   { System.out.print(a[i][j]+"  ");
		}
	   System.out.println();
		}
System.out.println("Elements of second matrix : ");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{ System.out.print(b[i][j]+"  ");
}
System.out.println();
}
						System.out.println("Addition of matrix : ");
						for(int i=0;i<3;i++)
						{
						for(int j=0;j<3;j++)
						{ sum[i][j]=a[i][j] + b[i][j];
						}
						}
						for(int i=0;i<3;i++)
						{
						for(int j=0;j<3;j++)
						{ System.out.print(sum[i][j]+"  ");
						}				
						   System.out.println();
						}
System.out.println("multiplication of matrix : ");	
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{ for(int k=0;k<3;k++)
				{ mul[i][j] = mul[i][j] +a[i][k] +b[k][j];
				
				}
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{System.out.print(mul[i][j]+"  ");
}
System.out.println(" ");	

}


}
}
