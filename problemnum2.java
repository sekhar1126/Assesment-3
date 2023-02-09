package Assessment3;

public class problemnum2 {
	public static String moveSpecialCharacters(String str) {
	   String sc="[A-Za-z0-9]";
	   String k1=" ",k2="";
	   for(int i=0;i<str.length();i++) {
		   char k = str.charAt(i);
		   if(String.valueOf(k).matches(sc)) {
			   k1=k1+k;
		   }else
		   {
			   k2=k2+k;
		   }
	   }
		   return k1+k2;
	   
	}

	public static void main(String[] args) {
		String s1="He@#$llo!*&";
		String s2="%$Wel*&come!";
		
		System.out.println(moveSpecialCharacters(s1));
		System.out.println(moveSpecialCharacters(s2));
		

	}

}
