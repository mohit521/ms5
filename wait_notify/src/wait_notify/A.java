package wait_notify;

public class A {

	public static void main(String[] args) {
		B b1=new B();
		b1.start();
		synchronized (b1) {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(b1.total);

	}

}
//Notes
//way to create the thread
//extends Thread 
//Implements Runnable
//NEW____RUNNABLE____RUNNING____TERMINATES
//_________from new to terminates path are:
//_______SLEEP/WAIT___wait(notify())________terminates
/* public class A extends Thread{
main(){
A a1=new A();
sout(a1.getState());
a1.start();
try{
Thread.sleep(5000);
}
catch(e){

}
sop();
}
public void run(){
sop();
}
}
*/