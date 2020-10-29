package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="amlayalam";
		LinkedHashSet hs=new LinkedHashSet();
		for(int i=0;i<=s.length()-1;i++)
		{
			hs.add(s.charAt(i));
		}
		ArrayList al=new ArrayList(hs);
		String t="";
		for(int i=0;i<=al.size()-1;i++)
		{
			t=t+al.get(i);
		}
		System.out.println(t);
	}

}
