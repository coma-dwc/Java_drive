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

