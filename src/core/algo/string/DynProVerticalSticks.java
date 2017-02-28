package core.algo.string;

import java.io.*;
import java.util.*;

public class DynProVerticalSticks {
    
    private static int sum(int arr[]) {
        int i = arr.length - 1;
        while (i > 0) {
            if (arr[arr.length - 1] <= arr[i-1])
                break;
            i--;
        }
        if (arr.length == 1)
            return 1;
        else
            return arr.length - i + sum(Arrays.copyOf(arr, arr.length - 1));
    }
    
    private static void permute(int[] arr, int k, int acc){
        for(int i = k; i < arr.length; i++){
        	int tmp = arr[k];
        	arr[k] = arr[i];
        	arr[i] = tmp;
            permute(arr, k+1, 0);
            tmp = arr[k];
        	arr[k] = arr[i];
        	arr[i] = tmp;
        }
        if (k == arr.length -1){
        	Arrays.stream(arr).forEach(System.out::print);
        	System.out.println();
        }
    }
    
    private static void avgArr(int[] arr) {
        int[] data = new int[arr.length];
        permute(arr, 0, 0);
    }

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(new FileInputStream("DynProVerticalSticks.txt"));
        int noOfCases = in.nextInt();
        for (int cnt = 0; cnt < noOfCases; cnt++)  {
            int noEle = in.nextInt();
            int[] arr = new int[noEle];
            for (int i = 0; i < noEle; i++)
                arr[i] = in.nextInt();
            avgArr(arr);
        }
    }
}
