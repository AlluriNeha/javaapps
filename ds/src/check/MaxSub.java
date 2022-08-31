package check;

import java.io.IOException;
import java.util.Scanner;


public class MaxSub {

    // Complete the maxSubsetSum function below.




	static int maxSubsetSum(int[] arr) {
		if (arr.length == 1)
			return arr[0];
		if (arr.length == 2)
			return Math.max(arr[0],arr[1]);
		int arrRes[] = new int[arr.length];
		arrRes[arr.length-1] = (arr[arr.length-1]>0)?arr[arr.length-1]:0;
		arrRes[arr.length-2] = Math.max(arrRes[arr.length-1],arr[arr.length-2]);

		for (int i=arr.length-3; i >= 0; i--) {
			arrRes[i] = Math.max((arr[i]>0?arr[i]:0)+arrRes[i+2], arrRes[i+1]);
		}
		return arrRes[0];

	}


	static int maxSubsetSum1(int[] arr) {
		if (arr.length == 1)
			return arr[0];
		if (arr.length == 2)
			return Math.max(arr[0],arr[1]);
		int l2 = (arr[arr.length-1]>0)?arr[arr.length-1]:0;
		int l1 = Math.max(arr[arr.length-2],l2);

		for (int i=arr.length-3; i >= 0; i--) {
			int l0 = Math.max((arr[i]>0?arr[i]:0)+l2, l1);
			l2=l1;
			l1=l0;
		}
		return l1;

	}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        System.out.println(maxSubsetSum(arr));
    }
}
