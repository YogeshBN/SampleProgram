package assignment1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class employee implements Serializable//marker interface--now this class eligible for SERIALIZATION
{
    int emp_id;
    String name;
	private transient int emp_sal;
	
	
public employee(int emp_id, String name, int emp_sal) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.emp_sal = emp_sal;
	
}


@Override
public String toString() {
	return "employee [emp_id=" + emp_id + ", name=" + name + ", emp_sal=" + emp_sal + "]";
}


}
public class Act3 {

	public static void main(String[] args) throws Exception {
		employee emp1=new employee(1001,"Ramesh",25000);

		employee emp2=new employee(1002,"Surya",30000);

		employee emp3=new employee(1003,"Gokul",60000);
	
				
		FileOutputStream obj=new FileOutputStream("C:\\Users\\lenovo\\Java File concept\\Employee.ser");
		ObjectOutputStream emp4=new ObjectOutputStream(obj);
		emp4.writeObject(emp1);
		emp4.writeObject(emp2);
		emp4.writeObject(emp3);
		
		System.out.println("Employee Data Serialized or Persisted!");		
		emp4.close();
		
		
		FileInputStream obj1=new FileInputStream("C:\\Users\\lenovo\\Java File concept\\Employee.ser");
		ObjectInputStream emp5=new ObjectInputStream(obj1);
		employee emp6;
		while(obj1.available() != 0)
		{
			emp6 = (employee) emp5.readObject();
			System.out.println("Employee Data Deserialized:: "+emp6.toString());
		}
		emp5.close();
	}

	

}