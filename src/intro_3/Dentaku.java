package intro_3;


//■クラスとは：特定の目的を達成するのに必要なものを集めたもの

class Dentaku {
	public static void main(String[] args) {
		Dentaku dentaku = new Dentaku();
		dentaku.plus(10, 5);
		dentaku.minus(9, 2);
	}
	
	void plus(int val1, int val2) {
		System.out.println(val1 + val2); // 出力結果 15
	}
	
	void minus(int val1, int val2) {
		System.out.println(val1 - val2); //出力結果 7
	}
}

//Dentakuクラスでは、足し算を行うplusメソッド、引き算を行うminusメソッド、最初に呼び出されるmainメソッドの3つのメソッドがクラスの中で定義されている
