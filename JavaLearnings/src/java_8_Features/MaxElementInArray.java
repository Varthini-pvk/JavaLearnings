package java_8_Features;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxElementInArray {
	
	public static void main(String[] args) {
		
		int[] input= {100,200,494334,3432423,7676,767613,333,333,3432423};
		System.out.println(Arrays.stream(input).max().getAsInt());

		
	}
	
	
}
