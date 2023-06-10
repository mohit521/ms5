package new_one;
import java.util.Scanner;
public class Reg{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want : ");
		String str=sc.next();
		String regex="[6-9][0-9]{9}";
		//to make the alphabet accessible we are using "[a-zA-Z]+\\.?";
		if(str.matches(regex)) {
			System.out.println("valid number ");
		}
		else {
			System.out.println("Invalid number ");
		}

	
	}

}
/*
 main(){
 Pattern p=Pattern.compile("a*");//a? give individual a located in the string
 Matcher m=p.matcher("hseduwhuaaasasasa");
 while(m.find()){
 sop(m.start()+"...."+m.group());
 }
 }
*/
