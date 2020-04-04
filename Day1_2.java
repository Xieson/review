package Day_1;

import java.util.Arrays;

public class Day1_2 {
	public static void main(String[] args) {
		int[] arr= {1,2,12,123,12,3123,123,12};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}
