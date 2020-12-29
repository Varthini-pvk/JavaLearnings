package java_8_Features;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertNestedListTo2DArray 
{

	public static void main(String[] args) {
		List<List<Integer>> TwoDArray=new LinkedList<>();
		TwoDArray.add(Arrays.asList(new Integer[] {1,3,4}));
		TwoDArray.add(Arrays.asList(new Integer[] {2,3,4}));
		TwoDArray.add(Arrays.asList(new Integer[] {3,3,4}));
		TwoDArray.add(Arrays.asList(new Integer[] {4,3,4}));
		
		Integer[][] k = TwoDArray.stream().map(x->x.toArray(new Integer[x.size()])).toArray(Integer[][]::new);
		
		System.out.println(Arrays.deepToString(k));
		
	}
}
