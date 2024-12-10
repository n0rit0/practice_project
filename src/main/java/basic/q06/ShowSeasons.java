package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int month = 14; // 変数値　変更　表示結果変わる

		if (month >= 3 && month <= 5) {
			System.out.println("春");
		} else if (month >= 6 && month <= 8) {
			System.out.println("夏");
		} else if (month >= 9 && month <= 11) {
			System.out.println("秋");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("冬");
		} else {
			System.out.println(month + "月は存在しない月です。");
		}

	}

}
