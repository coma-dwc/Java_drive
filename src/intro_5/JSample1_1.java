package intro_5;

/*
//■文字リテラルの表し方:シングルクォーテーションで囲む
//文字リテラルは1文字のリテラルなので、複数の文字が含まれている場合はエラーとなる(空の文字リテラルもエラーになる)
class JSample1_1 {
	public static void main(String[] args) {
		System.out.println('a'); //a と出力
		System.out.println('あ'); //あ と出力
		System.out.println('\u0061'); //a と出力
		System.out.println(0x0061); //97 と出力
		
		
		 //文字コードを使った文字を表す場合には、エスケープシーケンスの一つである形式で表します。
		 //xxxx の部分に文字コードを 16 進数で指定する(今回の場合はaと出力させるために\u0061と入力した)
		 
	}
}
*/

//■文字列リテラルの表し方：ダブルクォーテーションで囲む
//文字列リテラルは一文字でも構いません。また、空文字(0文字)でも構いません。
class JSample1_1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("こんにちは");
	}
}