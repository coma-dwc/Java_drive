package intro_14;

//■例外処理

//■例外とは
/*
class JSample1_1 {
	public static void main(String args[]) {
		int n = 10;
		
		if(n == 10{    // )がないのでコンパイルエラーが発生する
			System.out.println("10です");
		}
	}
}
/*
出力結果：
コンパイルエラー
*/



//実行時のエラー
/*
class JSample1_1 {
	public static void main(String args[]) {
		int n[] = {18, 29, 36};
		
		System.out.println("開始します");
		
		for(int i = 0; i < 4; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("終了しました");
	}
}
/*
出力結果：
開始します
18
29
36
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at intro_14.JSample1_1.main(JSample1_1.java:32)
*/

//途中でエラーが発生 → 配列の要素が3つしかないのに4つ目の要素を参照しようとしたため
//Javaではこのようにプログラムの実行中にエラーが発生することを「例外」が発生したと言う

//「例外」が発生した時に単にプログラムを終了させるのではなく指定した動作をさせるための仕組みが用意されている。それが「例外処理」と呼ばれるもの




//■try文
//例外処理を行うにはtry文を使用する
/*
class JSample1_1 {
	public static void main(String args[]) {
		int n[] = {18, 29, 36};
		
		System.out.println("開始します");
		
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(n[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲を超えています");
		}
		
		System.out.println("終了しました");
	}
}
/*
出力結果：
開始します
18
29
36
配列の範囲を超えています
終了しました
*/

//例外が発生してもエラーメッセージは表示されずcatchブロック内に記述した処理が実行されている。
//そしてプログラムも途中で終了することなくtry文以降の分も実行されている



//■必ず実行する処理の記述(try..catch..finally)
//finallyブロックに記述した処理は例外が発生してもしなくても必ず実行される。
//また、catchブロック内でreturn文が実行されて呼び出し元へ処理が移る場合でもfinallyブロック内の処理は実行されている

class JSample1_1 {
	public static void main(String args[]) {
		disp(1);
		disp(2);
		disp(3);
	}
	
	private static void disp(int no) {
		int n[] = {18, 29, 36};
		
		try {
			System.out.println(n[no]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲を超えています");
			return;
		}
		finally {
			System.out.println("要素の出力を終了します");
		}
	}
}
/*
出力結果：
29
要素の出力を終了します
36
要素の出力を終了します
配列の範囲を超えています
要素の出力を終了します
*/