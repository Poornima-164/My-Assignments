package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
     int[] num= {2,5,77,5,9,2,3};
     Arrays.sort(num);
     for (int i=0; i<num.length-1; i++) {
    	 if(num[i]==num[i+1]) {
    		 System.out.println("Duplicate value is:"+num[i+1]);
    	 }
     }
   }

}
