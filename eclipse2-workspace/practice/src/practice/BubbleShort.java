package practice;

public class BubbleShort {
	public static void main(String[] args) {
		int[] arr = { 29, 19, 8, 89, 23, 12, 19 };
		System.out.println("排序前的順序是:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			// j < arr.length-1 为了避免角标越界
			// j < arr.length-1-i 为了比较效率,避免重复比较
			// 内层循环用来完成元素值比较，把大的元素值互换到后面
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("排序后的順序為:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
