 package assignment1;
import static java.lang.System.*;

public class Actstring1 {
	
	public static void main(String[] args) 
	{
		
		String a="The quick brown fox jumps over the lazy dog";
		String b="The quick brown Fox jumps over the lazy Dog";
		String c="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		out.println("Indexof(12):"+a.charAt(12));
		out.println("Is is the string is :"+a.contains("is"));
		out.println("After adding the given string:"+a +(" and killed it"));
		out.println("String ends with dogs: "+a.endsWith("dogs"));
		out.println("Equals to given string:"+a.equals(b));
		out.println("Equals to given string::"+a.equals(c));
		out.println("index(a):"+a.indexOf("a"));
		out.println("LastIndexof(e): "+a.lastIndexOf("e"));
		out.println("Length of the string is: "+a.length());
		out.println("String matches to given string: "+(a==b));
		out.println("String replace: "+a.replace("The","A"));
		out.println("String split: "+a.split("-"));
		out.println("String Lowercase: "+a.toLowerCase());
		out.println("String Uppercase: "+a.toUpperCase());
	}
}
