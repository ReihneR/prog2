import java.util.ArrayList;

public class läxa2 {

	public static void main(String[] args) {

		String ord = "adrian";
		ArrayList<String> list = new ArrayList<String>();
		String resultat = reverse(ord, ord.length() - 1, list);
		System.out.println(resultat);

	}

	public static String reverse(String ord, int index, ArrayList<String> letters) {
		String result = "";
		letters.add(ord.charAt(index) + "");

		if (index != 0) {

			reverse(ord, --index, letters);

		}
		result = letters.toString();
		return result;

	}

}