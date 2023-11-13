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
/*
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


//■文字列から指定したインデックスのUnicodeコードポイントを取得する(String.codePointAtメソッド)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg = "東京都港区赤坂";
		
		for(int i = 0; i < msg.length(); i++) {
			System.out.println(i + ";" + msg.codePointAt(i));
		}
	}
}
/*
出力結果：
0;26481
1;20140
2;37117
3;28207
4;21306
5;36196
6;22338
*/


//■文字列から開始と終了インデックスを指定して部分文字列を取得する(String.substringメソッド)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg = "東京都港区赤坂";
		
		System.out.println(msg.substring(3, 5));
		System.out.println(msg.substring(5, 7));
		System.out.println(msg.substring(3));
	}
}
/*
出力結果：
港区      //msgのインデックス3から4までの部分文字列
赤坂      //msgのインデックス5から6までの部分文字列
港区赤坂  //msgの指定された位置(ここでは3)から最後までの部分文字列
*/



//■文字列の先頭と末尾から空白文字を取り除く(String.trimメソッド,String.stripメソッド)

//String.trimメソッド(文字列の前後に空白文字が含まれる場合に、空白文字を取り除いた新しい文字列を取得)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg1 = " AB CD ";   //半角スペース
		String msg2 = "\tAB CD\n"; //水平タブと改行
		String msg3 = "　AB CD　"; //前後に全角スペース
		
		System.out.println("[" + msg1 + "]");  //①デフォルトmsg1
		System.out.println("[" + msg1.trim() + "]"); //②半角スペースを取り除く
		System.out.println("[" + msg2 + "]");  //③デフォルトmsg2
		System.out.println("[" + msg2.trim() + "]"); //④タブ、改行を取り除く
		System.out.println("[" + msg3 + "]");  //⑤デフォルトmsg3
		System.out.println("[" + msg3.trim() + "]"); //⑥(全角スペースは取り除けない)
	}
}
/*
出力結果：
[ AB CD ] //①デフォルトmsg1
[AB CD]  //②
[	AB CD
]  //③デフォルトmsg2
[AB CD]  //④
[　AB CD　]  //⑤デフォルトmsg3
[　AB CD　]  //⑥
*/



//String.stripメソッド(trimメソッドとほぼ同じ使い方)※全角スペースも取り除かれる
/*
class JSample2_1 {
	public static void main(String[] args) {
		String msg = "　AB CD　"; //全角スペース
		
		System.out.println("[" + msg + "]");  //①デフォルトmsg
		System.out.println("[" + msg.strip() + "]");  //②全角スペースを取り除く
		System.out.println("[" + msg.stripLeading() + "]");  //③先頭の空白文字だけを取り除くstripLeadingメソッド
		System.out.println("[" + msg.stripTrailing() + "]");  //④末尾の空白文字だけを取り除くstripTrailingメソッド
	}
}
/*
出力結果：
[　AB CD　]  //①デフォルトmsg
[AB CD]  //②全角スペースを取り除く
[AB CD　]  //③先頭のスペースを取り除く
[　AB CD]  //④末尾のスペースを取り除く
*/



//■文字列に含まれる文字を大文字または小文字に変換する(String.toUpperCaseメソッド、String.toLowerCaseメソッド)

//String.toUpperCaseメソッド(大文字に変換)
//String.toLowerCaseメソッド(小文字に変換)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String str1 = "TeaCup";
		String str2 = "M o u s e";
		
		System.out.println(str1);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str2);
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
	}
}
/*
出力結果：
TeaCup
TEACUP
teacup
M o u s e
M O U S E
m o u s e
*/



//■文字列の最後に別の文字列を連結する(String.concatメソッド)

//+演算子を使った文字列の連結(String.concatメソッドと同じような使い方)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String str = "東京都";
		
		System.out.println(str.concat("港区赤坂"));
		System.out.println(str + "港区赤坂");
	}
}
/*
出力結果：
東京都港区赤坂
東京都港区赤坂
*/



//■文字列の一部を別の文字や文字列に置換する(String.replaceメソッド)
/*
class JSample2_1 {
	public static void main(String[] args) {
		String str1 = "Herro Java";
		System.out.println(str1);
		System.out.println(str1.replace('r', 'l'));
		
		String str2 = "東京都港区";
		System.out.println(str2);
		System.out.println(str2.replace("港区", "中央区"));
	}
}
/*
出力結果：
Herro Java
Hello Java
東京都港区
東京都中央区
*/



//■指定した区切り文字で複数の文字列を連結し新しい文字列を作成する(String.joinメソッド)
/*
import java.util.List;

class JSample2_1 {
	public static void main(String[] args) {
		String str1 = String.join("-", "Apple", "Grape", "Melon");
		System.out.println(str1);
		
		List<String> strings = List.of("One", "Two", "Three");
		String str2 = String.join(" * ", strings);
		System.out.println(str2);
	}
}
/*
出力結果：
Apple-Grape-Melon
One * Two * Three
*/



//■文字列の中で指定した文字または文字列が出現するインデックスを取得する(String.indexOfメソッド,String.lastIndexOfメソッド)

//Stringクラスで用意されているindexOfメソッドは、対象の文字列の中で指定した文字や文字列が最初に出現するインデックスを返す
//lastIndexOfメソッドは、最後に出現するインデックスを返す

//文字が最初・最後に出現するインデックスを取得
/*
class JSample2_1 {
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str.indexOf((int)'o'));
		System.out.println(str.lastIndexOf((int)'o'));
	}
}
/*
出力結果：
4  //oが最初に出現するインデックス(Helloのo)
7  //oが最後に出現するインデックス(Worldのo)
*/



//文字列が最初・最後に出現するインデックスを取得
/*
class JSample2_1 {
	public static void main(String[] args) {
		String str = "東京都と京都府";
		
		System.out.println(str.indexOf("京都"));
		System.out.println(str.lastIndexOf("京都"));
	}
}
/*
出力結果：
1  //京都が最初に出現するインデックス(東京都 の中の 京都)
4  //京都が最後に出現するインデックス(京都府 の中の 京都)
*/




//■文字列全体が正規表現パターンとマッチするか調べる(String.matchesメソッド)

class JSample2_1 {
	public static void main(String[] args) {
		String str1 = "airplane.png";
		String str2 = "lemon.png";
		String str3 = "apple.jpeg";
		String regex = "a.+png$";
		
		System.out.println(str1.matches(regex));
		System.out.println(str2.matches(regex));
		System.out.println(str3.matches(regex));
	}
}
/*
出力結果：
true   //aから始まり、pngが続く文字列なのでtrue
false  //aから始まらないのでfalse
false  //pngじゃないのでfalse
*/