package intro_8;

//■for文繰り返し
/*
class JSample2_1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("合計=" + sum);
	}
}
/*
 * 出力結果：
 * 1
 * 2
 * 3
 * 4
 * 5
 * 合計=15
 */


//■複数の初期化式と変化式を使用
/*
class JSample2_1 {
	public static void main(String[] args) {
		int i;
		double d;
		
		for(i = 1, d = 2.4; i <= 5; i++, d += 0.1) {
			System.out.println("i = " + i + ", d = " + d);
		}
	}
}
/*
 出力結果：
i = 1, d = 2.4
i = 2, d = 2.5
i = 2, d = 2.5
i = 4, d = 2.7
i = 5, d = 2.8000000000000003
*/


//■for文のブロック内に別のfor文を記述
/*
class JSample2_1 {
	public static void main(String[] args) {
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 3; j++) {
				for(int k = 1; k < 3; k++) {
					System.out.println("i = " + i + ", j = " + j + ", k = " + k);
				}
			}
		}
	}
}
/*
 * 出力結果：
i = 1, j = 1, k = 1
i = 1, j = 1, k = 2
i = 1, j = 2, k = 1
i = 1, j = 2, k = 2
i = 2, j = 1, k = 1
i = 2, j = 1, k = 2
i = 2, j = 2, k = 1
i = 2, j = 2, k = 2
 */





//■while文繰り返し
/*
class JSample2_1 {
	public static void main(String[] args) {
		int num = 1;
		
		while(num < 100) {
			System.out.println("num = " + num);
			num *= 2;
		}
	}
}
/*
出力結果：
num = 1
num = 2
num = 4
num = 8
num = 16
num = 32
num = 64
*/


//■whileで無限ループ
//※無限ループを行いたい場合は条件式にboolean型のtrueを記述する。この場合は繰り返し処理のブロックの中で、何らかの条件を満たしたときに
//break文などを使って繰り返し処理を抜ける必要がある



//■do..while文を使った繰り返し(指定した条件式が真となる間は回数を決めずに処理を繰り返す)
/*
import java.util.Random;

class JSample2_1 {
	public static void main(String[] args) {
		int num;
		Random rand = new Random();
		
		System.out.println("6が出たら終わりです");
		
		do {
			num = rand.nextInt(6) + 1;
			System.out.println("no = " + num);
		} while (num != 6);
	}
}
/*
出力結果：
6が出たら終わりです
no = 2
no = 5
no = 1
no = 3
no = 2
no = 2
no = 6
 */


//■do..while文で無限ループ
//※無限ループを行いたい場合は条件式にboolean型のtrueを記述する。この場合は繰り返し処理のブロックの中で、何らかの条件を満たしたときに
//break文などを使って繰り返し処理を抜ける必要がある



//■拡張for文(for-each文)を使って要素を順に取得する
/*
class JSample2_1 {
	public static void main(String[] args) {
		String pref[] = {"北海道", "東京都", "神奈川県"};
		
		for(String str: pref) {
			System.out.println(str);
		}
	}
}
/*
出力結果：
北海道
東京都
神奈川県
*/



//■break文
//break文が実行されると現在の繰り返し処理を強制的に終了する
/*
class JSample2_1 {
	public static void main(String[] args) {
		int num = 1;
		
		for(int i = 0; i < 30; i++) {
			num *= 5;
			System.out.println("num = " + num);
			
			if(num > 10000) {
				System.out.println("Over 10000");
				break;
			}
		}
	}
}
/*
出力結果：
num = 5
num = 25
num = 125
num = 625
num = 3125
num = 15625
Over 10000
*/


//■繰り返し処理が多重になっている場合
//繰り返し処理が多重になっている場合にbreak文が実行された場合は、break文を含む一番内側の繰り返し処理が終了する


//■ラベル付きbreak文
//ラベル付きのbreak文にすることで任意の位置にある繰り返し処理を終了することが出来る (break ラベル;)

class JSample2_1 {
	public static void main(String[] args) {
		
		Outer:
		for(int i = 1; i < 5; i++) {
			
			Inner:
			for(int j = 1; j < 5; j++) {
				System.out.println("i * j = " + i * j);
				
				if(i * j > 10) {
					break Outer;
				}
			}
			
			System.out.println("Next");
		}
		
		System.out.println("End");
	}
}
/*
出力結果：
i * j = 1
i * j = 2
i * j = 3
i * j = 4
Next
i * j = 2
i * j = 4
i * j = 6
i * j = 8
Next
i * j = 3
i * j = 6
i * j = 9
i * j = 12
End
*/