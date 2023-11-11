package intro_10;

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