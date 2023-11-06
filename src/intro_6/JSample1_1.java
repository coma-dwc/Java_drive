package intro_6;

/*
//■Javaにおける変数とは
class JSample1_1 {
	public static void main(String[] args) {
		int sum = 58 + 72 + 90;
		System.out.println("合計" + sum);
		System.out.println("平均" + sum / 3);
	}
}
*/


//■変数を宣言(同じデータ型の値を格納する複数の変数をまとめて宣言)
class JSample1_1 {
	public static void main(String[] args) {
		int old, height;
		old = 20;
		height = 184;
		
		System.out.println("年齢：" + old);
		System.out.println("身長：" + height);
	}
}