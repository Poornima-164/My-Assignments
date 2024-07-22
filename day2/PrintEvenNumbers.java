package week1.day2;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int num=15;
		for (int i=0 ; i<=num ; i++)
			//if(i%2==0)
			if (i%2!=1)
				System.out.println("even number is:"+i);
	}

}
