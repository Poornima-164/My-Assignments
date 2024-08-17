package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
    int[] a= {1,4,3,2,8,6,7};
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++) {
		int j=i+1;
		if (a[i]!=j) {
			System.out.println("Missing number is:"+j);
			break;
			
		}
	}
    
	}

}
