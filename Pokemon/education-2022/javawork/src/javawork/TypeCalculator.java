package javawork;

import java.util.*;

public class TypeCalculator {

	public static ArrayList<String> getNotEffectiveTypes(String type) {
		if (type.equals("����")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("����");
			notEffectiveTypes.add("�ق̂�");
			return notEffectiveTypes;
			}
		else if (type.equals("�ق̂�")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("�݂�");
			notEffectiveTypes.add("�ق̂�");
			return notEffectiveTypes;
		}
		else if (type.equals("�݂�")) {
			ArrayList<String> notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("����");
			notEffectiveTypes.add("�݂�");
			return notEffectiveTypes;
		}else if(type.equals("�m�[�}��")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			return notEffectiveTypes;
		}
		else {
			return null;
		}
		
				
	}
	
	public static ArrayList<String> getEffectiveTypes(String type) {

		if (type.equals("����")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("�݂�");
			return effectiveTypes ;
		}
		else if (type.equals("�ق̂�")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("����");
			return effectiveTypes ;
		}
		else if (type.equals("�݂�")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("�ق̂�");
			return effectiveTypes ;
			
		}else if(type.equals("�m�[�}��")) {
			ArrayList<String>  effectiveTypes = new ArrayList<String>();
			return effectiveTypes;
		}
		
		else {
			return null;
			
		}
		
	}
}