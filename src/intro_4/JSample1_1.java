package intro_4;

//■デフォルトエンコーディングを確認する
/*
class JSample1_1 {
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.encoding")); //出力結果：UTF-8
	}
}
*/

//エンコーディングとしてShift_JISを選択する↓
//Eclipse上での方法：このファイル右クリック→プロパティ→リソース→テキストファイルエンコード→その他を選択(通常はデフォルトが選択してありUTF-8)→種類を選ぶ
//UTF-8以外だと文字化けする
class JSample1_1 {
	public static void main(String[] args) {
		System.out.println("こんにちは");
	}
}