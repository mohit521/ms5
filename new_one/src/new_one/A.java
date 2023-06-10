package new_one;

public class A implements Runnable {
	String name;
	A(String name ){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println(this.name);
		}
	}
	

	public static void main(String[] args) {
		A a1=new A("xxxx");
		Thread t1= new Thread(a1);
		A a2=new A("yyy");
		Thread t2= new Thread(a2);
		A a3= new A("zzzz");
		Thread t3= new Thread(a3);
		t1.start();
		t2.start();
		t3.start();

	}

}
