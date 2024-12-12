package method.q09;

public class Even {

	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		int num = 5;

		boolean result = checkEven(num);

		if (result) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

}
