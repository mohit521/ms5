package wait_notify;

public class C extends Thread {
	String name;
	C(String name){
		this.name=name;
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		C p1=new C("xxxx");
		C p2=new C("yyyy");
		p1.setName("mohit");
		p2.setName("singh");
		System.out.println(p2.getName());
		System.out.println(p1.getName());
		
		p1.start();
		p2.start();
		//setName() and getName for the thread ...

	}
public void run() {
	System.out.println("run the way you want ");
}
}
