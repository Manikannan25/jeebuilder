package day3_stringmethods;

public class Toseprateword {
	public static void main(String args[])
	{
		String word="helloworld";
		String words[]=word.split("o");
		System.out.println(words[0]+"\n"+words[1]+"\n"+words[2]);
		System.out.println(words);
	}
}
