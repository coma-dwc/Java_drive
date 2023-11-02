package intro_5_3;

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