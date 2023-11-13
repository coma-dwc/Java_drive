package intro_13;

//■mainメソッドと引数
//■コマンドライン引数の数を確認
//コマンドライン引数は任意の数を指定することが出来る。複数指定する場合はカンマではなく半角スペースを区切り文字として続けて記述

class JSample1_1 {
	public static void main(String args[]) {
		if(args.length != 2) {
			System.out.println("引数を2つ指定してください");
			System.out.println("JSample1_1 値1 値2");
			System.exit(1);
		}
		
		System.out.println("「" + args[0] + "」");
		System.out.println("「" + args[1] + "」");
	}
}
/*
出力結果：
引数を2つ指定してください
JSample1_1 値1 値2
*/

//引数を2つ指定せずに実行すると実行の仕方が表示されプログラムは終了する