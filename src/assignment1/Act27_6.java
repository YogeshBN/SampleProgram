package assignment1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Act27_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","c##yogi","oracle");
				
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Serial Number(Sno): ");
		int au = sc1.nextInt();
		sc1.nextLine();
		System.out.println("Add atomic weight: ");
		float bu = sc1.nextFloat();
		
		String query2="update Element set atomic_weight=atomic_weight+? where Sno=?";
		PreparedStatement ps2=con.prepareStatement(query2);
		
		ps2.setFloat(1, bu);
		ps2.setInt(2,au);
		
		int rows1=ps2.executeUpdate();
		if(rows1>=1)
		{
			System.out.println("Record Exist!");
			System.out.println(rows1+ " Record Updated!");
		}
		else
		{
			System.out.println("Record Not Exist!");
		    System.out.println(rows1+ " Record Updated!");			
		}
		PreparedStatement ps12=con.prepareStatement("select * from Element");
		ResultSet rs1=ps12.executeQuery();
		while(rs1.next())
		{
			int a1=rs1.getInt(1);
			float b1=rs1.getFloat(2);
			String c1=rs1.getString(3);
			String d1=rs1.getString(4);
			System.out.println(a1+ " "+b1 + " "+c1+ " "+d1);
		}
		rs1.close();
		
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Serial Number(SNo): ");
		int a = sc.nextInt();
		sc.nextLine();
		
		String query1= "delete from element where SNo=?";
		PreparedStatement ps1=con.prepareStatement(query1);
		
		ps1.setInt(1, a);
		
		int rows=ps1.executeUpdate();
		if(rows>=1)
		{
			System.out.println("One User Successfully Deleted");
			System.out.println(rows+"Record Deleted");
		}
		else
		{
			System.out.println("Record Not Exist!");
			System.out.println(rows+ " Record Updated!");	
		}
		
		PreparedStatement ps11=con.prepareStatement("select * from Element");
		ResultSet rs=ps11.executeQuery();
		while(rs.next())
		{
			int a1=rs.getInt(1);
			float b1=rs.getFloat(2);
			String c1=rs.getString(3);
			String d1=rs.getString(4);
			System.out.println(a1+ " "+b1 + " "+c1+ " "+d1);
		}
		
		rs.close();
		con.close(); 
	}

}