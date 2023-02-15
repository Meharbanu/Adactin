package selenium_task;

public class Java_Task {

	public static void main(String[] args) {
		String s = "Welcome to Java";
		String rev = "", wordrev = "", rev1 = "", rev2 = "", wordrev1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("\n\n\nThe given String is : \n" + s);
		System.out.println("\nThe reversed String is : \n" + rev);

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("\n\nThe string is palindrome");
		} else {
			System.out.println("\n\nThe given string is not palindrome");
		}
		System.out.println("======================================\n\n");

		String[] s1 = s.split(" ");
		for (String s2 : s1) {
			for (int i = s2.length() - 1; i >= 0; i--) {
				rev1 = rev1 + s2.charAt(i);
			}
			rev1 = rev1 + " ";

		}
//		wordrev = wordrev + rev1;
		System.out.println("The given String is : \n" + s);
		System.out.println("\n\nThe reversed String without changing position: \n" + rev1);

		System.out.println("======================================\n\n");

		String s3 = "emocleW ot avaJ";
		String[] s4 = s3.split(" ");
		for (String s5 : s4) {
			for (int i = s5.length() - 1; i >= 0; i--) {
				rev2 = rev2 + s5.charAt(i);
			}
			rev2 = rev2 + " ";
		}
//		wordrev1 = wordrev1 + rev2;
		System.out.println("The given String is : \n" + s3);
		System.out.println("\n\nThe reversed String without changing position: \n" + rev2);
	}
}
