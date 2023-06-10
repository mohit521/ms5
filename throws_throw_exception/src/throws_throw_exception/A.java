package throws_throw_exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-zA-Z0-9]");
		// (^)symbol used to accept the rest other than the one which is mentioned with it...
		//    ( \\s)  it is used to find the other character rest than the  white spaces in the string...when we put it in the compiler...(\\d)  for digit in string
		//     (\\w) for the all upper and lower case digit (\\W) used for the special character and the spaces... 
		//search these in the given matcher...
		 Matcher m=p.matcher("a2%#bc$D");
		//it help the pattern to find in it self where these letter or word is belonging...
		 while(m.find()) {
			System.out.println(m.start()+" ....."+m.group());
		}
		
	}

}
