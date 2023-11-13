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
/*
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



//■引数に配列やクラスオブジェクトを渡す
/*
class JSample1_1 {
	public static void main(String[] args) {
		int num = 8;
		int array[] = {10, 4};
		
		System.out.println("num = " + num);
		System.out.println("array[0] = " + array[0]);
		
		henkou(num, array);
		
		System.out.println("num = " + num);
		System.out.println("array[0] = " + array[0]);
	}
	
	private static void henkou(int num, int array[]) {
		num = 5;
		array[0] = 12;
	}
}
/*
出力結果：
num = 8
array[0] = 10
num = 8
array[0] = 12
*/



//■戻り値を使ってメソッドから値を返す

//メソッドに渡された値をメソッド内で2倍し、その結果を呼び出し元に返す
/*
class JSample1_1 {
	public static void main(String[] args) {
		int kekka;
		
		kekka = bai(9);
		System.out.println(kekka);
		
		kekka = bai(5);
		System.out.println(kekka);
	}
	
	private static int bai(int n) {
		return n * 2;
	}
}
/*
出力結果：
18
10
*/


//メソッド内で条件分岐を行い、戻り値で返す値を二通り記述

class JSample1_1 {
	public static void main(String[] args) {
		int num;
		String kekka;
		
		num = 9;
		kekka = hantei(num);
		System.out.println(num + "は" + kekka);
		
		num = 6;
		kekka = hantei(num);
		System.out.println(num + "は" + kekka);
	}
	
	private static String hantei(int n) {
		if(n % 2 == 0) {
			return "偶数";
		} else {
			return "奇数";
		}
	}
}
/*
出力結果：
9は奇数
6は偶数
*/