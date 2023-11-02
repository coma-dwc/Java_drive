package intro_3_2;


//■メソッドとは：クラスの中で特定の処理を行うために必要なプログラムをまとめたもの
//以下、挨拶だけを行うロボットのクラスを定義する

/*
class Robot {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.hello();
		robot.bye();
	}
	
	void hello() {
		System.out.println("Hello");
	}
	
	void bye() {
		System.out.println("Bye");
	}
}
*/

//Robotクラスでは、挨拶を行うhelloメソッドとbyeメソッド、それに最初に呼び出されるmainメソッドの3つのメソッドがクラスの中で定義されています。
//今回はHelloとByeをそれぞれ別の目的としてメソッドを分けましたが、挨拶というメソッドにまとめた場合は次のようになります

/*
class Robot {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.greeting("Hello");
		robot.greeting("Bye");
	}
	
	void greeting(String msg) {
		System.out.println(msg);
	}
}
*/

//今回のような簡単な場合はひとつのメソッドでまとめたほうが簡単ですが、例えば、Helloと挨拶する時とByeと挨拶する時とで、
//それぞれ異なるより複雑な処理を行うような場合には別々のメソッドにしたほうがいいかもしれません




//■フィールドとは：クラスの中でデータの値を保管するために使用するもの
//以下、先ほどのロボットのクラスを修正して、ロボットを動かすためのメソッドと現在位置を保管するためのフィールドを追加する

class Robot {
	int currentPosition = 0; //データ型がint フィールド名がcurrentPosition
	
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.report();
		robot.moveForward();
		robot.report();
	}
	
	void report() {
		System.out.println("Current Position = " + currentPosition); //reportメソッド：現在位置を画面に表示
	}
	
	void moveForward() {
		currentPosition = currentPosition + 1; //moveForwardメソッド：現在地から一つ前進する
	}
}

//moveForwardメソッドが呼び出されると、ロボットは現在位置から一つ前進します。
//この時現在地を保管するために使用するのがcurrentPositionフィールドです。
//そしてreportメソッドを呼び出すとcurrentPositionフィールドに保管されている現在位置を画面に表示します。
//このようにフィールドを用意することで、あとで使用する可能性があるデータを保管しておくことが出来ます