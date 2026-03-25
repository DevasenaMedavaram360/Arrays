import java.util.Scanner;

public class ArrayProblems {

//	public void isPresent(int arr[],int key) {
//		for(int i:arr) {
//			if(i==key) {
//				System.out.println("specific value exist"+key);
//			}
//		}
//	}
//	public void find(int arr[],int key) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==key) {
////				System.out.println("index of array element :"+i);
//			}
//		}
//	}
	
//     public void reverseArray(int arr[]) {
//    	 int reverse[]=new int[arr.length];
//    	 int j=0;
//    	 for(int i=arr.length-1;i>=0;i--) {
//    		 reverse[j] =arr[i];
//    		 j++;
//    	 }
//    	 for(int i:reverse) {
//        	 System.out.println(i);
//         }
//     }
     	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		for(int i=0;i<size;i++) {
//			System.out.println("enter array elements");
//			arr[i]=sc.nextInt();
//		}
// 		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		int avg=sum/arr.length;
//		System.out.println(avg);
		int key=3;
		ArrayProblems a=new ArrayProblems();
//		a.isPresent(arr,key);
//		a.find(arr, key);
		
//		find max and min values from array
//		int max =arr[0];
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++) {
//							if(arr[i]<min) {
//					                  min=arr[i];
//								}
//							if(arr[i]>max){
//								max=arr[i];
//							}
//		}
//		System.out.println(max);
//		System.out.println(min);
//		a.reverseArray(arr);
		//duplicate elements in array
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length-1;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("duplicate element"+arr[i]);
//				}
//			}
//		}
//		String[] names={"devasena","lalli","valli","lalli"};
//		for(int i=0;i<names.length;i++) {
//	
//			for(int j=i+1;j<names.length;j++) {
//				
//				if(names[i].equals(names[j])) {
//					System.out.println(names[i]);
//				}
//			}
//		}
		
		int arr[]= {3,5,4,5,7,5,2,3};
//		int array[]= {6,5,2,3};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<array.length;j++) {
//				if(arr[i]==array[j])
//				{
//					System.out.println(arr[i]);
//					
//				}
//			}
//		}
		//duplicate values
//		for(int i=0;i<arr.length;i++) {
//			boolean isDuplicated=false;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j])
//				{
//					isDuplicated=true;
//					break;
//				}
//				
//			}
//			if(isDuplicated==false) {
//				System.out.println(arr[i]);
//			}
//		}
		//remove element from array
//		for(int i=0;i<arr.length;i++) {
//			boolean isRemove=false;
//			if(arr[i]==key){
//				isRemove=true;	
//			}
//			if(isRemove==false){
//				System.out.println(arr[i]);
//			}
//		}
//		int secondmin=Integer.MAX_VALUE;
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]<min) {
//				secondmin=min;
//				min=arr[i];
//			}
//				else if(arr[i]<secondmin && arr[i]!=min) {
//					secondmin=arr[i];
//				}
//			}
//		System.out.println(secondmin);
//		int array[]=new int[arr.length];
//		int index=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2==0) {
//				array[index]=arr[i];
//				index++;
//			}
//			
//		}
//		for(int j=0;j<arr.length;j++) {
//			if(arr[j]%2!=0) {
//				array[index]=arr[j];
//				index++;
//			}
//		}
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}

//		int b[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			b[i]=arr[i];
//			System.out.println(b[i]);
//		}
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}

//     	for(int i=0;i<arr.length;i++) {
//     		if(i%2==0) {
//     			System.out.println(arr[i]);
//     		}
//     		
//     	}
//     	for(int j=0;j<arr.length;j++) {
//     		if(j%2!=0) {
//     			System.out.println(arr[j]);
//     		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//		       System.out.println(arr[i]);
//     	}
		
		int[] array= {6,4,9};
		int temp[];
		temp=arr;
		arr=array;
		array=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<array.length;i++) {
			System.out.println("array");
			System.out.println(array[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

