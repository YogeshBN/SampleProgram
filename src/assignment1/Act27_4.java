package assignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Singer
{
	String title;
	String name;
	
	public Singer(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Singer [title=" + title + ", name=" + name + "]";
	}
}
class NameComparator implements Comparator<Singer>
{
@Override
	public int compare(Singer o1, Singer o2) {
	return o1.name.compareTo(o2.name);//String compareTo()
		}
	
}


public class Act27_4
{
	public static void main(String[] args) 
	{
		ArrayList<Singer> obj=new ArrayList<>();
		obj.add(new Singer("BGM","Dsp"));
		obj.add(new Singer("BGM","Yuvan"));
		obj.add(new Singer("Melody","Harris"));
		obj.add(new Singer("Gana","Sana"));
		obj.add(new Singer("Rock","Adhi"));

		System.out.println("Before Sorting::");
		for(Singer t:obj)
		{
			System.out.println(t);
		}
		System.out.println("Sorting(Based on Singer name's)::");
	Collections.sort(obj, new NameComparator());
		for(Singer t:obj)
		{
			System.out.println(t);
		}
		

	}

}