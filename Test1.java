package day3_stringmethods;

public class Test1 {
	public static void main(String args[])
	{
		String firstname="raja";
		String lastname="raman";
		String result=firstname.concat(lastname);
		String result1=result.toUpperCase();
		int length=result1.length();
		System.out.println(result1+"\n"+length);
		
	}

}
