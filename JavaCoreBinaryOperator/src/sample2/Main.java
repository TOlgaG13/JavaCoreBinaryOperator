package sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<List<Integer>> commonElements = (list1, list2) -> {
			List<Integer> result = new ArrayList<>();
			for (Integer num : list1) {
				if (list2.contains(num)) {
					result.add(num);
				}
			}
			return result;
		};

		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> list2 = List.of(3, 4, 5, 6, 7, 8, 9, 6);
		System.out.println(commonElements.apply(list1, list2)); 
	}
}
