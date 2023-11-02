package intro_5_3;

/*
//■整数リテラル：整数の値　10進数の他に2進数、8進数、16進数でも表すことが出来る
//整数リテラルは計算をする場合に使ったり、繰り返し回数をカウントする場合に使用される

class JSample5_1 {
	public static void main(String[] args) {
		System.out.println(123); //出力結果 123
		System.out.println(0x3F01); //出力結果 16129
		System.out.println(45 + 75); //出力結果 120
	}
}
//整数は10進数で記述してあっても、16進数で記述してあっても違いはなく、単に出力すると10進数の値として出力されます
*/



//■浮動小数点数リテラル：小数点以下の部分を持つ実数の値です。
//「3.14」等のような表し方の他に、「1.712e2」のような指数表現でも表すことが出来ます　非常に大きな・小さな数値を表すことが出来ます

//※指数表現のJavaでの書式→ [仮数部] e [符号] [指数部]

/*
class JSample5_1 {
	public static void main(String[] args) {
		System.out.println(18.225); //出力結果 18.225
		System.out.println(5.23e3); //出力結果 5230.0
		System.out.println(1.816e10); //出力結果 1.816E10
		System.out.println(7.5e-2); //出力結果 0.075
		System.out.println(2.712e-6); //出力結果 2.712E-6
		System.out.println(3.52 + 17.4); //出力結果 20.919999999999998
	}
}
*/


//■数値リテラルにサフィックスを付けて型を指定する
//整数リテラルは特に指定しない場合int型、浮動小数点数リテラルはdouble型として扱われる
//例えば整数の場合にint型の範囲を超えた数値を整数リテラルとして記述するとコンパイルエラーになる
//このような場合に、型を明確にするサフィックスを値の最後に付けることでより大きな数値を扱えるlong型の値として大きな整数を記述できる

/*
class JSample5_1 {
	public static void main(String[] args) {
		System.out.println(2200000000L); //出力結果 2200000000
	}
}
*/


//■浮動小数点数リテラルのサフィックス
//浮動小数点数リテラルの場合もサフィックスを付けることが出来、Dまたはdを付けた場合はdouble型
//Fまたはfを付けた場合はfloat型になります

/*
float num;

num = 7.8;  //コンパイルエラー
num = 7.8F; //問題なし
*/




//■数値リテラルに桁区切り文字を記述する
//Javaにおいてアンダーバーで区切る(カンマは別の用途で使用しているため)
//10進数だけでなく、2進数や16進数、浮動小数点数でも桁区切り文字を記述することが出来る
//例) 0b1_11_11_10_10   0x3f02_ef01   3.14_15_78

/*
class JSample5_1 {
	public static void main(String[] args) {
		System.out.println(1_234_567); //出力結果 1234567
		System.out.println(0b10_11_01_10); //出力結果 182
	}
}
*/




//■論理値リテラル：trueまたはfalse

class JSample5_1 {
	public static void main(String[] args) {
		System.out.println(10 > 7); //出力結果 true
		System.out.println(5 == 4); //出力結果 false
	}
}
