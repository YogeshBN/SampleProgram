package assignment1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Act1 {
	public static void main(String[] args) throws Exception
	{
		
		FileOutputStream obj=new FileOutputStream("C:\\Users\\lenovo\\Java File concept\\Batch mates.txt", true);
		String str1="Yogi";
		String str2="Surya";
		String str3="Ramesh";
		String str4="Gokul";
		String str5="Jaya";
		String str6="Kamlesh";
		obj.write(str1.getBytes());
		obj.write(str2.getBytes());
		obj.write(str3.getBytes());
		obj.write(str4.getBytes());
		obj.write(str5.getBytes());
		obj.write(str6.getBytes());
		System.out.println("File created and data written into file!");
		obj.close();
	

}}

	
