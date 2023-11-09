package test;

public class Test { //基本的にmainメソッドで実行できます。コードを書かない設問に関しては、心の中で呟く程度でOKです。
					//配列、ループ構造は1からコードを書く必要があります。

	//Chapter4 配列

	/*1.配列の要素をすべて合計するプログラムを書け。
	 */
	//	public static void main(String[] args) {
	//		int[] num = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
	//		int sum = Arrays.stream(num).sum();
	//		System.out.println(sum);
	//	};
	/* 
	 * 
	 * 2.配列の最大値を見つけるプログラムを書け。
	 */
	//	public static void main(String[] args) {
	//		int[] nums = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
	//		System.out.println(getMaxNum(nums));
	//	};
	//
	//	private static int getMaxNum(int[] numArray) {
	//		int maxNum = 0;
	//
	//		for (int num : numArray) {
	//			if (num > maxNum)
	//				maxNum = num;
	//		}
	//
	//		return maxNum;
	//	}
	/* 
	 * 3.配列内の特定の要素を探すプログラムを書け。
	 */
	//	public static void main(String[] args) {
	//		String[] strAry = { "a", "b", "c", "d", "e", "f" };
	//		String searchStr = "a";
	//		System.out.println(getTargetStr(strAry, searchStr));
	//	};
	//
	//	private static String getTargetStr(String[] strAry, String searchStr) {
	//		String targetStr = "not contains";
	//
	//		for (String str : strAry) {
	//			if (searchStr.equals(str))
	//				targetStr = str;
	//		}
	//		return targetStr;
	//	}

	/* 4.配列を逆順にするプログラムを書け。　*/
	//		public static void main(String[] args) {
	//			String[] strAry = new String[]{ "a", "b", "c", "d", "e", "f" };
	//			System.out.println(Arrays.toString(getReverseStrAry(strAry)));
	//		}
	//	
	//		private static String[] getReverseStrAry(String[] strAry) {
	//			String[] rvsStrAry = new String[strAry.length];
	//	
	//			for (int i = 0; i < strAry.length; i++) {
	//				rvsStrAry[strAry.length - 1 - i] = strAry[i];
	//			}
	//			return rvsStrAry;
	//		}
	/* 
	* 
	/* 5.配列内の重複要素を見つけるプログラムを書いてください。
	*/

	//	public static void main(String[] args) {
	//			int[] numAry = { 1, 2, 3, 4, 5, 6, 4, 3, 2, 6, 7, 8, 5, 3, 2, 5, 7 };
	//			int[] delNumAry = deleteDuplicationNum(numAry);
	//			System.out.println(Arrays.toString(delNumAry));
	//		System.out.println(Arrays.toString(numAry));

	//		int num[] = { 1, 2, 3, 4, 5, 6, 1, 7, 8, 9, 1, 6 };
	//		
	//		Set set = new HashSet(); //重複確認用
	//		for (int duplicateCheck : num) {
	//			//setに追加してみて、追加できなかった(重複していた)場合
	//			if (!set.add(duplicateCheck)) {
	//				System.out.println(duplicateCheck + "が重複しています。");
	//			}
	//		}
	//	};

	//		private static int[] deleteDuplicationNum(int[] numAry) {
	//			int[] delNumAry;
	//			delNumAry = Arrays.stream(numAry).distinct().toArray();
	//	
	//			return delNumAry;
	//	
	//		}

	/* 6. 次のmainメソッドの中から、エラーが発生する箇所を選べ(発生しないことも考慮)。※エディタにコピペする前に考えてみて。
	* 
	//	* public class Main { */
	//	public static void main(String[] args) {
	//		int[] a;
	//		int[][] c;
	//		
	//		int d[][];
	//		int[] e[];
	//		int b[]; 
	//		int[][] f[];
	//	};
	/*}
	* 
	* */

	//Chapter5 ループ構造　

	/*1. 1から10までの数字を印刷するプログラムを書け
	 * 
	 * 。
	 */
	//	public static void main(String[] args) {
	//		for(int i = 1; i <= 10; i++) {
	//			System.out.println(i);
	//		}
	//	}
	/* 
	* 2. 与えられた整数nまでの全ての偶数を印刷するプログラムを書け。※ここでは、n=10とする。 */
	//	 	public static void main(String[] args) {
	//	 		printEvenNumber(10);
	//	}
	//	 	
	//	 	private static void printEvenNumber(int num) {
	//	 		for(int i = 1; i <= num; i ++) {
	//	 			if(i % 2 == 0) System.out.println(i);
	//	 		}
	//	 	}
	/* 3. 与えられた配列の各要素を印刷するプログラムを書け。※拡張for文で回答してください。
	* 
	* 
	*/

	//	public static void main(String[] args) {
	//		List<String> strList = Arrays.asList("Java", "Python", "C#", "javaScript", "C++", "VB", "PHP", "HTML", "CSS");
	//		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 5, 4, 3, 3, 5, 6);
	//		List<Boolean> boolList = Arrays.asList(true, false, true, true, false, true, false);
	//		
	//		String[] strList = {"Java", "Python", "C#", "javaScript", "C++", "VB", "PHP", "HTML", "CSS"};
	//		Integer[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 8, 5, 4, 3, 3, 5, 6};
	//		Boolean[] boolList = {true, false, true, true, false, true, false};
	//
	//		getData(strList);
	//		getData(numList);
	//		getData(boolList);
	//	}

