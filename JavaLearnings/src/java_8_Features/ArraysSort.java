package java_8_Features;

import java.util.Arrays;

import org.junit.Test;

public class ArraysSort 

{

	
	//Sort 2D arrays
	@Test
	public void dataSetOne()
	{
		int[][] mobiles= {{2,2,5},{3,2,0},{1,3,8}};
		sortbyfirstValue(mobiles);
		sortbyThirdValue(mobiles);
		sortbyMethod(mobiles);
		
	}
	
	public void sortbyfirstValue(int[][] input)
	{
		Arrays.sort(input, (a,b)->a[0]-b[0]);
		System.out.println("By first coloumn");
		System.out.println(Arrays.deepToString(input));

	}
	
	public void sortbyThirdValue(int[][] input)
	{
		Arrays.sort(input, (a,b)->a[2]-b[2]);
		System.out.println("By Third coloumn");
		System.out.println(Arrays.deepToString(input));

	}
	
	public void sortbyMethod(int[][] input)
	{
		Arrays.sort(input, (a,b)->dist(a)-dist(b));
		System.out.println("By a method");
		System.out.println(Arrays.deepToString(input));

	}
	
	private int dist(int[] point)
	{
		return point[0]*point[0]+point[1]*point[1];
	}
}
