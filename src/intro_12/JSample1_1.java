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
/*
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



//■戻り値として配列を返す
//戻り値に指定できる値は一つだけですが、戻り値に複数の要素を持つ配列を指定すれば結果的に複数の値を呼び出し元に返すことも可能
/*
class JSample1_1 {
	public static void main(String[] args) {
		int data[];
		
		data = init();
		System.out.println(data[0]);
		System.out.println(data[1]);
	}
	
	private static int[] init() {
		int data[] = new int[2];
		data[0] = 10;
		data[1] = 19;
		
		return data;
	}
}
/*
出力結果：
10
19
*/



//■return文
/*
class JSample1_1 {
	public static void main(String[] args) {
		int data[];
		
		test(15, 4);
		test(7, 0);
	}
	
	private static void test(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0で割ることはできません");
			return;
		}
		
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		return;
	}
}
/*
出力結果：
15 / 4 = 3
0で割ることはできません
*/



//■メソッドのオーバーロード
//メソッドを引数を付けて呼び出すとき、引数に記述する値のデータ型はメソッドで決められたものしか指定できない。
//そのため、同じような機能を持つメソッドであっても引数のデータ型が異なれば別々のメソッドを用意する必要がある
//Javaでは引数のデータ型や引数の数が完全に一致していなければ異なるメソッドに同じメソッド名を付けることが出来る。

class JSample1_1 {
	public static void main(String[] args) {
		System.out.println(plus(10, 7));
		System.out.println(plus(3.2, 4));
		System.out.println(plus(7, 1.223));
		System.out.println(plus(5.08, 2.4));
	}
	
	private static int plus(int n1, int n2) {
		System.out.println("int + int");
		return n1 + n2;
	}
	
	private static double plus(int n1, double d1) {
		System.out.println("int + double");
		return n1 + d1;
	}
	
	private static double plus(double d1, int n1) {
		System.out.println("double + int");
		return n1 + d1;
	}
	
	private static double plus(double d1, double d2) {
		System.out.println("double + double");
		return d1 + d2;
	}
}
/*
出力結果：
int + int
17
double + int
7.2
int + double
8.223
double + double
7.48
*/

//引数のデータ型によって呼び出されるメソッドが決まっている