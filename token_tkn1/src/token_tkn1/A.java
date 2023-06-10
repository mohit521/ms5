package token_tkn1;
import java.util.StringTokenizer;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		@SuppressWarnings("resource")//annotation means variable created but don't have any use ...
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		StringTokenizer str1=new StringTokenizer(str);
		StringTokenizer str2=new StringTokenizer("26-11-2014 ","-");
		int count1=0;
		int count2=0;
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
			count1++;
		}
		System.out.println(count1);
		
		
		System.out.println("___________________________________________________________________");
		System.out.println();
		
		
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
			count2++;
		 }
		System.out.println(count2);

	}

}
