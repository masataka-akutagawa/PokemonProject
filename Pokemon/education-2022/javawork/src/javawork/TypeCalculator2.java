package javawork;

import java.util.Arrays;

public class TypeCalculator2 {



		private double relation = 1;
		public TypeCalculator2(String aType, String defType1) {

			String[] defTypelist = {defType1};

			Arrays.stream(defTypelist).forEach(str -> {

				//�����^�C�v�̂�������
				if(aType == "����") {
					//�������͂΂������
					if(str == "�݂�" || str == "���߂�" || str == "����") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "����" || str == "�ق̂�" || str == "�Ђ���" || str == "�͂���" || str == "�h���S��" || str == "�ǂ�" || str == "�ނ�") {
						relation /= 2;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�ق̂��^�C�v�̂�������
				else if(aType == "�ق̂�") {
					//�������͂΂������
					if(str == "����" || str == "�ނ�" || str == "�͂���" || str == "������") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�݂�" || str == "�ق̂�" || str == "����" || str == "�h���S��") {
						relation /= 2;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�݂��^�C�v�̂�������
				else if(aType == "�݂�") {
					//�������͂΂������
					if(str == "�ق̂�" || str == "���߂�" || str == "����"){
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�݂�" || str == "����" || str == "�h���S��") {
						relation /= 2;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�m�[�}���^�C�v�̂�������
				else if(aType == "�m�[�}��") {
					//�������͂΂������

					//�������͂��܂ЂƂ���
					if(str == "����" || str == "�͂���") {
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "�S�[�X�g")  {
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�ł񂫃^�C�v�̂�������
				else if(aType == "�ł�") {
					//�������͂΂������
					if(str == "�݂�" || str == "�Ђ���") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�ł�" || str == "����" || str == "�h���S��") {
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "���߂�") {
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//������^�C�v�̂�������
				else if(aType == "������") {
					//�������͂΂������
					if(str == "����" || str == "�Ђ���" || str == "�h���S��") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�݂�" || str == "������" || str == "�͂���" || str == "�ق̂�") {
						relation /= 2;
					}
					//�������Ȃ�����
					//�������������
					else {
						relation *= 1;
					}
				}
				//�����Ƃ��^�C�v�̂�������
				else if(aType == "�����Ƃ�") {
					//�������͂΂������
					if(str == "����" || str == "������" || str == "�m�[�}��" || str == "�͂���" || str == "����") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�Ђ���" || str == "�G�X�p�[" || str == "�t�F�A���[" || str == "�ނ�" || str == "�ǂ�"){
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "�S�[�X�g"){
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�ǂ��^�C�v�̂�������
				else if(aType == "�ǂ�") {
					//�������͂΂������
					if(str == "����" || str == "�t�F�A���["){
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�ǂ�" || str == "���߂�" || str == "����" || str == "�S�[�X�g"){
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "�͂���"){
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//���߂�^�C�v�̂�������
				else if(aType == "���߂�"){
					//�������͂΂������
					if(str == "�ق̂�" || str == "����" || str == "�͂���" || str == "�ǂ�" || str == "�ł�"){
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "����" || str == "�ނ�") {
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "�Ђ���") {
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�Ђ����^�C�v�̂�������
				else if(aType == "�Ђ���"){
					//�������͂΂������
					if(str == "����" || str == "�ނ�" || str == "�����Ƃ�") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�ł�" || str == "����" || str == "�͂���") {
						relation /= 2;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�G�X�p�[�^�C�v�̂�������
				else if(aType == "�G�X�p�[") {
					//�������͂΂������
					if(str == "�����Ƃ�" || str == "�ǂ�"){
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�͂���" || str == "�G�X�p�["){
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "����"){
						relation *= 0;
 					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�ނ��^�C�v�̂�������
				else if(aType == "�ނ�") {
					//�������͂΂������
					if(str == "����" || str == "�G�X�p�[" || str == "����") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�͂���" || str == "�ق̂�" || str == "�Ђ���" || str == "�ǂ�" || str == "�����Ƃ�" || str == "�t�F�A���[" || str == "�S�[�X�g") {
						relation /= 2;
					}
					//�������Ȃ�����
					//�������������
					else {
						relation *= 1;
					}
				}
				//����^�C�v�̂�������
				else if(aType == "����"){
					//�������͂΂������
					if(str == "�ق̂�" || str == "�ނ�" || str == "�Ђ���" || str == "������") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�͂���" || str == "�����Ƃ�" || str == "���߂�") {
						relation /= 2;
					}
					//�������Ȃ�����
					//�������������
					else {
						relation *= 1;
					}
				}
				//�S�[�X�g�^�C�v�̂�������
				else if(aType == "�S�[�X�g") {
					//�������͂΂������
					if(str == "�G�X�p�[" || str == "�S�[�X�g") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "����"){
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "�m�[�}��") {
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�h���S���^�C�v�̂�������
				else if(aType == "�h���S��") {
					//�������͂΂������
					if(str == "�h���S��"){
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�͂���") {
						relation /= 2;
					}
					//�������Ȃ�����
					else if(str == "�t�F�A���[") {
						relation *= 0;
					}
					//�������������
					else {
						relation *= 1;
					}
				}
				//�͂��˃^�C�v�̂�������
				else if(aType == "�͂���"){
					//�������͂΂������
					if(str == "����" || str == "������" || str == "�t�F�A���[") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�͂���" || str == "�ق̂�" || str == "�݂�" || str == "�ł�") {
						relation /= 2;
					}
					//�������Ȃ�����

					//�������������
					else {
						relation *= 1;
					}
				}
				//�����^�C�v�̂�������
				else if(aType == "����") {
					//�������͂΂������
					if(str == "�G�X�p�[" || str == "�S�[�X�g"){
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "����" || str == "�t�F�A���[" || str == "�����Ƃ�") {
						relation /= 2;
					}
					//�������Ȃ�����

					//�������������
					else {
						relation *= 1;
					}
				}
				//�t�F�A���[�^�C�v�̂�������
				else if(aType == "�t�F�A���["){
					//�������͂΂������
					if(str == "�����Ƃ�" || str == "�h���S��" || str == "����") {
						relation *= 2;
					}
					//�������͂��܂ЂƂ���
					else if(str == "�ق̂�" || str == "�ǂ�" || str == "�͂���") {
						relation /= 2;
					}
					//�������Ȃ�����

					//�������������
					else {
						relation *= 1;
					}
				}
			});

			//�{���̃��^�[��
			if(relation >= 2) {
				System.out.println("�������͂΂���!!!");
			}
			else if(relation == 0) {
				System.out.println("�������͂Ȃ��悤��...");
			}
			else if(relation < 1) {
				System.out.println("�������͂��܂ЂƂ̂悤��...");
			}

		}

		public double getResult() {
			return relation;
		}
	}


