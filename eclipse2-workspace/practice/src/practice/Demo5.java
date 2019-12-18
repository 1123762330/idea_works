package practice;

class Demo5 {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 7, 8, 9, 5, 7 };
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
				if (arr[a] < arr[b]) {
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
		}
		System.out.println("max = "+arr[arr.length-1]);
	}
}