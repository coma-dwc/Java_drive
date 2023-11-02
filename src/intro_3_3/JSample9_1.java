package intro_3_3;

import java.time.LocalDate; //import宣言(eclipseだと以下のコードを書いてCtrl+Sすると自動で追記された)

//■import文を使用：import文を使ってクラスをインポート宣言すると、パッケージ名を省略してクラス名だけでプログラムの中に記述できるようになる

class JSample9_1 {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
	System.out.println(ld);
	}
}

//パッケージ名を含めたクラス名のことを完全修飾名と呼ぶのに対して、クラス名だけのことを単純名と呼びます
//完全修飾名で記述すればimport宣言は必須ではありませんが、通常は使用するクラス名をimport宣言を行った後で単純名でクラス名を記述します


/*
■import宣言の記述方法

import宣言を行う方法として、特定のクラスごとに一つ一つ行う方法と、同じパッケージに含まれるクラスをまとめて行う方法がある。

・特定のクラス毎に一つ一つ行う方法
例）java.util.regexパッケージに含まれるPatternクラスと、Matcherクラスのimport宣言を行うには…

import java.util.regex.Pattern;
import java.util.regex.Matcher;

・同じパッケージに含まれるクラスをまとめてimport宣言する方法
import java.util.regex.*;

*/