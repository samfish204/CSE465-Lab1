
public class Counter {
        public static void printAll(String prefix, int digitsRemaining){
		if (digitsRemaining == 0){
			System.out.println(prefix);
		} else {
		     printAll(prefix + "0", digitsRemaining-1);
		     printAll(prefix + "1", digitsRemaining-1);
		}
	}

	public static void main(String args[]){
		printAll("", 8);			
	}
}
