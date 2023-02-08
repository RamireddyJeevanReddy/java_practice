
import java.util.regex.*;

class Username{

	
	public static boolean isValidUsername(String name)
	{

		
		String regex = "^[A-Za-z]\\w{7,30}$";

		
		Pattern p = Pattern.compile(regex);

		
		if (name == null) {
			return false;
		}

		Matcher m = p.matcher(name);

		
		return m.matches();
	}

	
	public static void main(String[] args)
	{

		
		String str1 = "8";
		System.out.println(isValidUsername(str1));

		
		String str3 = "julia";
		System.out.println(isValidUsername(str3));

		
		String str5 = "Samantha_21";
		System.out.println(isValidUsername(str5));
	}
}
