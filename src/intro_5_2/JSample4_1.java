package intro_5_2;

//■エスケープシーケンス：キーボードから入力できないような文字
/*
\b バックスペース
\t 水平タブ
\n 改行
\r 復帰
\f 改ページ
\' シングルクォーテーション
\" ダブルクォーテーション
\\ \文字
\ooo 8進数の文字コードが表す文字
*/

class JSample4_1 {
	public static void main(String[] args) {
		System.out.println('\''); //出力結果 '
		System.out.println("私の名前は\"鈴木\"です"); //出力結果 私の名前は"鈴木"です
		System.out.println("この魚の値段は\\250です"); //出力結果 この魚の値段は\250です
	}
}