package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 7, 1, 4,3,25,15,205,225, 4, 20, 15, 8 }; 
		  bubbleSort(arr);
		  printArray(arr);
		  
	}

	public static  void printArray (int[] arr) {
		for (int i=0; i < arr.length;i++)
			System.out.print(arr[i]+",");
		System.out.println();
	}
	public static void bubbleSort(int arr[]) {
		for (int j=arr.length-1; j> 0; j--) {
			for (int i = 0; i < j ; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
			}
		}
	}
	
}