	//	private static <T> void getData(List<T> list) {
	//		list.forEach(data -> {
	//			System.out.println(data);
	//		});
	//	}

	//	private static <T> void getData(T[] array) {
	//		for (T data : array) {
	//			System.out.println(data);
	//		}
	//	}

	/* 4. 10から1までカウントダウンするプログラムを書け。
	 * 
	 */
	//	public static void main(String[] args) {
	//		for (int i = 10; i >= 1; i--) {
	//			System.out.println(i + "秒前");
	//		}
	//	}

	/* 5. 'n' 回 "Hello, World!" を印刷するプログラムを書け。ただし、'n' はユーザーが入力した回数です。※Scanneを使います。
	*/
	//	public static void main(String[] args) {
	//		Scanner scanner = new Scanner(System.in);
	//
	//		// 入力を促すメッセージ
	//		System.out.print("数字を入力してください > ");
	//
	//		//入力された内容をインスタンスから取得
	//		int input_num = scanner.nextInt();
	//
	//		for (int i = 0; i < input_num; i++) {
	//			System.out.println("Hello, World!");
	//		}
	//
	//		// Scannerクラスのインスタンスをクローズ
	//		scanner.close();
	//	}
	/* */

	//---------------------------------------------------------//

	//Chapter6 メソッドとカプセル化

	/*1.メソッドとは？
	 * 
	 * 一連の処理をまとめたもの
	 * 
	 * 2.カプセル化とは？
	 * 
	 * 修飾子によってアクセス制限すること
	 * 
	 * 3. privateアクセス修飾子の役割は？
	 * 
	 * 同じクラス内でのみ呼び出しを可能にする
	 * 
	 * 4.メソッドが値を返さない場合のキーワードは？
	 * 
	 * void
	 * 
	 * 5.オーバーロードとは？
	 * 
	 * 同じメソッド名で引数の数を変更する
	 * 
	 * */

	//---------------------------------------------------------//

	//Chapter7 継承

	/*1. 次のAnimalクラスを継承するDogサブクラスを作成し、
	 * AnimalクラスのmakeSoundメソッドをオーバーライドして、
	 * 「Bark!」と印刷するようにコードを完成させよ。
	 * 
	//	 */
	//	class Animal {
	//		static void makeSound() {
	//			System.out.println("Animal makes a sound");
	//		}
	//	}
	//
	//	class Dog extends Animal {
	//		static void makeSound() {
	//			System.out.println("Bark!");
	//		}
	//	}
	//
	//	public static void main(String[] args) {
	//		Dog.makeSound();
	//	};

	/* 2. 次のBicycleクラスを継承するMountainBikeクラスを作成し、
	* MountainBikeクラスにgear属性を追加せよ。
	* また、MountainBikeクラスのコンストラクタを完成させ、
	* gear属性を設定せよ。
	* 
	*/
	//	class Bicycle {
	//		int speed;
	//
	//		public Bicycle(int startSpeed) {
	//			speed = startSpeed;
	//		}
	//
	//		void applyBrake(int decrement) {
	//			speed -= decrement;
	//		}
	//
	//		void speedUp(int increment) {
	//			speed += increment;
	//		}
	//	}
	//
	//	class MountainBike extends Bicycle {
	//		int gear;
	//
	//		public MountainBike(int speed, int gear) {
	//			super(speed);
	//			this.gear = gear;
	//		}
	//
	//	}
	//
	//	public static void main(String[] args) {
	//		Test test = new Test();
	//		MountainBike bike = test.new MountainBike(100, 6);
	//
	//		System.out.println(bike.speed);
	//		System.out.println(bike.gear);
	//	}

	/*
	
	//---------------------------------------------------------//
	
	//Chapter8 例外処理
	
	/*1.次のプログラムは、整数の除算を行うメソッドdivideNumbersが含まれている。
	* 0による除算を試みるとArithmeticExceptionが発生する。この例外をキャッチして、
	* 「0で割れません。」というメッセージを印刷するようにtry-catchブロックを完成させよ。
	* 
	*/

	//	public class ExceptionTest {
	//	public static int divideNumbers(int num1, int num2) {
	//		return num1 / num2;
	//	}
	//
	//	public static void main(String[] args) {
	//		int a = 10;
	//		int b = 0;
	//		try {
	//			int result = divideNumbers(a, b);
	//			System.out.println("Result: " + result);
	//		} catch (ArithmeticException e) {
	//			System.out.println("0で割れません");
	//		}
	//	}
	//	}

	/* 2.次のプログラムでは、ファイルからテキストを読み取る処理を行っている。
	* ファイルが存在しない場合はFileNotFoundExceptionが発生する。
	* この例外をキャッチして、「ファイルがない。」というメッセージを印刷するようにtry-catchブロックを完成させてください。
	* 
	*/

	//		public class FileReadTest {
	//	public static void main(String[] args) {
	//	   try {
	//	   FileReader reader = new FileReader("nonexistentfile.txt");
	//	   // 他のファイル読み取り処理
	//	   } catch (FileNotFoundException e) { // <- ここを埋めてください
	//	   System.out.println("ファイルがない。");  // <- ここを埋めてください
	//	   }
	//	}
	//		}
	/*
	**/

	//---------------------------------------------------------//
};