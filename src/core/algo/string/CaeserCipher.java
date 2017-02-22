package core.algo.string;

import java.io.*;
import java.util.*;

public class CaeserCipher {

	public static void main(String[] args) {
		solution();
	}
	
	public static void solution() {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphaUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        //Scanner in = new Scanner(System.in);
        int size = 11;

        char[] m = new char[size];
        m = "middle-Outz".toCharArray();
                        
        int r = 2;
        
        char[] rslt = m.clone();
        for (int i = 0; i< size ; i++) {            
            if ((m[i] >= 'a' && m[i] <= 'z')) {
                rslt[i] = alpha[(m[i] - 'a' + r)%26];    
            } else if ((m[i] >= 'A' && m[i] <= 'Z')) {
                rslt[i] = alphaUp[(m[i] - 'A' + r)%26]; 
            }           
            System.out.print(rslt[i]);
        }
        System.out.println();
    }
}

