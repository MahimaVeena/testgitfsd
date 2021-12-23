
public class PalindromeClass {

	public static void main(String args[]) {
		PalindromeCheck("abcba");
	}

	public static void PalindromeCheck(String str) {
		boolean palindrome = isPalindrome(str, 0, str.length() - 1);
		if (palindrome)
			System.out.println(str + " is a palindrome");

		else
			System.out.println(str + " is not a palindrome");
	}

	public static boolean isPalindrome(String str, int low, int high) {
		if (low > high) {
			return true;
		} else if (str.charAt(low) == str.charAt(high)) {
			return isPalindrome(str, low + 1, high - 1);
		}

		else
			return false;

	}
}
