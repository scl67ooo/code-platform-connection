public class Solution {

	public static boolean validatePin(String pin) {
		String regExp = "^[0-9]+$";
		if (pin.matches(regExp)) {
			return true;
		} else {
			return false;
		}
	}
}