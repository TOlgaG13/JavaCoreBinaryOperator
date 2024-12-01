package sample3;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<List<Integer>> listWithMinElement = (list1, list2) -> {
            int min1 = findMin(list1);
            int min2 = findMin(list2);
            return (min1 <= min2) ? list1 : list2;
        };

        List<Integer> list1 = List.of(5, 0, 3, 4);
        List<Integer> list2 = List.of(10, -2, 5);
        System.out.println(listWithMinElement.apply(list1, list2)); 
    }
	private static int findMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
	


