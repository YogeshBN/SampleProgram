package myproject;
import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {

		HashMap<String,Double> obj=new HashMap<String,Double>();
	

		obj.put("aaa",43343.434);
		obj.put("bbb",43434.434);
		obj.put("ccc",43436.434);
		obj.put(null,4343.434);
		
		obj.put("ddd",43443.434);
		obj.put("eee",88654.787);
		obj.put("fff",83454.787);
	
		System.out.println("HashMap(Unordered):: "+obj.toString());//both key and value!
		System.out.println("HashMap(Size):: "+obj.size());
		
		for(String s:obj.keySet())
		{
					System.out.println("Key:: "+s);
		}
		
		for(Double d1:obj.values())
		{
			System.out.println("Value:: "+d1);
		}
		Double b1=obj.get("aaa");	
		obj.put("aaa", b1+10000);
		System.out.println("After Update:: "+obj.get("aaa"));


		for(Map.Entry<String, Double> s1: obj.entrySet())
		{
			System.out.println("Key&Value:: "+s1.getKey() + " "+s1.getValue());
		}
		obj.remove("Priya");
		System.out.println("After Remove:: "+obj.toString());


	}

}