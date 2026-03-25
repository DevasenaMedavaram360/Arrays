import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

//		System.out.println("enter size of the array");
		Scanner sc = new Scanner(System.in);
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		System.out.println("enter array  elements:");
//		for(int i=0;i<size;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		for(int k:arr)
//		{
//			System.out.println(k);
//		}

		System.out.println("enter the no.of rows");
		int rows = sc.nextInt();
		System.out.println("enter no.of cols");
		int col = sc.nextInt();
		int[][] arr = new int[rows][col];
		System.out.println("enetr array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		
		for(int i=0;i<rows;i++)
		{
			int sumRow=0;
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
				sumRow += arr[i][j];
				
			}
			System.out.println(sumRow);
			System.out.println();
			
		}
		
		
		for(int j=0;j<col;j++)
		{
			int colsum=0;
			for(int i=0;i<rows;i++)
			{
				colsum += arr[i][j];
		    }
			System.out.print(colsum+" ");
			
		}
		System.out.println();
		
		
		
		System.out.println("------right diagonal-------");
		
		int sum=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					System.out.println(arr[i][j]);
					sum +=arr[i][j];
				}
			}
			
		}
		System.out.println(sum);
		
		System.out.println("------left diagonal-------");
		
		int Sum=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=2;j>=0;j--)
			{
				if(i+j==col-1)
				{
				   System.out.println(arr[i][j]);
				   Sum += arr[i][j];
				}
			}
		}
		System.out.println(Sum);
	}

}
