package token_tkn1;

public class A1 implements Cloneable{

	public static void main(String[] args) {
		A1 a1= new A1();
		try {
			A1 a2=(A1)a1.clone();
			System.out.println(a1.hashCode());
			//hasCode() convert the hexadecimal value to the integer value...
			for(int i=0;i<20;i++) {
			System.out.println(a2.hashCode());
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
