package intro_11;

//■文字列の作成

/*
//Stringクラスのコンストラクタを使用
class JSample2_1 {
	public static void main(String[] args) {
		String msg1 = "Hello";
		
		char[] c = {'B', 'y', 'e'};
		String msg2 = new String(c);
		
		String msg3 = new String(msg1);
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
	}
}
/*出力結果：
Hello
Bye
Hello
*/


//String型の変数に別の文字列を代入

class JSample2_1 {
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = msg1;
		
		System.out.println(msg1);
		System.out.println(msg2);
		
		System.out.println("----");
		
		msg2= "Bye!";
		
		System.out.println(msg1);
		System.out.println(msg2);
	}
}
/*
出力結果：
Hello
Hello
----
Hello
Bye!
*/