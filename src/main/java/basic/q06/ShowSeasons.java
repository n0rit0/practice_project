package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int month = 15; // 変数値を変更すると表示結果が変わる

		switch (month) {
		// 春
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月は春です。");
			break;

		// 夏
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月は夏です。");
			break;

		// 
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月は秋です。");
			break;

		// 冬
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月は冬です。");
			break;

		// それ以外
		default:
			System.out.println(month + "月は存在しない月です。");
			break;
		}
	}

}
