package javawork;

import java.util.*;

public class TypeCalculator {

	public static ArrayList<String> getNotEffectiveTypes(String type) {
		if (type.equals("Ç≠Ç≥")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("Ç≠Ç≥");
			notEffectiveTypes.add("ÇŸÇÃÇ®");
			return notEffectiveTypes;
			}
		else if (type.equals("ÇŸÇÃÇ®")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("Ç›Ç∏");
			notEffectiveTypes.add("ÇŸÇÃÇ®");
			return notEffectiveTypes;
		}
		else if (type.equals("Ç›Ç∏")) {
			ArrayList<String> notEffectiveTypes = new ArrayList<String>();
			notEffectiveTypes.add("Ç≠Ç≥");
			notEffectiveTypes.add("Ç›Ç∏");
			return notEffectiveTypes;
		}else if(type.equals("ÉmÅ[É}Éã")) {
			ArrayList<String>  notEffectiveTypes = new ArrayList<String>();
			return notEffectiveTypes;
		}
		else {
			return null;
		}
		
				
	}
	
	public static ArrayList<String> getEffectiveTypes(String type) {

		if (type.equals("Ç≠Ç≥")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("Ç›Ç∏");
			return effectiveTypes ;
		}
		else if (type.equals("ÇŸÇÃÇ®")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("Ç≠Ç≥");
			return effectiveTypes ;
		}
		else if (type.equals("Ç›Ç∏")) {
			ArrayList<String> effectiveTypes = new ArrayList<String>();
			effectiveTypes.add("ÇŸÇÃÇ®");
			return effectiveTypes ;
			
		}else if(type.equals("ÉmÅ[É}Éã")) {
			ArrayList<String>  effectiveTypes = new ArrayList<String>();
			return effectiveTypes;
		}
		
		else {
			return null;
			
		}
		
	}
}