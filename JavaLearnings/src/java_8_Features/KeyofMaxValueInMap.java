package java_8_Features;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class KeyofMaxValueInMap {
	
	@Test
	public void dataSetOne()
	{
		String paragraph="Bob. hIt, baLl";
		List<String> banned=new LinkedList<>(Arrays.asList(new String[] {"hit","bob"} ));
		System.out.println(commonWord(paragraph,banned));
	}
	
	@Test
	public void dataSetTwo()
	{
		String paragraph="Bob hit a ball, the hit BALL flew far after it was hit ball";
		List<String> banned=new LinkedList<>(Arrays.asList(new String[] {"hit"} ));
		System.out.println(commonWord(paragraph,banned));
	}
	
	
	@Test
	public void dataSetThree()
	{
		String paragraph="Bob hit a ball, the hit BALL flew far far after it was hit";
		List<String> banned=new LinkedList<>(Arrays.asList(new String[] {"hit"} ));
		//System.out.println(commonWord(paragraph,banned));
	}
	
	private String commonWord(String input,List<String> banned)
	{
		//input=input.toLowerCase();
		String[] inputArray=input.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
		int max=0;String Output="";
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<inputArray.length;i++)
		{
			if(!banned.contains(inputArray[i]))
			{
				map.put(inputArray[i], map.getOrDefault(inputArray[i], 0)+1);
//				
//				if(map.get(inputArray[i])>=max)
//				{
//					max=map.get(inputArray[i]);
//					Output=inputArray[i];
//					
//				}
			}
		}
	return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
			
	}

}
