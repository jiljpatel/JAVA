
// matrix application in java
public class matrix {
	public static void main(String[] args) {
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
	int sum[][] = new int[3][3];
	System.out.println("Elements of first matrix");
	
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++) {
		System.out.println(a[i][j]+"");
	}
	System.out.println();	
			}
	System.out.println("Elements of second matrix");
		for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++) {
		System.out.println(b[i][j]+"");
	}
	System.out.println();	
			}
	System.out.println("Addition of matrix : ");
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++) {
		sum[i][j]=a[i][j]  + b[i][j];
	}
	}
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++) {
		System.out.println(sum[i][j]+"");
	}
	System.out.println();
	
	
	}
	}
}
