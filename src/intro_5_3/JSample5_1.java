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
