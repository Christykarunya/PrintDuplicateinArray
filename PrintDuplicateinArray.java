package week1.day2;

public class PrintDuplicateinArray {

	public static void main(String[] args) {
		//input - initialize the array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int count=0;
		//length of array or size of array
		int length=arr.length;
		System.out.println("Default array-Input");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("Length of the array:" + length);
		System.out.println("Printing the duplicate values in the array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
			
		}
	}


