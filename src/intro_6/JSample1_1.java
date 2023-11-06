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


/*
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
*/


/*
//■変数に値を代入
class JSample1_1 {
	public static void main(String[] args) {
		int old;
		String name;
		
		old = 24;
		name = "Tarou Yamada";
		
		System.out.println(old); //出力結果：24
		System.out.println(name); //出力結果：Tarou Yamada
	}
}
*/


/*
//■変数の初期化(変数の宣言と同時に値を代入)
class JSample1_1 {
	public static void main(String[] args) {
		int old = 24;
		String name = "Tarou Yamada";
		
		System.out.println(old); //出力結果：24
		System.out.println(name); //出力結果：Tarou Yamada
	}
}
*/


/*
//■変数に別の値を代入(=新しい値を代入)
class JSample1_1 {
	public static void main(String[] args) {
		int result;
		
		result = 84;
		System.out.println(result); //出力結果：84
		
		result = 76;
		System.out.println(result); //出力結果：76
	}
}
*/


/*
//■変数の値を取り出す
class JSample1_1 {
	public static void main(String[] args) {
		int sum;
		sum = 80 + 76 + 94;
		System.out.println("合計：" + sum); //出力結果：合計：250
		
		int average;
		average = sum / 3;
		System.out.println("平均：" + average); //出力結果：平均：83
	}
}
*/



/*
//■varを使った変数宣言(※初期化で代入される値からデータ型を決定するので、必ず変数の宣言時に初期化する必要がある)
class JSample1_1 {
	public static void main(String[] args) {
		var old = 24;
		var name = "Yamada";
		
		System.out.println("年齢：" + old); //出力結果：年齢：24
		System.out.println("氏名：" + name); //出力結果：氏名：Yamada
	}
}
*/



/*
//■final変数の使い方(一度だけしか値を代入できない変数を宣言することが出来る)
//プログラムの中で繰り返し使用される値を定数として宣言し、実際の値ではなく定数を記述することで、将来的に値が変更になった場合に書き換える場所が一か所で済む
class JSample1_1 {
	public static void main(String[] args) {
		final float TAX = 0.1F;
		
		float price = 800 * (1 + TAX);
		System.out.println("料金は" + price + "です"); //出力結果：料金は880.0です
	}
}
*/



/*
//■自動的な型変換(拡大変換)
class JSample1_1 {
	public static void main(String[] args) {
		float f = 10; //float型の変数にint型の変数を代入
		double d = 1234L; //double型の変数にlong型の変数を代入
		
		System.out.println("f=：" + f); //出力結果：f=：10.0
		System.out.println("d=：" + d); //出力結果：d=：1234.0
	}
}
*/



/*
//■intやlongからfloatやdoubleへ変換するときの注意点
//(例：有効桁数が3桁であれば12.345という数値では12.3以降の数値は誤差が含まれている可能性がある)
class JSample1_1 {
	public static void main(String[] args) {
		int i1 = 123456789;
		float f1 = i1; //int型の値ををfloat型の整数に代入(誤差発生)
		System.out.println("i1=：" + i1); //出力結果：i1=：123456789
		System.out.println("f1=：" + f1); //出力結果：f1=：1.23456792E8 (誤差発生)
		
		long l2 = 1234567890123456789L;
		float f2 = l2; //long型の値をfloat型の整数に代入(誤差発生)
		double d2 = l2; //long型の値をdouble型の整数に代入(誤差発生)
		
		System.out.println("l2=：" + l2); //出力結果：l2=：1234567890123456789
		System.out.println("f2=：" + f2); //出力結果：f2=：1.23456794E18 (誤差発生)
		System.out.println("d2=：" + d2); //出力結果：d2=：1.23456789012345677E18 (誤差発生)
	}
}
*/



/*
//■キャスト演算子を使った縮小変換
class JSample1_1 {
	public static void main(String[] args) {
		double d = 123.0;
		int i = (int)d; //double型の値をint型の変数に代入
		float f = (float)d; //double型の値をfloat型の変数に代入
		
		System.out.println("d=：" + d); //出力結果：d=：123.0
		System.out.println("i=：" + i); //出力結果：i=：123
		System.out.println("f=：" + f); //出力結果：f=：123.0
	}
}
*/



/*
//■longからintやdoubleからintへ変換するときの注意点
//(例：扱う範囲が狭いデータ型に対して広いデータ型を代入する時、場合によっては入りきらない値を代入してしまう可能性がある)
//(int型の変数にlong型の値を代入した時や、int型の変数にfloat型の値を代入した場合など)
class JSample1_1 {
	public static void main(String[] args) {
		long l1 = 1234567890123456789L;
		int i1 = (int)l1;
		float f2 = 123.45f;
		int i2 = (int)f2;
		
		System.out.println("l1=：" + l1); //出力結果：l1=：1234567890123456789
		System.out.println("i1=：" + i1); //出力結果：i1=：2112454933
		System.out.println("f2=：" + f2); //出力結果：f2=：123.45
		System.out.println("i2=：" + i2); //出力結果：i2=：123
	}
}
*/



//■ラッパークラスの値を取得する
//ラッパークラスのインスタンスを作成すると、インスタンスには対応する基本データ型の値が保管されています。
//保管されている値を取得するには各クラスで定義されているメソッドを使います

class JSample1_1 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(10); //引数に指定した値を持つIntegerクラスのインスタンスを作成(保管している数値：10)
		int val = i.intValue(); //ラッパークラスのインスタンスが保管している値を対応する基本データ型の値として取得
		
		System.out.println("i = " + val); //出力結果：i = 10
	}
}
