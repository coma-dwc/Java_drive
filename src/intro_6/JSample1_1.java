package intro_6;

/*
//■Javaにおける変数とは
class JSample1_1 {
	public static void main(String[] args) {
		int sum = 58 + 72 + 90;
		System.out.println("合計" + sum); //出力結果：合計 220
		System.out.println("平均" + sum / 3); //出力結果：平均 73
	}
}
*/


/*
//■変数を宣言(同じデータ型の値を格納する複数の変数をまとめて宣言)
class JSample1_1 {
	public static void main(String[] args) {
		int old, height;
		old = 20;
		height = 184;
		
		System.out.println("年齢：" + old); //出力結果：年齢：20
		System.out.println("身長：" + height); //出力結果：身長：184
	}
}
*/


//■データ型
class JSample1_1 {
	public static void main(String[] args) {
		int n = 100; //整数のデータ型(基本 int型)
		long l = 12345678910L; //整数のデータ型(long型 きわめて大きな数値)
		double d = 3.14; //浮動小数点数のデータ型(double型 64ビット倍精度浮動小数点数)
		float f = 3.14F; //浮動小数点数のデータ型(float型 32ビット単精度浮動小数点数)
		char c = '花'; //文字のデータ型(一文字)
		boolean b = true; //論理型のデータ型
		
		System.out.println("n=" + n); //出力結果：n=100
		System.out.println("l=" + l); //出力結果：l=12345678910
		System.out.println("d=" + d); //出力結果：d=3.14
		System.out.println("f=" + f); //出力結果：f=3.14
		System.out.println("c=" + c); //出力結果：c=花
		System.out.println("b=" + b); //出力結果：b=true
	}
}