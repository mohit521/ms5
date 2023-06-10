package set_hash_tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Set1 {
//HashSet and TreeSet
//Map is another interface...
//PriorityQueue...
	//set:
	/*
	 its an interface
	 does not maintain any insertion order...
	 can't contain duplicate value...
	 it uses hashTable internally...
	 
	 */
	
	public static void main(String[] args) {
		HashSet a=new HashSet();
		//it is non synchronized in nature...
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println(a);
		
		//____________________________________________________
		//____________________________________________________
		//____________________________________________________
		
		
		//it is  synchronized in nature...
		LinkedHashSet b=new LinkedHashSet();
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		System.out.println(b);
		
		
		//________________________________________________________
		//________________________________________________________
		//________________________________________________________
		//we can use the generic with the help of < > with Set...
		//Its is used to sort the data 
		// it is synchronized in nature ...
		TreeSet c= new TreeSet();
		c.add(20);
		
		c.add(30);
		c.add(40);
		c.add(105);
		c.add(60);
		System.out.println(c);
		
		
		//_________________________________________________________
		//_________________________________________________________
		//_________________________________________________________
		
		//HashMap and HashSet
		//in HashMap everything is store in key value pair
		// In HashSet we are not storing the data in key pairs...
		//non synchronized in nature...
		
		HashMap<Integer,String> d= new HashMap<>();
		//HashMap or Map both are same...
        d.put(1,"mohit");
		d.put(2,"pawan");
		d.put(3,"chandan");
		d.put(5,"viku");
		d.put(4,"amit");
		System.out.println(d);
		System.out.println(d.get(4));
		//get is used to take that particular value of that particular key ...
		System.out.println(d.values());
		//values is used to take the only values ...
		System.out.println(d.keySet());
		
		
		//_________________________________________________________
		//________________________________________________________
		//________________________________________________________
		
		 Hashtable<Integer,String> e=new Hashtable<>();
		 //synchronized in nature...
		 //sort in decreasing order...
		    e.put(1,"mohit");
			e.put(2,"pawan");
			e.put(3,"chandan");
			e.put(6,"viku");
			e.put(5,"amit");
			System.out.println(e);
			System.out.println(e.keySet());
		
		
	}
}
