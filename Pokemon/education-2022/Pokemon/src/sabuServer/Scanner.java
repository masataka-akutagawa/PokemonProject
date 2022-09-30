package sabuServer;

import java.io.*;
import java.util.Random;


public class Scanner {
	
	public static void main(String[] args)throws IOException, NumberFormatException {
		
	final int Pochama = 0;
	final int Naetoru = 1;
	final int Hikozaru = 2;
	final int Cpu_Poke = 3;
		
	final InputStreamReader isr = new InputStreamReader(System.in);
	final BufferedReader br = new BufferedReader(isr);

	// 乱数を発生する Random クラスのインスタンスを作成します。この変数も final です。
	
	
	final Random rand = new Random();
	
	
		System.out.println("ポケモンを選んでください");
	
		// あなたが出す手の値を格納する変数 yourPoke を宣言します。この変数の値は、
		// 入力の内容に応じて設定します。
		int yourPoke;
		
					
		// あなたが選ぶポケモンを読み込みます。ポッチャマ、ナエトル、ヒコザルのいずれかが入力されるまで繰り返します。
		for ( ; ; ) {
				// 入力を促す文choice を作成して表示します。
				final String choice = String.format(
					"(%d:ポッチャマ、%d:ナエトル、%d:ヒコザル) ",
					Pochama, Naetoru, Hikozaru);
					System.out.print(choice);
						
					// 入力された <Enter> までの 1 行の文字列を読み込み、変数 yourInput に代入します。
					// 次に yourInput を整数として解釈し、その値を変数 yourPoke に代入します。
					// yourInput は、値を設定したあとは参照するだけなので、final にします。
				final String yourInput = br.readLine();
				yourPoke = Integer.parseInt(yourInput);
						
				if (yourPoke == Pochama || yourPoke == Naetoru || yourPoke == Hikozaru) {
					break;
				}
						
						
						
				// 入力された値に問題があることを示すメッセージを作成し表示します。
				final String errorMessage = String.format(
					"'%s' は存在しません。%d、%d、%d のいずれかを入力してください。",
						yourInput, Pochama, Naetoru, Hikozaru);
				System.out.println(errorMessage);
		}
		
			
			
				final int cpu =rand.nextInt(Cpu_Poke);
						
				
				if(yourPoke == 0) {
					System.out.println("あなたのポケモン: ポッチャマ");
				}else if(yourPoke == 1) {
					System.out.println("あなたのポケモン: ナエトル");
				}else if(yourPoke == 2) {
					System.out.println("あなたのポケモン: ヒコザル");
				}
				
				if(cpu == 0) {
					System.out.println("あいてのポケモン: ポッチャマ");
				}else if(cpu == 1) {
					System.out.println("あいてのポケモン: ナエトル");
				}else if(cpu == 2) {
					System.out.println("あいてのポケモン: ヒコザル");
				}
					
	

	}
}