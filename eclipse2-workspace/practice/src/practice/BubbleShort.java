package practice;

public class BubbleShort {
	public static void main(String[] args) {
		int[] arr = { 29, 19, 8, 89, 23, 12, 19 };
		System.out.println("����ǰ�������:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			// j < arr.length-1 Ϊ�˱���Ǳ�Խ��
			// j < arr.length-1-i Ϊ�˱Ƚ�Ч��,�����ظ��Ƚ�
			// �ڲ�ѭ���������Ԫ��ֵ�Ƚϣ��Ѵ��Ԫ��ֵ����������
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("����������:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
