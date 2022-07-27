package Java_Program;

import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class cal_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abbsdfsdassda";
		HashedMap<Character, Integer> mp=new HashedMap<>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char charvalue=s.charAt(i);
			
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue, mp.get(charvalue)+1);
			}
			else
			{
				mp.put(charvalue, 1);
			}
		}
		
		Set<Character> keys=mp.keySet();

		for(Character key:keys)
		{
			System.out.println(key+":"+mp.get(key));
		}
		
	}

}
