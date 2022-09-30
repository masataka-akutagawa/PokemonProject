package javawork;

import java.util.*;

public class TypeCalculator {

	public static ArrayList<String> getNotEffectiveTypes(String type) {
		if (type.equals("くさ")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("くさ");
			notEffectiveTypes.add("ほのお");
			return notEffectiveTypes;
			}
		else if (type.equals("ほのお")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("みず");
			notEffectiveTypes.add("ほのお");
			return notEffectiveTypes;
		}
		else if (type.equals("みず")) {
			ArrayList<String> notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("くさ");
			notEffectiveTypes.add("みず");
			return notEffectiveTypes;
		}else if(type.equals("ノーマル")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			return notEffectiveTypes;
		}
		else {
			return null;
		}
		
				
	}
	
	public static ArrayList<String> getEffectiveTypes(String type) {

		if (type.equals("くさ")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("みず");
			return effectiveTypes ;
		}
		else if (type.equals("ほのお")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("くさ");
			return effectiveTypes ;
		}
		else if (type.equals("みず")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("ほのお");
			return effectiveTypes ;
			
		}else if(type.equals("ノーマル")) {
			ArrayList<String>  effectiveTypes = new ArrayList<String>();
			return effectiveTypes;
		}
		
		else {
			return null;
			
		}
		
	}
}