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
/*
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



//■文字列と文字列を比較(String.equals)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = new String(msg1);
		
		System.out.println(msg1 == msg2); //参照している文字列のオブジェクトが異なる場合はfalse
		System.out.println(msg1.equals(msg2));
	}
}
/*
出力結果：
false
true
*/



//■文字列と文字列の大きさを比較する(String.compareToメソッド)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String str1 = "東京都港区";
		String str2 = "東京都港区";
		String str3 = "東京都";
		String str4 = "東京都中央区";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.charAt(3) + ":" + Integer.toString(str1.charAt(3)));
		System.out.println(str4.charAt(3) + ":" + Integer.toString(str4.charAt(3)));
	}
}
/*
出力結果：
0    //str1とstr2の文字列は全く同じ値を持つので0
2    //str1の長さ(5文字)からstr3の長さ(3文字)を引いた2が戻り値
8194      //港と中のUnicode値の差が8194
港:28207  //str1の3番目の位置の文字(港)のUnicode値が28207
中:20013  //str4の3番目の位置の文字(中)のUnicode値が20013
*/



//■文字列の長さを取得する(String.lengthメソッド)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "東京都港区赤坂";
		
		System.out.println(msg1 + "の長さは" + msg1.length());
		System.out.println(msg2 + "の長さは" + msg2.length());
	}
}
/*
出力結果：
Helloの長さは5
東京都港区赤坂の長さは7
*/


//■文字列の文字の数(コードポイントの数)を取得する(String.codePointCountメソッド)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg1 = "東京都港区赤坂";
		String msg2 = "𪛊あ";
		
		System.out.println(msg1.codePointCount(0,  msg1.length()));
		System.out.println(msg2.codePointCount(0,  msg2.length()));
	}
}
/*
出力結果：
7
2
*/


//■文字列から指定したインデックスの文字を取得する(String.charAtメソッド)

class JSample2_1 {
	public static void main(String[] args) {
		String msg = "東京都港区赤坂";
		
		for(int i = 0; i < msg.length(); i++) {
			System.out.println(i + ";" + msg.charAt(i));
		}
	}
}
/*
出力結果：
0;東
1;京
2;都
3;港
4;区
5;赤
6;坂
*/