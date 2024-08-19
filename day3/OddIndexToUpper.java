package week1.day3;

public class OddIndexToUpper {

	public static void main(String[] args) {
   String test="changeme";
   char[] charArray=test.toCharArray();
   for (int i = charArray.length-1; i >=0 ; i--) {
if (i%2!=0)	{
	charArray[i]=Character.toUpperCase(charArray[i]);
	
}
}
   String s=new String(charArray);
   System.out.println(s);
	}

}
