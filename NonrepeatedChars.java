package Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class NonrepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SILLYSPIDERS";
		LinkedHashMap hm=new LinkedHashMap();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				int c=(int)hm.get(s.charAt(i));
				c++;
				hm.put(s.charAt(i), c);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		ArrayList key=new ArrayList(hm.keySet());
		ArrayList value=new ArrayList(hm.values());
		for(int i=0;i<=key.size()-1;i++)
		{
			if((int)value.get(i)>1)
			{
				
			}
			else
			{
				System.out.print(key.get(i)+" ");
			}
		}
	}

}
