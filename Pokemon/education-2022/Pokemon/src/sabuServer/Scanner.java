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

	// �����𔭐����� Random �N���X�̃C���X�^���X���쐬���܂��B���̕ϐ��� final �ł��B
	
	
	final Random rand = new Random();
	
	
		System.out.println("�|�P������I��ł�������");
	
		// ���Ȃ����o����̒l���i�[����ϐ� yourPoke ��錾���܂��B���̕ϐ��̒l�́A
		// ���͂̓��e�ɉ����Đݒ肵�܂��B
		int yourPoke;
		
					
		// ���Ȃ����I�ԃ|�P������ǂݍ��݂܂��B�|�b�`���}�A�i�G�g���A�q�R�U���̂����ꂩ�����͂����܂ŌJ��Ԃ��܂��B
		for ( ; ; ) {
				// ���͂𑣂���choice ���쐬���ĕ\�����܂��B
				final String choice = String.format(
					"(%d:�|�b�`���}�A%d:�i�G�g���A%d:�q�R�U��) ",
					Pochama, Naetoru, Hikozaru);
					System.out.print(choice);
						
					// ���͂��ꂽ <Enter> �܂ł� 1 �s�̕������ǂݍ��݁A�ϐ� yourInput �ɑ�����܂��B
					// ���� yourInput �𐮐��Ƃ��ĉ��߂��A���̒l��ϐ� yourPoke �ɑ�����܂��B
					// yourInput �́A�l��ݒ肵�����Ƃ͎Q�Ƃ��邾���Ȃ̂ŁAfinal �ɂ��܂��B
				final String yourInput = br.readLine();
				yourPoke = Integer.parseInt(yourInput);
						
				if (yourPoke == Pochama || yourPoke == Naetoru || yourPoke == Hikozaru) {
					break;
				}
						
						
						
				// ���͂��ꂽ�l�ɖ�肪���邱�Ƃ��������b�Z�[�W���쐬���\�����܂��B
				final String errorMessage = String.format(
					"'%s' �͑��݂��܂���B%d�A%d�A%d �̂����ꂩ����͂��Ă��������B",
						yourInput, Pochama, Naetoru, Hikozaru);
				System.out.println(errorMessage);
		}
		
			
			
				final int cpu =rand.nextInt(Cpu_Poke);
						
				
				if(yourPoke == 0) {
					System.out.println("���Ȃ��̃|�P����: �|�b�`���}");
				}else if(yourPoke == 1) {
					System.out.println("���Ȃ��̃|�P����: �i�G�g��");
				}else if(yourPoke == 2) {
					System.out.println("���Ȃ��̃|�P����: �q�R�U��");
				}
				
				if(cpu == 0) {
					System.out.println("�����Ẵ|�P����: �|�b�`���}");
				}else if(cpu == 1) {
					System.out.println("�����Ẵ|�P����: �i�G�g��");
				}else if(cpu == 2) {
					System.out.println("�����Ẵ|�P����: �q�R�U��");
				}
					
	

	}
}