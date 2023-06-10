
public class A
{
	
	int balance=0;

	public static void main(String[] args)
{
		A a1=new A();
		a1.account();
	
}
	public void account()
	{
		Thread t1=new Thread(new Runnable() 
		   {
			public void run() {
				add();
			}
		});
		Thread t2=new Thread(new Runnable() 
		   {
			public void run() {
				sub();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		    }
		 catch(Exception e)
		    {
			System.out.println(e);
		    }
		
	  }
public synchronized void add()
{
		for(int i=0;i<1000;i++) 
		{
			balance=balance+i;
			System.out.println(balance);
		}		
}
public synchronized void sub()
   {
	for(int i=0;i<1000;i++)
	  {
		balance=balance-i;
	System.out.println(balance);
	
      }
   }
}
