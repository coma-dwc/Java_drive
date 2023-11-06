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



/*
//■単項マイナス演算子
class JSample1_1 {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(+num); //出力結果：10
		System.out.println(-num); //出力結果：-10
	}
}
*/



/*
//■演算子の優先順位
class JSample1_1 {
	public static void main(String[] args) {
		int n1 = 10 * 5 + 4;
		int n2 = 4 + 10 * 5;
		
		System.out.println("10 * 5 + 4 = " + n1); //出力結果：10 * 5 + 4 = 54
		System.out.println("4 + 10 * 5 = " + n2); //出力結果：4 + 10 * 5 = 54
	}
}
*/



/*
//■演算子の結合規則(優先順位が同じだった場合に、どの演算子から演算を行うのかを定めたもの)
//左結合 or 右結合 の2種類ある
class JSample1_1 {
	public static void main(String[] args) {
		int n = 10 - 5 - 3;
		
		System.out.println("10 - 5 - 3 = " + n); //出力結果：10 - 5 - 3 = 2
	}
}
*/



/*
//■括弧()を使った優先順位の変更
class JSample1_1 {
	public static void main(String[] args) {
		int n1 = 10 + 8 / 2 * 4;
		int n2 = (10 + 8 / 2) * 4;
		int n3 = ((10 + 8) / 2) * 4;
		
		System.out.println("10 + 8 / 2 * 4 = " + n1); //出力結果：10 + 8 / 2 * 4 = 26
		System.out.println("(10 + 8 / 2) * 4 = " + n2); //出力結果：(10 + 8 / 2) * 4 = 56
		System.out.println("((10 + 8) / 2) * 4 = " + n3); //出力結果：((10 + 8) / 2) * 4 = 36
	}
}
*/



/*
//■インクリメント演算子とデクリメント演算子
class JSample1_1 {
	public static void main(String[] args) {
		int num = 5;
		
		num++;
		System.out.println(num); //出力結果：6
		
		num--;
		System.out.println(num); //出力結果：5
		
		++num;
		System.out.println(num); //出力結果：6
		
		--num;
		System.out.println(num); //出力結果：5
	}
}
*/




/*
//■ビット演算子の使い方
class JSample1_1 {
	public static void main(String[] args) {
		int i1 = 85 & 15;
		int i2 = 85 | 15;
		int i3 = 85 ^ 15;
		int i4 = ~85;
		
		System.out.println("85 & 15 = " + i1); //出力結果：85 & 15 = 5 (論理積：ビットAND)
		System.out.println("85 | 15 = " + i2); //出力結果：85 | 15 = 95 (論理和：ビットOR)
		System.out.println("85 ^ 15 = " +i3); //出力結果：85 ^ 15 = 90 (排他的論理和：ビットXOR)
		System.out.println("~85 = " + i4); //出力結果：~85 = -86 (反転：ビットNOT)
	}
}
*/





//■シフト演算子の使い方
class JSample1_1 {
	public static void main(String[] args) {
		int i1 = 21 << 2;
		int i2 = 21 >> 2;
		int i3 = 21 >>> 2;
		
		System.out.println("21 << 2 = " + i1); //出力結果：21 << 2 = 84
		System.out.println("21 >> 2 = " +i2); //出力結果：21 >> 2 = 5
		System.out.println("21 >>> 2 = " +i3); //出力結果：21 >>> 2 = 5
		
		int i4 = -92 >> 2;
		int i5 = -92 >>> 2;
		
		System.out.println("-92 >> 2 = " +i4); //出力結果：-92 >> 2 = -23
		System.out.println("-92 >>> 2 = " +i5); //出力結果：-92 >>> 2 = 1073741801
	}
}
