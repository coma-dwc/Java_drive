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

//今回のような簡単な場合はひとつのメソッドでまとめたほうが簡単ですが、例えば、Helloと挨拶する時とByeと挨拶する時とで、
//それぞれ異なるより複雑な処理を行うような場合には別々のメソッドにしたほうがいいかもしれません
