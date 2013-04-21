import java.util.ArrayList;

/**
 *
 */

/**
 * @author zach
 *
 */
public class DigitFifthPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] tempCharArray;
		double testNumber = 0;
		double total = 0;
		ArrayList<Double> acceptableNumbers = new ArrayList<Double>();

		for (int i = 2; i < 295245; i++) {
			tempCharArray = Integer.toString(i).toCharArray();
			for (char x : tempCharArray) {
				testNumber = testNumber + Math.pow((x - 48), 5);
			}
			if (testNumber == i) {
				acceptableNumbers.add(testNumber);
			}
			testNumber = 0;
		}

		for (int i = 0; i < acceptableNumbers.size(); i++) {
			total += acceptableNumbers.get(i);
		}
		System.out.println(total);
	}

}
