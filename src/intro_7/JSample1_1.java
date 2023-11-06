package intro_7;

/*
//■算術演算子
class JSample1_1 {
	public static void main(String[] args) {
		//int型の値で演算を行った結果
		System.out.println("10 + 4 = " + (10 + 4)); //出力結果：10 + 4 = 14
		System.out.println("9 - 2 = " + (9 - 2)); //出力結果：9 - 2 = 7
		System.out.println("3 * 8 = " + (3 * 8)); //出力結果：3 * 8 = 24
		System.out.println("7 / 3 = " + (7 / 3)); //出力結果：7 / 3 = 2
		System.out.println("7 % 3 = " + (7 % 3)); //出力結果：7 % 3 = 1
		
		//double型の値で演算を行った結果
		System.out.println("10.1 + 4.3 = " + (10.1 + 4.3)); //出力結果：10.1 + 4.3 = 14.399999999999999
		System.out.println("9.4 - 2.8 = " + (9.4 - 2.8)); //出力結果：9.4 - 2.8 = 6.6000000000000005
		System.out.println("3.3 * 8.1 = " + (3.3 * 8.1)); //出力結果：3.3 * 8.1 = 26.729999999999997
		System.out.println("11.4 / 3.5 = " + (11.4 / 3.5)); //出力結果：11.4 / 3.5 = 3.257142857142857
		System.out.println("11.4 % 3.5 = " + (11.4 % 3.5)); //出力結果：11.4 % 3.5 = 0.9000000000000004
	}
}
*/



/*
//■整数と浮動小数点数との演算
class JSample1_1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 4;
		
		System.out.println(num1 / num2); //出力結果：2 int型
		System.out.println(num1 / (double)num2); //出力結果：2.5 double型に型変換
	}
}
*/



/*
//■ゼロで除算した時の結果
//int型の値を0で割ったり0で割った余りを取得するとプログラムの実行時に java.lang.ArithmeticException: / by zero というエラーが発生
//double型の値を0で割る時結果を出力すると Infinity となります。0で割った余りを取得するとNaN となります。
class JSample1_1 {
	public static void main(String[] args) {
		System.out.println(10.0f / 0); //出力結果：Infinity
		System.out.println(10.0f % 0); //出力結果：NaN
	}
}
*/




//■単項マイナス演算子
class JSample1_1 {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(+num); //出力結果：10
		System.out.println(-num); //出力結果：-10
	}
}