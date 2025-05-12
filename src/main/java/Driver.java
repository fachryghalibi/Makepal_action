import src.main.java.Counter;

public class driver {

	public static void main(String[] args) {
		
		Counter counter = new counter();
		
		System.out.println("Current Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current Count:" + counter.getCount());
		
	}

}
