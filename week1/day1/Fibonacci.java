package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
   int a=0;
   int b=1;
   int c;
   for (int i = 0; i <6; i++) {
	   c=a+b;
	   a=b;
	   b=c;
	   System.out.println(c);
}
	}

}
