package assignment1;
class Tank{
	boolean filled = false;
public void fill(){
		filled = true;
	}
	public void empty(){
		filled = false;
	}
	protected void finalize() {
		if(filled)
		System.out.println("You're throwing away a full tank of nothing!");
		}
}
public class Garbage_collection {
	public static void main(String[] args){
		Tank bigtank = new Tank();
		System.out.println("Initial fillness for tank is " + bigtank.filled);
		bigtank.fill();
		System.out.println("Filled fillness is " + bigtank.filled);
		System.gc(); 
		new Tank();
		System.out.println("Tank respawn fillness is still " + bigtank.filled);
		bigtank.empty();
		System.out.println("Emptied fillness is " + bigtank.filled);
		System.gc(); 
	}
}

