package week1.day2;

public class LearnMethods {
	
   public void browserName() {
System.out.println("Chrome");
}
	private void browserVersion(int version) {
System.out.println("version :"+ version );
	}
     void browserLogo(char logo) {
System.out.println("Logo:"+ logo);
	}
     public int age(int a, int b){
		return a+b;

     }
	public String name(String name) {
		return name;
			}
	
	
	public static void main(String[] args) {
		LearnMethods s= new LearnMethods();
		
		s.browserName();
		s.browserVersion(356);
		s.browserLogo('c');
		
		
		int age = s.age(14, 13);
		System.out.println(age);
		String name = s.name("Poornima");
		System.out.println(name);
		
		
		int age2 = s.age(34, 45);
		System.out.println(age2);

	}

}
