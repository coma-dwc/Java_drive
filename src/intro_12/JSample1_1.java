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
/*
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


//■引数を使ってメソッドに値を渡す

class JSample1_1 {
	public static void main(String[] args) {
		int num1, num2;
		
		num1 = 10; 
		num2 = 8;
		keisan(num1, num2);
		
		num1 = 23;
		keisan(num1, 7);
		
		keisan(15, 22);
	}
	
	private static void keisan(int n1, int n2) {
		System.out.println("num1 = " + n1 + ",num2 = " + n2);
		System.out.println("num1 + num2 = " + (n1 + n2));
		System.out.println("num1 - num2 = " + (n1 - n2));
	}
}
/*
出力結果：
num1 = 10,num2 = 8
num1 + num2 = 18
num1 - num2 = 2
num1 = 23,num2 = 7
num1 + num2 = 30
num1 - num2 = 16
num1 = 15,num2 = 22
num1 + num2 = 37
num1 - num2 = -7
*/