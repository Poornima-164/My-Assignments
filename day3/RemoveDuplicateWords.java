package week1.day3;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
String[] words=text.split(" ");
String result = "";
for (int i = 0; i < words.length; i++) {
	boolean isDuplicate=false;
	for (int j = 0; j < i; j++) {
		if (words[i].equalsIgnoreCase(words[j])) {
			isDuplicate=true;
			break;
		}
	}
	if (!isDuplicate) {
		if (!result.isEmpty()) {
		result+=" ";
		}
		result+=words[i];
				}
System.out.println(result);
}

	}

}
