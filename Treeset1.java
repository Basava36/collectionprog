package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs=new TreeSet();
		hs.add(101);
		hs.add(11);
		hs.add(1);
		hs.add(5);
		hs.add(11);
		hs.add(11);
		hs.add(11);
	ArrayList al=new ArrayList(hs);
	for(int i=0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	}

}
