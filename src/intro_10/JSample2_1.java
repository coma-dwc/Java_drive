package intro_10;
/*
import java.util.Arrays;

//■配列の宣言と作成
/*
class JSample2_1 {
	public static void main(String[] args) {
		int[] result = new int[3];
		
		result[0] = 75;
		result[1] = 88;
		result[2] = 82;
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println(result[i]);
		}
	}
}
/*
出力結果：
75
88
82
*/



//■配列要素へのアクセスとインデックス
/*
class JSample2_1 {
	public static void main(String[] args) {
		int[] num = new int[4];
		
		num[0] = 10;
		num[1] = 8;
		num[2] = 16;
		num[3] = 5;
		
		for(int i = 0; i < 4 ; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
}
/*
出力結果：
num[0] = 10
num[1] = 8
num[2] = 16
num[3] = 5
*/



//■配列の要素の初期化と規定値
/*
class JSample2_1 {
	public static void main(String[] args) {
		int[] i = new int[1];
		System.out.println("int : " + i[0]);
		
		long[] l = new long[1];
		System.out.println("long : " + l[0]);
		
		double[] d = new double[1];
		System.out.println("double : " + d[0]);
		
		boolean[] b = new boolean[1];
		System.out.println("boolean : " + b[0]);
		
		String[] str = new String[1];
		System.out.println("String : " + str[0]);
	}
}
/*
出力結果：
int : 0
long : 0
double : 0.0
boolean : false
String : null
*/



//■作成済みの配列変数に初期値を代入する
//String型の配列を宣言すると同時に初期化を行う そのあとで配列の要素を順に参照して画面に表示している
/*
class JSample2_1 {
	public static void main(String[] args) {
		String[] str = {"Apple", "Orange", "Melon"};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(str[i]);
		}
	}
}
/*
出力結果：
Apple
Orange
Melon
*/



//■配列の長さを取得する(length)
//配列の長さとは配列に含まれる要素の数
/*
class JSample2_1 {
	public static void main(String[] args) {
		double[] num = new double[3];
		
		num[0] = 5.24;
		num[1] = 8.0;
		num[2] = 12.375;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
}
/*
出力結果：
num[0] = 5.24
num[1] = 8.0
num[2] = 12.375
*/



//■多次元配列を作成する
//配列の要素に別の配列が格納されている配列を2次元配列
//配列の要素に2次元配列が格納されているのを3次元配列などと呼び
//総称して多次元配列と呼ぶ
/*
class JSample2_1 {
	public static void main(String[] args) {
		int[][] num = new int[2][];
		
		num[0] = new int[3];
		num[0][0] = 78;
		num[0][1] = 64;
		num[0][2] = 59;
		
		num[1] = new int[3];
		num[1][0] = 58;
		num[1][1] = 92;
		num[1][2] = 82;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
}
/*
出力結果：
num[0][0] = 78
num[0][1] = 64
num[0][2] = 59
num[1][0] = 58
num[1][1] = 92
num[1][2] = 82
*/



//■多次元配列の初期化
/*
class JSample2_1 {
	public static void main(String[] args) {
		int[][] num = {{87, 54, 67}, {76, 92, 48}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
}
/*
出力結果：
num[0][0] = 87
num[0][1] = 54
num[0][2] = 67
num[1][0] = 76
num[1][1] = 92
num[1][2] = 48
*/



//■多次元配列の長さを取得する(length)
/*
class JSample2_1 {
	public static void main(String[] args) {
		int[][] num = {{87, 54}, {76, 92, 48, 58, 84}};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
}
/*
出力結果：
num[0][0] = 87
num[0][1] = 54
num[1][0] = 76
num[1][1] = 92
num[1][2] = 48
num[1][3] = 58
num[1][4] = 84
*/
//int型のデータを格納する配列を格納する2次元配列を作成し、要素に対してそれぞれ値を格納した後で
//すべての要素の値を順番に参照して画面に表示した。
//繰り返しの回数はlengthフィールドの値を参照しているので、配列の要素がそれぞれ異なっている場合でも大丈夫



//■配列のすべての要素を指定した値で埋める(fill)
//配列を宣言し配列を作成した後、要素に値を代入することが出来るが、Arrays.fillメソッドを使用することで全ての要素に対して特定の値を代入することが出来る
//Arrays.fillメソッドを使って配列のすべての要素を指定した値で埋める方法
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[] a = new int[3];
		Arrays.fill(a, 10);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}
/*
出力結果：
10
10
10
*/


