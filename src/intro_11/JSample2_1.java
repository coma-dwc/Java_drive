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
/*
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



//■数値を文字列に変換

//ラッパークラスのtoStringメソッドを使用
/*
class JSample2_1 {
	public static void main(String[] args) {
		int i = 10;
		long l = 12L;
		double d = 7.82;
		boolean b = true;
		
		String si = Integer.valueOf(i).toString();
		String sl = Long.valueOf(l).toString();
		String sd = Double.valueOf(d).toString();
		String sb = Boolean.valueOf(b).toString();
		
		System.out.println(si);
		System.out.println(sl);
		System.out.println(sd);
		System.out.println(sb);
	}
}
/*
出力結果：
10
12
7.82
true
*/



//StringクラスのvalueOfメソッドを使用
/*
class JSample2_1 {
	public static void main(String[] args) {
		int i = 10;
		short s = 21;
		long l = 12L;
		double d = 7.82;
		boolean b = true;
		
		String si = String.valueOf(i);
		String ss = String.valueOf(s);
		String sl = String.valueOf(l);
		String sd = String.valueOf(d);
		String sb = String.valueOf(b);
		
		System.out.println(si);
		System.out.println(ss);
		System.out.println(sl);
		System.out.println(sd);
		System.out.println(sb);
	}
}
/*
出力結果：
10
21
12
7.82
true
*/



//+演算子を使って文字列と連結
/*
class JSample2_1 {
	public static void main(String[] args) {
		int i = 10;
		long l = 12L;
		double d = 7.82;
		boolean b = true;
		
		String si = "" + i;
		String sl = "" + l;
		String sd = "" + d;
		String sb = "" + b;
		
		System.out.println(si);
		System.out.println(sl);
		System.out.println(sd);
		System.out.println(sb);
	}
}
/*
出力結果：
10
12
7.82
true
*/




//■文字列を数値に変換

//ラッパークラスのparseIntメソッドを使用
/*
class JSample2_1 {
	public static void main(String[] args) {
		String si = "42";
		String sd = "2.84";
		String sb = "false";
		
		int i = Integer.parseInt(si);
		double d = Double.parseDouble(sd);
		boolean b = Boolean.parseBoolean(sb);
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}
}
/* 
出力結果：
42
2.84
false
*/


//ラッパークラスのvalueOfメソッドを使用

class JSample2_1 {
	public static void main(String[] args) {
		String si = "42";
		String sd = "2.84";
		String sb = "false";
		
		int i = Integer.valueOf(si).intValue();
		double d = Double.valueOf(sd).doubleValue();
		boolean b = Boolean.valueOf(sb).booleanValue();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}
}
/*
出力結果：
42
2.84
false
*/