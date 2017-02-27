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
    
    private static void avgArr(int[] arr, int left, int right) {
        //double s = sum(arr);
        //System.out.println(s);
        //arr[0] and arr[1] until end
    	if (right > left)
    		return;
        if (right > arr.length -1) {
        	int tmp = arr[1];
        	arr[1] = arr[0];
        	arr[0] = tmp;
        } else {
        	int[] ar1 = Arrays.copyOfRange(arr, 1, arr.length-1);
        }
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
            //avgArr(arr);
        }
    }
}
