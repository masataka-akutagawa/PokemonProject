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
				
			
		map.put(1,"�|�b�`���}");
		map.put(2,"�i�G�g��");
		map.put(3,"�q�R�U��");	
			
		System.out.println("�|�P��������̑I��");
		System.out.print("1:�|�b�`���}�A2:�i�G�g���A3:�q�R�U������");
		
		int number1 = scanner.nextInt();
		System.out.println("���Ȃ���" + map.get(number1) + "��I�񂾁I");//

		int enemynumber = rand.nextInt(3)+1;
		System.out.println("�����Ă�" + map.get(enemynumber) + "��I�񂾁I");
		
		
		
	}

}
