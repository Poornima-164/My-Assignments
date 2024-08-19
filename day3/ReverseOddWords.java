package week1.day3;

public class ReverseOddWords {

	public static void main(String[] args) {
  String test = "I am a software tester";
  String[] words=test.split(" ");
  String result="";
  for (int i = 0; i<words.length; i++) {
	  if(i%2!=0) {
		  for (int j = words[i].length()-1; j>=0; j--) {
			  result+=words[i];
		}
		  result+=" ";
	  }
     System.out.print(result.trim());		}
}
}