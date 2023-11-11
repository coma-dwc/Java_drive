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