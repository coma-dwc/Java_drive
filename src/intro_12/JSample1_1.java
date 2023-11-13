package intro_12;

//■メソッド
//checkという名のメソッドを用意
/*
class JSample1_1 {
	public static void main(String[] args) {
		int eigo = 78;
		int suugaku = 90;
		int kokugo = 68;
		
		check("英語", eigo);
		check("数学", suugaku);
		check("国語", kokugo);
	}
	
	private static void check(String kyoka, int seiseki) {
		System.out.print(kyoka + "の試験結果は");
		if(seiseki > 80) {
			System.out.println("合格です");
		} else {
			System.out.println("不合格です");
		}
	}
}
/*
出力結果：
英語の試験結果は不合格です
数学の試験結果は合格です
国語の試験結果は不合格です
*/



//■メソッドの定義

class JSample1_1 {
	public static void main(String[] args) {
		hello();
		bye();
		hellobye();
	}
	
	private static void hello() {
		System.out.println("こんにちは。");
	}
	
	private static void bye() {
		System.out.println("さようなら。");
	}
	
	private static void hellobye() {
		hello();
		bye();
	}
}
/*
出力結果：
こんにちは。
さようなら。
こんにちは。
さようなら。
*/