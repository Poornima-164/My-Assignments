package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		char[] ch1=text1.toCharArray();
		char[] ch=text2.toCharArray();
		  Arrays.sort(ch1);
		  Arrays.sort(ch);
		  for (int i = 0; i < ch1.length; i++) {
		  if(ch1[i]==ch[i]) {
			  System.out.println("The given strings are an Anagram:"+ch[i]);
		  } else {
			  System.out.println("The given strings are not an Anagram");
  }
	}
	}
	}
