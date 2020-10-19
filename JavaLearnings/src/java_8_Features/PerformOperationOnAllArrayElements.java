package java_8_Features;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PerformOperationOnAllArrayElements {
	
	public static void main(String[] args) 
	{
		
		//1. Method--> mapToObj
		int[] input= {100,200,494334,3432423,7676,767613,333,333,3432423};
		System.out.println(Arrays.stream(input).mapToObj(i->i*(-1)).collect(Collectors.toSet()));
		
	}

}