//■配列をコピーする(シャローコピーとディープコピー)
//独立した配列としてコピーするには手動でひとつひとつ要素を代入していくか、Arrayクラスのメソッドを使用する
//例）Arrays.copyOfメソッド / System.arraycopy?メソッド (コピー元の要素に格納されている値がint型など基本データ型の場合は問題なし)

//コピーした時に要素の参照先をコピーする方式をshallowコピー
//要素の値が参照型だった場合、参照先をコピーするのではなく参照しているインスタンスそのものを複製し、その参照先を要素に格納する方式をdeepコピー


//■配列の指定範囲の要素から新しい配列を作成する(copyOfRange)

//配列をまるまるコピーして新しい配列を作るにはArrays.copyOfメソッドを使用
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[] src = {12, 24, 18, 35, 21};
		int[] dst = Arrays.copyOfRange(src, 1, 4);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dst));
	}
}
/*
出力結果：
[12, 24, 18, 35, 21]
[24, 18, 35]
*/



//■2つの配列を連結して新しい配列を作成する
//配列のコピーで使用したSystem.arraycopyメソッドを使用して手動で配列と配列を連結して新しい配列を作成することが出来る
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[] src1 = {28, 14, 35, 19};
		int[] src2 = {17, 40, 23};
		int[] dst = new int[src1.length + src2.length];
		
		System.arraycopy(src1, 0, dst, 0, src1.length);
		System.arraycopy(src2, 0, dst, src1.length, src2.length);
		
		System.out.println(Arrays.toString(src1));
		System.out.println(Arrays.toString(src2));
		System.out.println(Arrays.toString(dst));
	}
}
/*
出力結果：
[28, 14, 35, 19]
[17, 40, 23]
[28, 14, 35, 19, 17, 40, 23]
*/



//■2つの配列の要素の値を比較する(equals,deepEquals)


//Arrays.equalsメソッドを使って比較する
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[] a = {85, 78, 92};
		int[] b = a;
		int[] c = {85, 78, 92};
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println(Arrays.equals(a,  b));
		System.out.println(Arrays.equals(a,  c));
		System.out.println(Arrays.equals(b,  c));
	}
}
/*
出力結果：
true
false
false
true
true
true
*/


//■Arrays.deepEqualsメソッドを使って比較する
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[][] a = {{10, 8}, {9, 14}};
		int[][] b = a;
		int[][] c = {{10, 8}, {9, 14}};
		
		System.out.println(Arrays.equals(a,  b));
		System.out.println(Arrays.equals(a,  c));
		System.out.println(Arrays.equals(b,  c));
		System.out.println(Arrays.deepEquals(a,  b));
		System.out.println(Arrays.deepEquals(a,  c));
		System.out.println(Arrays.deepEquals(b,  c));
	}
}
/*
 * 出力結果：
 * true
false
false
true
true
true
*/



//■配列の要素を逆順に並び替える
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[] src = {12, 24, 18, 31, 17};
		System.out.println(Arrays.toString(src));
		
		for(int f = 0, l = src.length - 1; f < l; f++, l--) {
			int temp = src[f];
			src[f] = src[l];
			src[l] = temp;
		}
		
		System.out.println(Arrays.toString(src));
	}
}
/*
出力結果：
[12, 24, 18, 31, 17]
[17, 31, 18, 24, 12]
*/



//■配列の要素を昇順・降順にソートする(sort) 
//Arrays.sortメソッドを使用

/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[] src = {12, 24, 18, 35, 21};
		System.out.println(Arrays.toString(src));
		
		Arrays.sort(src);
		System.out.println(Arrays.toString(src));
	}
}
/*
出力結果：
[12, 24, 18, 35, 21]
[12, 18, 21, 24, 35]
*/



//■配列の文字列表現を取得する(toString,deepToString)
//Arrays.toString メソッドを使用すると配列の要素に格納された値を使って配列を文字列で表現したものを取得することができる

//配列の文字列表現を取得
/*
import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		double[] src = {3.75, 0.52, 14.1};
		
		System.out.println(src);
		System.out.println(Arrays.toString(src));
	}
}
/*
出力結果：
[D@5ca881b5
[3.75, 0.52, 14.1]
*/


//多次元配列の場合の文字列表現を取得

import java.util.Arrays;

class JSample2_1 {
	public static void main(String[] args) {
		int[][] src = {{32, 18}, {12, 27}};
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.deepToString(src));
	}
}
/*
出力結果：
[[I@5ca881b5, [I@24d46ca6]
[[32, 18], [12, 27]]
*/