
public class Counter {
	/* TODO: Write a recursive function here. Call it 'printAll'. 
	You may pass whatever parameters are helpful. 
	*/
	
	public static void printAll(int n) {
		String s = String.format("%8s", Integer.toBinaryString(n));
		s= s.replace(" ", "0");
		System.out.println(s);
		if (n < 255){
			printAll(++n);
		}	
	}

	public static void main(String[] args){
		//TODO: Call `printAll`
		printAll(0);			
	}
}
