package day3_stringmethods;

public class Test3 {
	public static void main(String args[])
	{
	String world="Welcome to little world";
	String letters[]=world.split(" ");
	String result=letters[0].toUpperCase();
	char letters1[]=letters[1].toCharArray();
	String word=letters[2].concat(letters[3]);
	String word1=word.toUpperCase();
	String word2=letters[2].substring(1,5);
	char word3=letters[3].charAt(4);
	int word4=world.length();
	System.out.println(result+"\n"+letters1[0]+"\n"+letters1[1]+"\n"+word1+"\n"+word2+"\n"+word4);

}}
