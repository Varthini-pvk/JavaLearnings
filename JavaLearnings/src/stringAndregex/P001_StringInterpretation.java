package stringAndregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

//Given a string, validate whether the string can be interpreted as numbers. 
//e.g. Str = "bde", Str="123", Str="2e-10


public class P001_StringInterpretation 
{
	@Test
	public void dataSetOne()
	{
		String input="bde";
		System.out.println("One: "+verifyIfNumber(input));
	}
	
	@Test
	public void dataSetTwo()
	{
		String input="2e-10";
		System.out.println("Two: "+verifyIfNumber(input));
	}
	
	@Test
	public void dataSetThree()
	{
		String input="123";
		System.out.println("Three: "+verifyIfNumber(input));
	}
	
	private Boolean verifyIfNumber(String input)
	{
		
		String[] patterns= {"\\d*","\\d*e-\\d*"};
		Pattern compile;Matcher matcher;
		for(int i=0;i<patterns.length;i++)
		{
			compile = Pattern.compile(patterns[i]);
			matcher=compile.matcher(input);
			if(matcher.matches()) return true;
					
		}
		return false;
	}
}
