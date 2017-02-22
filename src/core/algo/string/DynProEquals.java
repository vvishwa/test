package core.algo.string;

import java.io.*;
import java.util.*;

public class DynProEquals {
    
    private static void incr(int[] a, int op) {
        int z = 0;
        int idx = 0;
        for (int i = 0; i < a.length - 1; i++) {
            z = a[i] - a[i+1];
            if (z != 0 && (Math.abs(z) == 1 || Math.abs(z) == 2 || Math.abs(z) == 5)) {
                idx = i;
                break;
            }                
        }
        if (z  == 0) {
            System.out.println(op);
            return;
        }
            
        else {
            int idxSkip = idx+1;
            for (int i = 0; i < a.length - 1; i++) {
                if (i != idxSkip)
                    a[i] += 1;              
            }
            incr(a, op++);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(new FileInputStream("DynProEquals.txt"));
        int noOfCases = in.nextInt();
        for (int caseId = 0; caseId < noOfCases; caseId++) {
            int noOfEle = in.nextInt();
            int[] arr = new int[noOfEle];
            for ( int eleCntr = 0; eleCntr < noOfEle; eleCntr++) {
                arr[eleCntr] = in.nextInt();
            }
            incr(arr,0);
        }
    }
}
