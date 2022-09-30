package sabuServer;

import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class MailnServer {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,String> map = new HashMap<>();
		Random rand = new Random();
				
			
		map.put(1,"ポッチャマ");
		map.put(2,"ナエトル");
		map.put(3,"ヒコザル");	
			
		System.out.println("ポケモンを一体選べ");
		System.out.print("1:ポッチャマ、2:ナエトル、3:ヒコザル→→");
		
		int number1 = scanner.nextInt();
		System.out.println("あなたは" + map.get(number1) + "を選んだ！");//

		int enemynumber = rand.nextInt(3)+1;
		System.out.println("あいては" + map.get(enemynumber) + "を選んだ！");
		
		
		
	}

}
