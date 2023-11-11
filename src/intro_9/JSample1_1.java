package intro_9;

//■if文を使った条件分岐
/*
class JSample1_1 {
	public static void main(String[] args) {
		System.out.println("1から10までの数値で偶数を出力します");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "は");
			
			if(i % 2 == 0) {
				System.out.println("偶数です");
			} else {
				System.out.println("奇数です");
			}
		}
	}
}
/*
出力結果：
1から10までの数値で偶数を出力します
1は奇数です
2は偶数です
3は奇数です
4は偶数です
5は奇数です
6は偶数です
7は奇数です
8は偶数です
9は奇数です
10は偶数です
*/


//■複数の条件式を組み合わせる

class JSample1_1 {
	public static void main(String[] args) {
		int[] point = {75, 94, 68};
		String[] name = {"鈴木", "本田", "遠藤"};
		
		for(int i = 0; i < 3; i++) {
			System.out.print(name[i] + "さんは");
			
			if(point[i] > 90) {
				System.out.println("判定Aです");
			} else if (point[i] > 70) {
				System.out.println("判定Bです");
			} else {
				System.out.println("判定Cです");
			}
		}
	}
}
/*
出力結果：
鈴木さんは判定Bです
本田さんは判定Aです
遠藤さんは判定Cです
*/