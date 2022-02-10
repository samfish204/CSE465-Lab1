
/* NOTE: Some words are not allowed in this file:
   'f o r'  is not allowed
   'w h i l e' is not allowed. 
   You can not even use them in comments!
*/

public class Counter {
	/* TODO: Write a recursive function here. Call it 'printAll'. 
           See README.md to get more instructions, look at Counter.expected to see desired output. 
	   No variable or loops allowed.
	   No calling another builtin/3rd-party function that just solves the problem!
	   You may pass whatever parameters are helpful to the 'printAll' function.
	   Non-recursive solutions will receive a zero when the grader sees them. 
	*/

        public static void printAll(String result, int beg, int end) {
              if (beg == end) {
                  System.out.print("" + result + "\n");
                  return;
              }
              printAll(result + '0', beg + 1, end);
              printAll(result + '1', beg + 1, end);
        }
//            if (i == 0) {
//              s = "0";
//            } else if (i == 1) {
//              s = "1";
//            } else if (i == n) {
//              return;
//            }

//            s += "0";
//            printAll(n, s, i + 1);
//            System.out.print(s);


//            s += "1";
//            printAll(n, s, i + 1);
//            System.out.print(s);

	public static void main(String[] args){
		//TODO: Call `printAll`
            String s = "";
            printAll("", 0, 8);
	}
}
